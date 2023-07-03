package com.wwz.springbootdemo03.dao;

import com.wwz.springbootdemo03.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<User> findAll();
    User findByName(String username);
    String findPswByName(String userName);
    void save(User user);

}
