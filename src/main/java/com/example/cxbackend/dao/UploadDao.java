package com.example.cxbackend.dao;

import com.alibaba.fastjson.JSONObject;
import com.example.cxbackend.entity.Logistic;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: tangguoliang
 * @Description:
 * @Date: 2021/10/6 6:34 下午
 */

@Repository
public interface UploadDao {
    int saveLogistic(List<Logistic> list);

    List<Logistic> getAllLogistic();
}
