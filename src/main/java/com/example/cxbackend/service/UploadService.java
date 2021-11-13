package com.example.cxbackend.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSONObject;
import com.example.cxbackend.dao.UploadDao;
import com.example.cxbackend.entity.Logistic;
import com.example.cxbackend.util.CommonUtil;
import com.example.cxbackend.util.UploadDataListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @Author: tangguoliang
 * @Description:
 * @Date: 2021/10/6 6:38 下午
 */

@Service
public class UploadService {

    @Autowired
    private UploadDao uploadDao;

    @Transactional(rollbackFor = Exception.class)
    public JSONObject uploadExcel(MultipartFile multipartFile) throws IOException {
        EasyExcel.read(multipartFile.getInputStream(), Logistic.class, new UploadDataListener(uploadDao)).sheet().doRead();
        return CommonUtil.successJson();
    }

    public JSONObject getAllLogistic() {
        List<Logistic> list = uploadDao.getAllLogistic();
        JSONObject resultJson = new JSONObject();
        resultJson.put("list",list);
        return CommonUtil.successJson(resultJson);
    }
}
