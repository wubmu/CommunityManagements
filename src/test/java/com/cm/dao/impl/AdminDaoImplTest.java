package com.cm.dao.impl;

import com.cm.bean.Customer;
import com.cm.bean.Message;
import com.cm.dao.AdminDao;
import com.cm.util.JdbcUtil;
import org.junit.Test;

import java.awt.*;
import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * Created by 吴亚斌 on 2017/5/31.
 */
public class AdminDaoImplTest {
@Test
    public void test1(){
    Connection connection= JdbcUtil.getConnection();
    if (connection!=null)
        System.out.print("连接成功");
}
@Test
    public  void test2(){
    Customer c=new Customer();
    c.setName("www2222");
    c.setAddress("文澜");
    c.setId("123123123123");
    c.setTel("1110");
    c.setPassword("123456");
    c.setSex("男");
    AdminDao dao=new AdminDaoImpl();
    dao.save(c);
}
@Test
    public  void test3(){
    Message message =new Message();
    message.setTitle("第二条2");
    AdminDao dao=new AdminDaoImpl();
    dao.insertMessage(message);
}
}