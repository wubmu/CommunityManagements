package com.cm.service;

import com.cm.bean.Admin;

/**
 * Created by 吴亚斌 on 2017/5/31.
 */
public interface AdminService {
    /**
     * 登陆功能
     * @param username
     * @param password
     * @return
     */
    Admin login(String username,String password);
}
