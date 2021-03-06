package cn.vpclub.shm.shcmcc.consumer.model.enums;

import cn.vpclub.moses.core.constant.MessageCodeConstant;

/**
 * 接口返回值枚举
 * <p>
 * Created by admin on 2016/1/23.
 */
public enum WeChatEnum {
  CODE_0("0", MessageCodeConstant.MESSAGE_COMMON_SUCCESS),//
  SUBSCRIBE("1","关注"),
  ERROR_REQUEST("request error","非法请求，可能属于伪造的请求！"),
  INSTALL_ORGID("ORG","10000005426349007");

  /**
   * 业务编号
   */
  private String code;

  /**
   * 业务值
   */
  private String value;

  private WeChatEnum(String code, String value) {
    this.code = code;
    this.value = value;
  }

  public final String getCode() {
    return code;
  }

  public final String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return this.code + "=" + this.value;
  }
}
