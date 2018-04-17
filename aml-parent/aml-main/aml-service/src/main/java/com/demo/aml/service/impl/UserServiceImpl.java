package com.demo.aml.service.impl;

import com.demo.aml.mapper.T00UserMapper;
import com.demo.aml.pojo.T00User;
import com.demo.aml.pojo.T00UserExample;
import com.demo.aml.pojo.custom.T00UserCustom;
import com.demo.aml.pojo.custom.T00UserQueryVo;
import com.demo.aml.service.UserService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private T00UserMapper userMapper;

    @Override
    public T00UserCustom queryUser(T00UserQueryVo queryVo) {

        // 封装查询条件
        T00UserExample example = new T00UserExample();
        example.clear();
        T00UserExample.Criteria criteria = example.createCriteria();

        if (queryVo !=null && queryVo.getT00UserCustom() != null) {
            T00UserCustom t00UserCustom = queryVo.getT00UserCustom();
            criteria.andOrgankeyEqualTo(t00UserCustom.getOrgankey());
        }

        // 查询
        List<T00User> t00Users = userMapper.selectByExample(example);

        // 封装查询结果
        T00UserCustom userCustom = new T00UserCustom();
        if (t00Users != null && t00Users.size() > 0) {
            BeanUtils.copyProperties(t00Users.get(0), userCustom);
        }

        return userCustom;
    }

    @Override
    public List<T00User> queryUserList(T00UserQueryVo userQueryVo) {

        T00UserExample example = new T00UserExample();
        example.clear();
        T00UserExample.Criteria criteria = example.createCriteria();

        if (userQueryVo != null) {
            T00UserCustom t00UserCustom = userQueryVo.getT00UserCustom();
            if (t00UserCustom != null && StringUtils.isBlank(t00UserCustom.getOrgankey())) {
                criteria.andOrgankeyEqualTo(t00UserCustom.getOrgankey());
            }
        }
        List<T00User> t00Users = userMapper.selectByExample(example);
        return t00Users;
    }
}
