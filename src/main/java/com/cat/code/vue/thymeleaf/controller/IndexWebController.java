package com.cat.code.vue.thymeleaf.controller;

import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: lvgang
 * @Desc:
 * @Time: 12:01 2022/2/10
 **/
@Controller
@Slf4j
@RequestMapping("/cat/code")
public class IndexWebController {
  /**
   * 转化跟踪应用页面
   */
  @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
  public String convertAppQuery(HttpServletRequest request) {
    return "index";
  }
}
