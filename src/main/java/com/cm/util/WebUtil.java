package com.cm.util;

import com.cm.bean.Customer;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by 吴亚斌 on 2017/5/30.
 */
//封装请求参数到Bean中（表单字段和Bean的属性完全一致）
public class WebUtil {
    /**
     * 表单 username=abc password=123
     * javaBean: private String username;private  String password;
     * <p>
     * //key:表单字段名： userna和password     value:String[]{abc} String[]{123}
     * Map<String,String[]> map=request.getParameterMap(); </>
     * //遍历Map,判断key是username吗？如果是,调用setUsername("abc");
     */
    public static <T> T fillBean(HttpServletRequest request, Class<T> class1) {
        try {
            T bean = class1.newInstance();
            //按着请求参数名称，调用对应的setter方法，填充请求参数的值。比如
            //如果表单名为username,会调用bean.setUsername("abc");
            //BeanUtils.populate();循环遍历
            BeanUtils.populate(bean, request.getParameterMap());
            return bean;
        } catch (Exception e) {
            throw new RuntimeException("封装JavaBean时出错，请检查类的属性和请求参数的名称是否一致");

        }

    }
    public static void fillname(HttpServletRequest request){
        Customer c=new Customer();
        try {
            BeanUtils.setProperty(c,"name",request.getParameter("name"));
            System.out.print(c.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}