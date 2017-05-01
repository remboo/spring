package com.johnremboo.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Igor Orekhov on 01.05.17.
 */

/**
 * Used as a source of bean definitions. annotation tells Spring that a method annotated with @Bean will return
 * an object that should be registered as a bean in the Spring application context.
 */
@Configuration

/**
 * Scans package for components (@Component, @Controller, @Service, @Repository)
 */
@ComponentScan("com.johnremboo")

/**
 * Enables support for handling components marked with AspectJ's @Aspect annotation
 */
@EnableAspectJAutoProxy
public class Config {}
