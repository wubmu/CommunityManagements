package com.cm.service.impl;

import com.cm.service.AdminService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 吴亚斌 on 2017/6/1.
 */
public class AdminServiceImplTest {
    @Test
    public void login() throws Exception {
        AdminService service =new AdminServiceImpl();
        if (service.login("wyb","123")!=null)
            System.out.println("成功");
    }

}