package com.ing.exchange.plateform.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "com.ing.payments")
@EnableWebMvc
@PropertySource({ "classpath:restUrl.properties", "classpath:errors.properties" })
public class MvcConfiguration extends WebMvcConfigurerAdapter {


}
