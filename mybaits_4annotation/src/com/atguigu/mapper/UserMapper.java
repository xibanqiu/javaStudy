package com.atguigu.mapper;

import com.atguigu.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;



public interface UserMapper {

    @Select("select id,last_name userName ,sex from t_user where id = #{id}")
    public User findUserById(int id);

    @Select("select * from t_user")
    public List<User> findUsers();

    @Update("update t_user set last_name = #{lastName}, sex = #{sex} where id = #{id}")
    public int updateUser(User user);

    @Delete("delete from t_user where id = #{id}")
    public int deleteUserById(int id);

    @Insert("insert into t_user(`last_name`,`sex`) values(#{lastName},#{sex})")
    @SelectKey(before = false, keyProperty = "id", resultType = Integer.class, statement = { "select last_insert_id()" })
    public int saveUser(User user);

}
