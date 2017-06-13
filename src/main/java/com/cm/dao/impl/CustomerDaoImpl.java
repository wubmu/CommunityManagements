package com.cm.dao.impl;

import com.cm.bean.Customer;
import com.cm.bean.Infomation;
import com.cm.bean.Message;
import com.cm.dao.CustomerDao;
import com.cm.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 吴亚斌 on 2017/6/10.
 */
public class CustomerDaoImpl implements CustomerDao {
    public Customer findByAdress(String address) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
        Customer c=new Customer();
        try {
            conn = JdbcUtil.getConnection();
            String sql="SELECT * FROM customer WHERE customer_adress=?";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,address);
            rs= stmt.executeQuery();
            if (rs.next()){

                c.setName(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setTel(rs.getString(3));
                c.setId(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setSex(rs.getString(6));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, rs, stmt);
        }
        return c;
    }
    public Customer findById(String customerId) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
        Customer c=new Customer();
        try {
            conn = JdbcUtil.getConnection();
            String sql="SELECT * FROM customer WHERE customer_id=?";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,customerId);
            rs= stmt.executeQuery();
            if (rs.next()){

                c.setName(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setTel(rs.getString(3));
                c.setId(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setSex(rs.getString(6));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, rs, stmt);
        }
        return c;
    }
    public Customer findByName(String name) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
        Customer c=new Customer();
        try {
            conn = JdbcUtil.getConnection();
            String sql="SELECT * FROM customer WHERE customer_name=?";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,name);
            rs= stmt.executeQuery();
            if (rs.next()){

                c.setName(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setTel(rs.getString(3));
                c.setId(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setSex(rs.getString(6));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, rs, stmt);
        }
        return c;
    }

    public Infomation findInfomation(String id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
        Infomation infomation=null;
        try {
            conn = JdbcUtil.getConnection();
            String sql="SELECT * FROM cost";
            stmt=conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()){
                infomation.setProperty(rs.getInt(2));
                infomation.setWaterEle(rs.getInt(3));
            }

        }

        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, rs, stmt);
        }
        return infomation;
    }

    public int payW(String id,int money) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs=0;
        Infomation infomation=null;
        try {
            conn = JdbcUtil.getConnection();
            String sql="UPDATE cost SET waterEle=? WHERE customer_id=?";
            stmt=conn.prepareStatement(sql);
            stmt.setInt(1,money);
            stmt.setString(2,id);
            rs = stmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }
     return rs;
    }

    public int payP(String id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs=0;

        try {
            conn = JdbcUtil.getConnection();
            String sql="UPDATE cost SET property=1000 WHERE customer_id=?";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,id);
            rs = stmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }
        return rs;
    }

    public Message findMessage(String title) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
        Message message=new Message();
        try {
            conn = JdbcUtil.getConnection();
            String sql="SELECT * FROM message WHERE title=?";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,title);
            rs = stmt.executeQuery();
            if (rs.next()){
                message.setTitle(rs.getString(1));
                message.setBody(rs.getString(2));
                message.setDate(rs.getString(3));
                message.setPublister(rs.getString(4));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }
        return message;
    }

    public List<String> findAllTitle() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
        List<String> titlelist=new ArrayList<String>();

        try {
            conn = JdbcUtil.getConnection();
            String sql="SELECT * FROM message limit 5 ";
            stmt=conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){
              titlelist.add(rs.getString(1));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }
        return titlelist;
    }
}
