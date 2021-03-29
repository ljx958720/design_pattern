package com.ghy.designmode.openClosed;

/**
 * 定义课程接口
 */
public interface ICourse {
    String getName();  // 获取课程名称
    Double getPrice(); // 获取课程价格
    String  getType(); // 获取课程类型
//    Double getSalePrice();// 新增：打折接口

}
