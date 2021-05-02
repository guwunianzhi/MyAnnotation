/********************************************
 * 文件名称: GateWay.java
 * 系统名称: BFAM运营平台
 * 模块名称:
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 6.0.0.1
 * 开发人员: sunchao30263
 * 开发时间: 2021/5/2 10:14
 * 审核人员:
 * 相关文档:
 * 修改记录: 
 * 程序版本  修改日期    修改人员       修改单号      修改说明
 * 6.0.0.1  2021/5/2     sunchao30263                新建    
 *********************************************/
package com.example.myAnnontation;

import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 功能说明: TODO
 *
 * @author sunchao30263
 */
public class GateWay {
  private static final Logger logger = LoggerFactory.getLogger(GateWay.class);

  public ResponseInfo gateWay(RequestInfo requestInfo) {
    ResponseInfo responseInfo = new ResponseInfo();
    Reflections reflections = new Reflections("com.example.myAnnontation");//包名且不可忘记，不然扫描全部项目包，包括引用的jar
    //获取带Service注解的类
    Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(Service.class);
    for (Class clazz : typesAnnotatedWith
    ) {
      Method[] methods = clazz.getDeclaredMethods();
      for (Method method : methods
      ) {
        //判断带自定义注解MyAnnontation的method
        if (method.isAnnotationPresent(MyAnnontation.class)) {
          MyAnnontation annotation = method.getAnnotation(MyAnnontation.class);
          //根据入参WayCode比较method注解上的WayCode,两者值相同才执行该method
          if (null != annotation.WayCode() && annotation.WayCode().equals(requestInfo.getWayCode())) {
            logger.info("WayCode = " + annotation.WayCode());
            try {
              //执行method
              responseInfo = (ResponseInfo) method.invoke(clazz.newInstance(), requestInfo.getMap());
            } catch (Exception e) {
              logger.info("--------------执行自定义注解方法异常--------------");
              e.printStackTrace();
            }
          }

        }

      }
    }
    return responseInfo;
  }

  public static void main(String[] args) {
    Map<String, Object> map = new HashMap();
    map.put("Key1", "参数1");
    map.put("Key2", "参数2");
    RequestInfo requestInfo = new RequestInfo();
    requestInfo.setWayCode("a");//自定义注解的WayCode值，调用不同的方法
    requestInfo.setWayName("调测试方法1");
    requestInfo.setMap(map);

    GateWay gate = new GateWay();
    ResponseInfo responseInfo = gate.gateWay(requestInfo);
    logger.info(responseInfo.toString());
  }

}
