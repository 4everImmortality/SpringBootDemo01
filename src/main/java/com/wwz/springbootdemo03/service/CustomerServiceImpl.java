package com.wwz.springbootdemo03.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wwz.springbootdemo03.dao.CustomerMapper;
import com.wwz.springbootdemo03.pojo.Customer;
import com.wwz.springbootdemo03.vo.CustomerVo;
import com.wwz.springbootdemo03.vo.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 分页查询
     *
     * @param customerVo
     * @return
     */
    @Override
    public DataGridView queryAllCustomer(CustomerVo customerVo) {
        // 通过pagehelper 完成分页查询 设置了当前页和每页展示多少行
        Page<Object> page = PageHelper.startPage(customerVo.getPage(), customerVo.getLimit());
        List<Customer> customers = customerMapper.queryAllCustomer(customerVo);
        // 自动做了分页 返回了分页后的查询结果
        return new DataGridView(page.getTotal(), customers);
    }

    /**
     * 增加用户
     *
     * @param customerVo
     */
    @Override
    public void addCustomer(CustomerVo customerVo) {

        customerMapper.addCustomer(customerVo);
    }

    /**
     * 修改客户
     *
     * @param customerVo
     */
    @Override
    public void updateCustomer(CustomerVo customerVo) {
        customerMapper.updateCustomer(customerVo);
    }

    /**
     * 通过身份证删除用户
     *
     * @param identity
     */
    @Override
    public void deleteCustomer(String identity) {
        customerMapper.deleteCustomer(identity);
    }
}
