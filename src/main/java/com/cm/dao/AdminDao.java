package com.cm.dao;

import com.cm.bean.Admin;
import com.cm.bean.Customer;

import java.util.List;

/**
 * Created by 吴亚斌 on 2017/5/31.
 */
public interface AdminDao {
    /**
     * 查询用户列表
     * @return list
     */
    List<Customer> findAll();

    /**
     * 保存用户信息
     * @param customer
     */
    void save(Customer customer);

    /**
     *
     * @param customerId
     * @return
     */
    Customer findById(String customerId);

    /**
     * 更新用户信息
     * @param customer
     */
    void update(Customer customer);

    /**
     * 删除用户信息
     * @param customrId
     */
    void delect(String customrId);

    /**
     * 获取所有记录单的条数
     * @return
     */
    int getTotalRecored();

    /**
     * 查询分页记录
     * @param starIndex
     * @param pageSize
     * @return
     */
    List<Customer> findPageRecords(int starIndex,int pageSize);

    Admin findAdmin(String adminName, String password);

}
