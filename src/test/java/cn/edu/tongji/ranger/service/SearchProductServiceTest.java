package cn.edu.tongji.ranger.service;

import cn.edu.tongji.ranger.model.Location;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Sophie on 16/6/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:/Users/Sophie/beitai/Ranger/web/WEB-INF/applicationContext.xml") //使用junit4进行测试
public class SearchProductServiceTest {


    @Autowired
    private  SearchProductService searchProductService;

    @Test
    public void Test1()  {

        Location locationById = searchProductService.getLocationById(2L);
        System.out.println(locationById.getName());
    }


}