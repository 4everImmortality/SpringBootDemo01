package com.wwz.springbootdemo03;

import com.wwz.springbootdemo03.dao.CustomerMapper;
import com.wwz.springbootdemo03.pojo.Customer;
import com.wwz.springbootdemo03.vo.CustomerVo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.wwz.springbootdemo03.dao")
class SpringBootDemo03ApplicationTests {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    void contextLoads() {
        CustomerVo vo = new CustomerVo();
        vo.setCareer("程序");
        List<Customer> customers = customerMapper.queryAllCustomer(vo);
        System.out.println(customers);
    }
}
