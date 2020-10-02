package org.example.dao;

import org.example.entity.Goods;

public interface GoodsDao {
    int updateGoods(Goods goods);
    Goods selectGoods(int gid);
}
