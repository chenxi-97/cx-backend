package com.example.cxbackend.service;

import com.alibaba.fastjson.JSONObject;
import com.example.cxbackend.dao.UserDao;
import com.example.cxbackend.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

/**
 * @Author: tangguoliang
 * @Description:
 * @Date: 2021/10/5 9:06 下午
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(rollbackFor = Exception.class)
    public JSONObject addUser(JSONObject jsonObject){
        userDao.addUser(jsonObject);
        return CommonUtil.successJson();
    }
}
