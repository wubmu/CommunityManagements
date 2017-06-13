package com.cm.dao.impl;

import com.cm.bean.Admin;
import com.cm.bean.Customer;
import com.cm.bean.Message;
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


    public List<Customer> findAll() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Customer> cs = null;
        try {
            conn = JdbcUtil.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM customer");
            rs = stmt.executeQuery();
            cs = new ArrayList<Customer>();
            while (rs.next()) {
                Customer c=new Customer();
                c.setName(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setTel(rs.getString(3));
                c.setId(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setSex(rs.getString(6));
                cs.add(c);
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
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql = "INSERT INTO customer(customer_name,\n" +
                    " customer_tel, customer_id, customer_address,customer_password,customer_sex) VALUES \n" +
                    " (?,?,?,?,?,?) ";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getTel());
            stmt.setString(3, customer.getId());
            stmt.setString(4, customer.getAddress());
            stmt.setString(5, customer.getPassword());
            stmt.setString(6, customer.getSex());
            int rs = stmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }
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

    public int update(Customer c) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs=0;

        try {
            conn = JdbcUtil.getConnection();
            String sql="UPDATE cm.customer SET customer_address=?,customer_name=?,customer_password=?,customer_tel=?,\n" +
                    " customer_sex=? WHERE customer_id=?";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,c.getAddress());
            stmt.setString(2,c.getName());
            stmt.setString(3,c.getPassword());
            stmt.setString(4,c.getTel());
            stmt.setString(5,c.getSex());
            stmt.setString(6,c.getId());
            rs= stmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }
        return rs;

    }

    public void delect(String customr_id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql="DELETE FROM customer WHERE customer_id=?";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,customr_id);
            int rs = stmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }


    }

    public int getTotalRecored() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
        int total=0;
        try {
            conn = JdbcUtil.getConnection();
            String sql="SELECT COUNT(*) FROM customer";
            stmt=conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()){
                total=rs.getInt(1);
            }

        }

        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }
        return 0;
    }


    public Admin findAdmin(String adminName, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql = "select * FROM admin WHERE username=? AND password=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, adminName);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Admin admin = new Admin();
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

    public void insertMessage(Message message) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = JdbcUtil.getConnection();
            String sql="INSERT INTO Message (message_title, message_body, message_date," +
                    " message_publisher) VALUES (?,?,?,?)";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,message.getTitle());
            stmt.setString(2,message.getBody());
            stmt.setString(3,message.getDate());
            stmt.setString(4,message.getPublister());
            int rs = stmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }

    }

    public Customer findCustomer(String customerName, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Customer c=new Customer();
        try {
            conn = JdbcUtil.getConnection();
            String sql = "select * FROM admin WHERE username=? AND password=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, customerName);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()) {

                c.setName(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setTel(rs.getString(3));
                c.setId(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setSex(rs.getString(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, rs, stmt);
        }
        return c;
    }

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

    public void collectMon() {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;
        int total=0;
        try {
            conn = JdbcUtil.getConnection();
            String sql="UPDATE cost SET property=0";
            stmt=conn.prepareStatement(sql);
            rs = stmt.executeUpdate();
        }

        catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, null, stmt);
        }
    }

    public List<Customer> limtFind(int page) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Customer> cs = null;
        int num1=1;
        int num2=2;
        try {
            conn = JdbcUtil.getConnection();
            String sql="SELECT * FROM customer LIMIT ?,?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(num1,(page-1)*6);
            stmt.setInt(num2,6);
            rs = stmt.executeQuery();
            cs = new ArrayList<Customer>();
            while (rs.next()) {
                Customer c=new Customer();
                c.setName(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setTel(rs.getString(3));
                c.setId(rs.getString(4));
                c.setAddress(rs.getString(5));
                c.setSex(rs.getString(6));
                cs.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.release(conn, rs, stmt);
        }
        return cs;
    }
}
