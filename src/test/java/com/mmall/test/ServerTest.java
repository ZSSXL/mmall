package com.mmall.test;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ServerTest {

    @Autowired
    private IUserService iUserService;

    @Test
    public void LoginTest(){
        ServerResponse<User> login = iUserService.login("admin", "admin");
        if(login.isSuccess()){
            System.out.println(login.getMsg());
        }
    }

    @Test
    public void SelectQuestionTest(){
        ServerResponse admin = iUserService.selectQuestion("admin");
        if(admin.isSuccess()){
            System.out.println(admin.getMsg());
            System.out.println(admin.getData().toString());
        }
    }
}
