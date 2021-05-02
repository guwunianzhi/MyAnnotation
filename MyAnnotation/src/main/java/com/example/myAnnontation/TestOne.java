/********************************************
 * 文件名称: TestOne.java
 * 系统名称: BFAM运营平台
 * 模块名称:
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 6.0.0.1
 * 开发人员: sunchao30263
 * 开发时间: 2021/5/2 10:18
 * 审核人员:
 * 相关文档:
 * 修改记录: 
 * 程序版本  修改日期    修改人员       修改单号      修改说明
 * 6.0.0.1  2021/5/2     sunchao30263                新建    
 *********************************************/
package com.example.myAnnontation;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 功能说明: TODO
 *
 * @author sunchao30263
 */
@Service
public class TestOne {
  @MyAnnontation(WayCode = "a",WayName = "测试类1")
  public ResponseInfo gateWayOne(Map<String, Object> map) {
    System.out.printf("gateWayOne printf" + map.get("Key1"));
    ResponseInfo res = new ResponseInfo();
    res.setTestId("000000");
    res.setTestName("U get Class gateWayOne");
    return res;
  }

  @MyAnnontation(WayCode = "b",WayName = "测试类2")
  public ResponseInfo gateWayTwo(Map<String, Object> map) {
    System.out.printf("gateWayOne printf" + map.get("Key2"));
    ResponseInfo res = new ResponseInfo();
    res.setTestId("000000");
    res.setTestName("U get Class gateWayTwo");
    return res;
  }

  @MyAnnontation
  public ResponseInfo gateWayThree(Map<String, Object> map) {
    System.out.printf("gateWayThree printf" + map.get("Key3"));
    ResponseInfo res = new ResponseInfo();
    res.setTestId("000000");
    res.setTestName("U get Class gateWayThree");
    return res;
  }

  public ResponseInfo gateWay4(Map<String, Object> map) {
    System.out.printf("gateWayThree printf" + map.get("Key4"));
    ResponseInfo res = new ResponseInfo();
    res.setTestId("000000");
    res.setTestName("U get Class gateWay4");
    return res;
  }
}
