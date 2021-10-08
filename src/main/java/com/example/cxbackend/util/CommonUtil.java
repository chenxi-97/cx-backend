package com.example.cxbackend.util;

import com.alibaba.fastjson.JSONObject;
import com.example.cxbackend.util.constants.Constants;
import com.example.cxbackend.util.constants.ErrorEnum;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @Author: tangguoliang
 * @Description: 一些工具方法
 * @Date: 2021/10/4 9:26 下午
 */
public class CommonUtil {

    public static JSONObject successJson() {
        return successJson(new JSONObject());
    }

    public static JSONObject successJson(Object info){
        JSONObject resultJson = new JSONObject();
        resultJson.put("code", Constants.SUCCESS_CODE);
        resultJson.put("msg",Constants.SUCCESS_MSG);
        resultJson.put("info",info);
        return resultJson;
    }

    public static  JSONObject errorJson(ErrorEnum errorEnum){
        JSONObject resultJson = new JSONObject();
        resultJson.put("code",errorEnum.getErrorCode());
        resultJson.put("msg",errorEnum.getErrorMsg());
        resultJson.put("info",new JSONObject());
        return resultJson;
    }

    public static JSONObject request2Json(HttpServletRequest request) {
        JSONObject requestJson = new JSONObject();
        Enumeration paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = (String) paramNames.nextElement();
            String[] pv = request.getParameterValues(paramName);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < pv.length; i++) {
                if (pv[i].length() > 0) {
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(pv[i]);
                }
            }
            requestJson.put(paramName, sb.toString());
        }
        return requestJson;
    }

}
