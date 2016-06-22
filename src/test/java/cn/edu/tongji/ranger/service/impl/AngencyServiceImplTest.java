package cn.edu.tongji.ranger.service.impl;

import cn.edu.tongji.ranger.dao.impl.AngencyDaoImpl;
import cn.edu.tongji.ranger.model.Angency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Sophie on 16/6/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration("file:/Users/Sophie/beitai/Ranger/src/test/java/cn/edu/tongji/ranger/service/impl/app-contex.xml")
public class AngencyServiceImplTest {




    @Test
    public void Test1(){
        AngencyDaoImpl angencyDaoImpl = new AngencyDaoImpl();

       // AngencyServiceImpl angencyServiceImpl = new AngencyServiceImpl();

        List<Angency> angency = angencyDaoImpl.findByName("haha");
        System.out.println(angency.size());
    }

}