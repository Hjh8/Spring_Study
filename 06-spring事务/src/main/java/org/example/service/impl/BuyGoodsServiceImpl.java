package org.example.service.impl;

import org.example.dao.GoodsDao;
import org.example.dao.SaleDao;
import org.example.entity.Goods;
import org.example.entity.Sale;
import org.example.exceptions.NotEnoughException;
import org.example.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyGoodsServiceImpl implements BuyGoodsService {

    private SaleDao saleDao;
    private GoodsDao goodsDao;

    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {}
    )
    @Override
    public void buy(int gid, int nums) {
        // 记录销售信息
        Sale sale = new Sale(gid, nums);
        saleDao.insertSale(sale);

        Goods s_goods = goodsDao.selectGoods(gid);
        if(s_goods == null) throw new NullPointerException(gid+"商品不存在");
        else if(s_goods.getAmount() < nums) throw new NotEnoughException(gid+"商品库存不足");

        // 更新库存
        Goods goods = new Goods(gid, nums);
        goodsDao.updateGoods(goods);
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
