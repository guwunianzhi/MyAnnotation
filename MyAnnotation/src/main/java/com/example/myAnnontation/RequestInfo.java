/********************************************
 * 文件名称: RequestInfo.java
 * 系统名称: BFAM运营平台
 * 模块名称:
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 6.0.0.1
 * 开发人员: sunchao30263
 * 开发时间: 2021/5/2 10:19
 * 审核人员:
 * 相关文档:
 * 修改记录: 
 * 程序版本  修改日期    修改人员       修改单号      修改说明
 * 6.0.0.1  2021/5/2     sunchao30263                新建    
 *********************************************/
package com.example.myAnnontation;

import java.util.Map;

/**
 * 功能说明: TODO
 *
 * @author sunchao30263
 */
public class RequestInfo {
  private String WayCode;
  private String WayName;
  private Map<String, Object> map;
  public String getWayCode() {
    return WayCode;
  }
  public void setWayCode(String wayCode) {
    WayCode = wayCode;
  }
  public String getWayName() {
    return WayName;
  }
  public void setWayName(String wayName) {
    WayName = wayName;
  }
  public Map<String, Object> getMap() {
    return map;
  }
  public void setMap(Map<String, Object> map) {
    this.map = map;
  }
}
