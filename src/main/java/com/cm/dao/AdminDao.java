package com.cm.dao;

import com.cm.bean.Admin;
import com.cm.bean.Customer;
import com.cm.bean.Message;

import java.util.List;

/**
 * Created by 吴亚斌 on 2017/5/31.
 */
public interface AdminDao {
    /**
     * 查询用户列表
     *
     * @return list
     */
    List<Customer> findAll();

    /**
     * 保存用户信息
     *
     * @param customer
     */
    void save(Customer customer);

    /**
     * @param customerid
     * @return
     */
    Customer findById(String customerid);

    /**
     * 更新用户信息
     *
     * @param customer
     */
    int update(Customer customer);

    /**
     * 删除用户信息
     *
     * @param customrid
     */
    void delect(String customrid);

    /**
     * 获取所有记录单的条数
     *
     * @return
     */
    int getTotalRecored();

    /**
     * 查询管理员
     * @param adminName
     * @param password
     * @return 如果存在返回管理员信息 否则返回null
     */
    Admin findAdmin(String adminName, String password);

    /**
     * 根据名字查询客户信息
     * @param name
     * @return
     */
    Customer findByName(String name);

    /**
     * 插入公告
     * @param message
     */
    void insertMessage(Message message);

    Customer findCustomer(String customerName, String password);
    Customer findByAdress(String address);

    /**
     * 收取物业费
     */
    void collectMon();

    /**
     * 分页查询
     * @param page
     * @return
     */
    List<Customer> limtFind(int page);
}