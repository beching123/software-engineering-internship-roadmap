package com.example.demo.aspect;

import com.example.demo.comment.Comment;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(2) // ssh_ch6_ex7 putting the other of interception in the chain
public class LoggingAspect {

    /*private static final Log log = LogFactory.getLog(LoggingAspect.class);
    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // @Around("execution(* com.example.demo.services.*.*(..))")
    //@Around("@annotation(ToLog)") // ssh_ch6_ex5
    @AfterReturning(value = "@annotation(ToLog)", returning = "returnValue")
    public void log(Object returnedValue)
            throws Throwable {

        /* ssh_ch6_ex2
        String methodName = joinPoint.getSignature().getName(); // A getting the name
        Object[] arguments = joinPoint.getArgs(); // arguments

        logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + "will executes");

        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object [] newArguments = {comment};

        Object returnedByMethod = joinPoint.proceed(newArguments);

        logger.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
        logger.info("Method executed and returned " + returnedValue);*/

    //}


    // exercise ssh_ch6_ex6

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Logging Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed(); // getting the return value

        logger.info("Logging Aspect: Method executed and returned " + returnedValue);
        logger.info("\n\nLog up\n\n");

        return returnedValue;
    }

}

