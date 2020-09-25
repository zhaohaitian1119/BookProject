package com.group.book.service.impl;

import com.group.book.mapper.UserMapper;
import com.group.book.pojo.UserExample;
import com.group.book.service.LoginServicezht;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-09-25 11:42
 */
@Service("loginServicezht")
public class LoginServicezhtImpl implements LoginServicezht {

    @Resource
    UserMapper userMapper;

    @Override
    public int loginByNamePassWord(String name, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        criteria.andPasswordEqualTo(password);
        int i = userMapper.countByExample(example);
        return i;
    }
}
