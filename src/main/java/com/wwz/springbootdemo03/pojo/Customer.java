package com.wwz.springbootdemo03.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
/**
 * 客户实体类
 */
public class Customer {
    //身份证
    private String identity;
    //客户名称
    private String custname;
    //性别
    private Integer sex;
    //地址
    private String address;
    //电话
    private String phone;
    //职业
    private String career;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date  createtime;
}
