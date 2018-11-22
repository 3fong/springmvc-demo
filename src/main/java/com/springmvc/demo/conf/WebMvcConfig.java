package com.springmvc.demo.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @author liulei
 * @date 2018年11月22日 下午4:21:37
 */
@Configuration
@ComponentScan(basePackages = "com.springmvc.demo")
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
 
}
