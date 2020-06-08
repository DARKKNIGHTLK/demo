package com.javaboy.demo.aspect;

import com.javaboy.demo.annotation.DateFormat;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class DateAspect {

    @Pointcut("@annotation(com.javaboy.demo.annotation.DateFormat)")
    public void formatPointCut() {

    }

    @Around("formatPointCut()")
    public Data around(ProceedingJoinPoint point) throws Throwable {
        Object result = point.proceed();
        System.out.println(result);

        Class<?> calzz = point.getTarget().getClass();
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        DateFormat annotation = method.getAnnotation(DateFormat.class);

        return (Data) new Date();
    }
}
