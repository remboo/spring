package com.johnremboo.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Igor Orekhov on 01.05.17.
 */

/**
 * Annotates as Aspect class
 */
@Aspect

/**
 * Aspect should be marked as @Bean or @Component for ApplicationContext
 */
@Component
public class MyAspect {

    /* Join Point ----> */ @Before(/* Point Cut ----> */ "execution(* com.johnremboo.spring.aop.Service+.*(..))")
    public void before(JoinPoint joinPoint) {
        /* Advice ----> */ System.out.println("Before: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.johnremboo.spring.aop.Service+.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After: " + joinPoint.getSignature().getName());
    }
}
