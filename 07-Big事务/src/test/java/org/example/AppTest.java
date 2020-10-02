package org.example;


import org.example.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        String config = "spring-config.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService)ac.getBean("goodsService");
        service.buy(1002, 100);
    }
}
