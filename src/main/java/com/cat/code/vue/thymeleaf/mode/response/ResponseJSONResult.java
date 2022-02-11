package com.cat.code.vue.thymeleaf.mode.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: lvgang
 * @Desc:
 * @Time: 12:17 2022/2/10
 **/
@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ResponseJSONResult {

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("result")
  private Object result;

  public boolean isSuccess() {
    return code != null && ResponseCode.SUCCESS.getCode() == code;
  }
}