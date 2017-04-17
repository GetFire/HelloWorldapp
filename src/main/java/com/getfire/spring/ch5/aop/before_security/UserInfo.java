package com.getfire.spring.ch5.aop.before_security;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class UserInfo {
    private String name;
    private String password;


    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        user.setName("tratata");
        System.out.println(user.getName());
        System.out.println(user);
    }

}
