package com.banyuan.pangu.dao;

import com.banyuan.pangu.domain.QueryVo;
import com.banyuan.pangu.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: ZCJ
 * @Date: 2019-11-04 15:42
 * @Description:用户的持久层接口
 */
public interface IUserDao {
    /**
     * 查询所有操作
     */
//@Select("select * from user")
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param userId
     */
    void deleteUser( Integer userId);

    /**
     * 查询用户根据id
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 根据用户名字模糊查询
     * @param userName
     * @return
     */
    List<User> findByName(String userName);

    /**
     *查询总用户数
     * @return
     */
    Integer findTotal();
    /**
     *根据queryVo中的条件查询用
     */
   List<User> findUserByVo(QueryVo vo);
}
