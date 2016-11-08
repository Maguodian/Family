package com.family.test;

import com.family.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by maguodian on 16/10/31.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private Logger logger = Logger.getLogger(TestMyBatis.class);

    private UserService userService = new UserService();

    @Test
    public void test() {
        logger.info(userService.getUserById(1).getName());
    }
}
