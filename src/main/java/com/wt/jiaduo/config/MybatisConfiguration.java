package com.wt.jiaduo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.wt.jiaduo.mapper")
public class MybatisConfiguration {

}
