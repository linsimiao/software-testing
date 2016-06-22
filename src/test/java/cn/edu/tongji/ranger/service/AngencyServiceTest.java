package cn.edu.tongji.ranger.service;

import cn.edu.tongji.ranger.dao.AngencyDao;
import cn.edu.tongji.ranger.model.Angency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Sophie on 16/6/21.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:/Users/Sophie/beitai/Ranger/web/WEB-INF/applicationContext.xml") //使用junit4进行测试
public class AngencyServiceTest {

    @Autowired
    private AngencyService angencyService;

    @Test
    public void Test1(){

        List<Angency> angencies = angencyService.findExistAngency("1");
        for(int i = 0;i < angencies.size();i++){
            System.out.println(angencies.get(i).getAddress());
        }

//        Angency angency = new Angency();
//        angency.setId(15L);
//        angency.setName("baba's cheese cake");
//        angency.setCname("mama");
//        angency.setType("护照");
//        angency.setNumber("440882");
//        angency.setRnumber("123456");
//        angency.setPhone("131621");
//        angency.setEmail("125@126.com");
//        angency.setAddress("草案公路");
//        angency.setCertificate("bb.jpg");
//        angency.setBalance(12345.00);
//        angency.setBrief("会会爱的");
//        angency.setPassword("baba");
//
//        angencyService.update(angency);

    }


}