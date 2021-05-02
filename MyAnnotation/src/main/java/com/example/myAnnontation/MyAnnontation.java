/********************************************
 * 文件名称: MyAnnontation.java
 * 系统名称: BFAM运营平台
 * 模块名称:
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 6.0.0.1
 * 开发人员: sunchao30263
 * 开发时间: 2021/5/2 10:12
 * 审核人员:
 * 相关文档:
 * 修改记录: 
 * 程序版本  修改日期    修改人员       修改单号      修改说明
 * 6.0.0.1  2021/5/2     sunchao30263                新建    
 *********************************************/
package com.example.myAnnontation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能说明: TODO
 *
 * @author sunchao30263
 */

@Target({ElementType.FIELD, ElementType.METHOD}) //声明自定义的注解使用在方法上
@Retention(RetentionPolicy.RUNTIME)//注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
@Documented
public @interface MyAnnontation {
  String WayCode() default "none";

  String WayName() default "空";
}
