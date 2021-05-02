/********************************************
 * 文件名称: ResponseInfo.java
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

/**
 * 功能说明: TODO
 *
 * @author sunchao30263
 */
public class ResponseInfo {
  private String TestId;
  private String TestName;
  public String getTestId() {
    return TestId;
  }
  public void setTestId(String testId) {
    TestId = testId;
  }
  public String getTestName() {
    return TestName;
  }
  public void setTestName(String testName) {
    TestName = testName;
  }
}
