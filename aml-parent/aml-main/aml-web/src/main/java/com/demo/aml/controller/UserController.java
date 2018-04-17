package com.demo.aml.controller;

import com.demo.aml.pojo.T00User;
import com.demo.aml.pojo.custom.T00UserCustom;
import com.demo.aml.pojo.custom.T00UserQueryVo;
import com.demo.aml.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登陆
     * @param queryVo
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public T00User user(T00UserQueryVo queryVo) {
        T00UserCustom t00UserCustom = userService.queryUser(queryVo);
        return t00UserCustom;
    }

    /**
     * 获取用户列表
     * @param queryVo
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public ResponseEntity<List<T00User>> userList(T00UserQueryVo queryVo) {

        //Page<Object> objects = PageHelper.startPage(0, 10);

        List<T00User> userList = null;

        // 分页查询
        Page<List<T00User>> page = PageHelper.startPage(queryVo.getPage(), queryVo.getSize());

        userList = userService.queryUserList(queryVo);

         return new ResponseEntity<List<T00User>>(userList, HttpStatus.OK);

    }

}
