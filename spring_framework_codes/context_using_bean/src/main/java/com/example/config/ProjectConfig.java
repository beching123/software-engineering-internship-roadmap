package com.example.config;

import com.example.beans.Parrot;
import java.util.function.Supplier;

import com.example.beans.Parrot;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    //<T> void registerBean (String beanName, Class<T> beanClass, Supplier<T> supplier, BeanDefinitionCustomizer ... customizer);
}
