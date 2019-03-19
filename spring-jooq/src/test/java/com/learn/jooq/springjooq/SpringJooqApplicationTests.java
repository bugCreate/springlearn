package com.learn.jooq.springjooq;

import com.learn.jooq.springjooq.dao.ConfigInfoDao;
import com.learn.jooq.springjooq.dao.ConfigInfoWithJPAAnnotated;
import com.learn.jooq.springjooq.repo.ConfigInfoRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJooqApplicationTests {

    @Autowired
    private ConfigInfoRepo configInfoRepo;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testPojo() {
        ConfigInfoDao record = configInfoRepo.query("test", "test", "test", "test");
        //record.forEach(System.out::println);
        System.out.println(record);
    }
    @Test
    public void testJPAAnnotated() {
        ConfigInfoWithJPAAnnotated record = configInfoRepo.query2("test", "test", "test", "test");
        //record.forEach(System.out::println);
        System.out.println(record);
    }

}
