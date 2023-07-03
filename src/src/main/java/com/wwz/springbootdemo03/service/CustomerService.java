package com.wwz.springbootdemo03.service;

import com.wwz.springbootdemo03.vo.CustomerVo;
import com.wwz.springbootdemo03.vo.DataGridView;

public interface CustomerService {
    /**
     * 查询全部客户信息
     *
     * @param customerVo
     * @return
     */
    public DataGridView queryAllCustomer(CustomerVo customerVo);

    /**
     * 添加客户
     *
     * @param customerVo
     */
    void addCustomer(CustomerVo customerVo);

    /**
     * 修改客户信息
     *
     * @param customerVo
     */
    void updateCustomer(CustomerVo customerVo);

    /**
     * 删除用户信息
     *
     * @param identity
     */
    void deleteCustomer(String identity);
}
