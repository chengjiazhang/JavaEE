package banyuan.dao;

import banyuan.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
@Select("select id,userName,userPassword,userSmallName from login_info id = #{id}")
    User findAll(int id);
}
