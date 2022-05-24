package com.fastcampus.springpractice.config;

import com.fastcampus.springpractice.logic.BubbleSort;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.fastcampus.springpractice")
public class Config {

}
