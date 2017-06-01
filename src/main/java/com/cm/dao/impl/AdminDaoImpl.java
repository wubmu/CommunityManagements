package com.cm.dao.impl;

import com.cm.bean.Admin;
import com.cm.bean.Customer;
import com.cm.dao.AdminDao;
import com.cm.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 吴亚斌 on 2017/5/31.
 */
public class AdminDaoImpl implements AdminDao {
    Connection conn = JdbcUtil.getConnection();

    public List<Customer> findAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Customer> cs = null;
        try {
            conn = JdbcUtil.getConnection();
            stmt = conn.prepareStatement("'");
            rs = stmt.executeQuery();
            cs = new ArrayList<Customer>();
            while (rs.next()) {
            }
            return cs;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, rs, stmt);
        }
        return cs;
    }

    public void save(Customer customer) {

    }

    public Customer findById(String customerId) {
        return null;
    }

    public void update(Customer customer) {

    }

    public void delect(String customrId) {

    }

    public int getTotalRecored() {
        return 0;
    }

    public List<Customer> findPageRecords(int starIndex, int pageSize) {
        return null;
    }

    public Admin findAdmin(String adminName, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql = "select * FROM admin WHERE username=? AND password=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,adminName);
            stmt.setString(2,password);
            rs=stmt.executeQuery();
            if (rs.next()) {
                Admin admin =new Admin();
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                admin.setId(rs.getString("id"));
                return admin;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, rs, stmt);
        }
        return null;
    }
}
