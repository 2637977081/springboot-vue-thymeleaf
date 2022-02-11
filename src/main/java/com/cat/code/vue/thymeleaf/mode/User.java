package com.cat.code.vue.thymeleaf.mode;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: lvgang
 * @Desc:
 * @Time: 10:39 2022/2/10
 **/
@Data
@Builder
public class User {
  private Integer id;
  private String username;
  private String password;
  private Integer age;
}
