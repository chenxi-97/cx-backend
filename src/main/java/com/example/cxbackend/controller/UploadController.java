package com.example.cxbackend.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cxbackend.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author: tangguoliang
 * @Description:
 * @Date: 2021/10/6 6:36 下午
 */
@RestController
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @PostMapping("/uploadExcel")
    public JSONObject addUser(@RequestParam("file") MultipartFile file) throws IOException {
        return uploadService.uploadExcel(file);
    }
}
