package cn.edu.tongji.ranger.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.testng.Assert.*;

/**
 * Created by Sophie on 16/6/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:/Users/Sophie/beitai/Ranger/web/WEB-INF/applicationContext.xml") //使用junit4进行测试
public class CreateOrderformServiceTest {

    @Autowired
    private CreateOrderformService createOrderformService;

    @Test
    public  void Test1(){

    }
}