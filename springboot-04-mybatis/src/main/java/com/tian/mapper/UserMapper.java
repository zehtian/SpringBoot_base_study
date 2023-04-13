package com.tian.mapper;

import com.tian.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper: 表示本类是一个MyBatis的Mapper
@Mapper
@Repository
public interface UserMapper {
    //查找所有用户
    List<User> queryUserList();

    //根据id查询用户
    User queryUserById(int id);

    //添加一个用户
    int addUser(User user);

    //更新一个用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);
}
