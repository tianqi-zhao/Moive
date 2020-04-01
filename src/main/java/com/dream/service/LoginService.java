package com.dream.service;

import com.dream.common.E3Result;


public interface LoginService {
    //登录
    E3Result userLogin(String username, String password);
}
