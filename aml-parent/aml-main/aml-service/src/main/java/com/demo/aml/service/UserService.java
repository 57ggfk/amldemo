package com.demo.aml.service;

import com.demo.aml.pojo.T00User;
import com.demo.aml.pojo.custom.T00UserCustom;
import com.demo.aml.pojo.custom.T00UserQueryVo;

import java.util.List;

public interface UserService {

    public T00UserCustom queryUser(T00UserQueryVo queryVo);

    List<T00User> queryUserList(T00UserQueryVo userQueryVo);
}
