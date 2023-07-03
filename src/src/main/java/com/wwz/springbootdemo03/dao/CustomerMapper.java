package com.wwz.springbootdemo03.dao;

import com.wwz.springbootdemo03.pojo.Customer;
import com.wwz.springbootdemo03.vo.CustomerVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    /**
     * 查询客户信息
     * 模糊查询
     */
    /**
     * 查询客户信息
     */
    List<Customer> queryAllCustomer(Customer customer);

    /**
     * 添加客户
     * @param customerVo
     */
    void addCustomer(CustomerVo customerVo);

    /**
     * 修改客户
     * @param customerVo
     */
    void updateCustomer(CustomerVo customerVo);

    /**
     * 删除客户
     * @param identity
     */
    void deleteCustomer(String identity);
}
