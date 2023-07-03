package com.wwz.springbootdemo03.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
}
