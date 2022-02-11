package com.cat.code.vue.thymeleaf.mode.response;

import org.springframework.http.HttpStatus;

/**
 * @Author: lvgang
 * @Desc:
 * @Time: 12:22 2022/2/10
 **/
public enum ResponseCode {
  SUCCESS(200, "SUCCESS"),
  UNAUTHORIZED(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.getReasonPhrase()),
  FORBIDDEN(HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.getReasonPhrase()),
  BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase()),
  FAIL(5000, "服务器错误"),
  SYNCING(6000, "正在同步中");


  private Integer code;
  private String message;

  ResponseCode(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public static ResponseCode getResponseCode(int code) {
    for (ResponseCode responseCode : ResponseCode.values()) {
      if (code == responseCode.getCode()) {
        return responseCode;
      }
    }
    return FAIL;
  }

  public Integer getCode() {
    return this.code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
