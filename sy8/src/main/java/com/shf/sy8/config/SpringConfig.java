package com.shf.sy8.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.shf.sy8")
@PropertySource({"classpath:jdbc.properties"})
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
