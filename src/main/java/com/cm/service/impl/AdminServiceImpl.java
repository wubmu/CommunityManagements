package com.cm.service.impl;

import com.cm.bean.Admin;
import com.cm.dao.AdminDao;
import com.cm.dao.impl.AdminDaoImpl;
import com.cm.service.AdminService;

/**
 * Created by 吴亚斌 on 2017/5/31.
 */
public class AdminServiceImpl implements AdminService {
    AdminDao adminDao=new AdminDaoImpl();

    public Admin login(String username, String password) {
        Admin admin=adminDao.findAdmin(username, password);
        return admin;
    }
}
