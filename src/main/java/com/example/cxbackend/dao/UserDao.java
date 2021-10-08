package com.example.cxbackend.dao;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * @Author: tangguoliang
 * @Description:
 * @Date: 2021/10/5 9:07 下午
 */
@Component
public interface UserDao {
    /**
     * 新增用户
     * @param jsonObject
     * @return
     */
    int addUser(JSONObject jsonObject);
}
