package com.cm.dao;

import com.cm.bean.Customer;
import com.cm.bean.Infomation;
import com.cm.bean.Message;

import java.util.List;

/**
 * Created by 吴亚斌 on 2017/6/10.
 */
public interface CustomerDao {

    Customer findByAdress(String address);
    Customer findById(String id);
    Customer findByName(String name);

    /**
     * 查询客户物业费和水电费
     * @param id
     * @return
     */
    Infomation findInfomation(String id);

    /**
     * 交水电费
     * @param id
     * @return
     */
    int payW(String id,int money);

    /**
     * 交物业费
     * @param id
     * @return
     */
    int payP(String id);

    /**
     * 查看文章
     * @param title
     * @return
     */
    Message findMessage(String title);

    /**
     * 查询所有的新闻标题
     * @return
     */
    List<String> findAllTitle();
}
