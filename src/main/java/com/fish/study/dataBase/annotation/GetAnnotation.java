package com.fish.study.dataBase.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

/**
 * .
 *
 * @author Fish Paradise
 * @version 1.0
 * @date 2019-10-08
 */
@Aspect
@Slf4j
@Component
public class GetAnnotation implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Pointcut("@annotation(com.fish.study.dataBase.annotation.TestAnnotation)")
    public void logPointCut(){
    }

    @Around("logPointCut()")
    public Object arount(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        log.info("Before + {} ", LocalDateTime.now());

        TestAnnotation testAnnotation = method.getAnnotation(TestAnnotation.class);

        Object o = point.proceed();
        log.info(o.toString());

        log.info("After + {} ",LocalDateTime.now());
        return o;
    }
}