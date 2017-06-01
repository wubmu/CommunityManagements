package com.cm.dao.impl;

import com.cm.util.JdbcUtil;
import org.junit.Test;

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
}