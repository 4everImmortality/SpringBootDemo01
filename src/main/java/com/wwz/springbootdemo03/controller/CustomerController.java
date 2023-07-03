package com.wwz.springbootdemo03.controller;

import com.wwz.springbootdemo03.service.CustomerService;
import com.wwz.springbootdemo03.utils.ResultObj;
import com.wwz.springbootdemo03.vo.CustomerVo;
import com.wwz.springbootdemo03.vo.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * 查询客户信息 通过get的请求方式
     *
     * @param customerVo
     * @return
     */
    @GetMapping("/loadAllCustomer")
    public DataGridView loadAllCustomer(@RequestBody CustomerVo customerVo) {
        return customerService.queryAllCustomer(customerVo);
    }

    /**
     * 添加客户
     * 请求类型为Post
     *
     * @param customerVo
     * @return
     */
    @PostMapping("/addCustomer")
    public ResultObj addCustomer(@RequestBody CustomerVo customerVo) {
        try {
            customerVo.setCreatetime(new Date());
            customerService.addCustomer(customerVo);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 修改客户
     * 请求类型为put
     *
     * @param customerVo
     * @return
     */
    @PutMapping("updateCustomer")
    public ResultObj updateCustomer(@RequestBody CustomerVo customerVo) {
        try {
            customerService.updateCustomer(customerVo);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 删除客户信息
     *
     * @param identity
     * @return
     */
    @DeleteMapping("deleteCustomer")
    public ResultObj deleteCustomer(String identity) {
        try {
            customerService.deleteCustomer(identity);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }
}

