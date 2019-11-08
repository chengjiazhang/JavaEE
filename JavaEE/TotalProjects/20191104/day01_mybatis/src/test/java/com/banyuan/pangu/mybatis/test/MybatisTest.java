package com.banyuan.pangu.mybatis.test;

import com.banyuan.pangu.dao.IUserDao;
import com.banyuan.pangu.domain.QueryVo;
import com.banyuan.pangu.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author: ZCJ
 * @Date: 2019-11-04 16:28
 * @Description:
 */
public class MybatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before//用于测试之前
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂生产SqlSession对象
        sqlSession = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @After//用于测试之后
    public void destroy() throws IOException {
        //6.提交事务
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    /**
     * 测试查询所有
     *
     * @throws IOException
     */
    @Test
    public void testFindAll() {
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }


    /**
     * 测试保存操作
     */
    @Test
    public void testSave() throws IOException {
        User user = new User();
        user.setUserName("林俊杰");
        user.setUserAddress("北京");
        user.setUserBirthday(new Date());
        user.setUserSex("男");
        System.out.println("之前---"+user);
        //5.使用代理对象执行方法
        userDao.saveUser(user);
//         //6.提交事务
//        sqlSession.commit();
        System.out.println("之后----"+ user);
    }

    /**
     * 测试更新操作
     */
    @Test
    public void testUpdate() throws IOException {
        User user = new User();
        user.setUserId(41);
        user.setUserName("张杰");
        user.setUserAddress("北京");
        user.setUserBirthday(new Date());
        user.setUserSex("男");
        //5.使用代理对象执行方法
        userDao.updateUser(user);
    }

    /**
     * 测试删除操作
     */
    @Test
    public void testDelete() throws IOException {
        userDao.deleteUser(41);
    }

    /**
     * 测试根据id查询操作
     */
    @Test
    public void testSelectById() throws IOException {
        User user = userDao.findById(42);
        System.out.println(user);
    }

    /**
     * 测试模糊查询根据名字查信息
     */
    @Test
    public void testSelectByName() {
        List<User> users = userDao.findByName("%李%");
        for (User user : users
        ) {
            System.out.println(user);
        }
    }
    /**
     * 测试记录总条数
     */
    @Test
    public void testFindTotal(){
//执行一个查询方法
        int count=userDao.findTotal();
        System.out.println(count);
    }

    /**
     * 测试使用queryVo作为查询条件
     */
    @Test
    public void testFindByVo() {
        QueryVo vo=new QueryVo();
        User user=new User();
        user.setUserName("%李%");
        vo.setUser(user);
        List<User> users = userDao.findUserByVo(vo);
        for (User user1 : users
        ) {
            System.out.println(user1);
        }
    }
}

