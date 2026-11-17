package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1) // ssh_ch6_ex7: putting order of execution
public class SecurityAspect {

    private final Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Security Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Security Aspect: Method executed and returned returnedValue");
        logger.info("\n\nSecurity up\n\n");

        return returnedValue;
    }
}
