package com.example.cxbackend.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.NumberFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: tangguoliang
 * @Description:
 * @Date: 2021/10/7 3:53 下午
 */
@Data
public class Logistic {
    @ExcelProperty("日期")
    private String date;

    @ExcelProperty("自配送")
    private String personal;

    @ExcelProperty("商户配送")
    private String other;

    @ExcelProperty("绩效工资")
    private String salary;

    @ExcelProperty("出勤总分值")
    private String percent;

}
