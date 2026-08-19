package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankAspect {

	@Before("execution(* com.example.demo.BankService.*(..))")
	public void logBefore(JoinPoint joinPoint) {

		Object[] args = joinPoint.getArgs();

		System.out.println();
		System.out.println("========== AOP BEFORE ==========");

		System.out.println("AUDIT: Method " + joinPoint.getSignature().getName() + " is starting");

		System.out.println("Arguments:");

		for (Object arg : args) {
			System.out.println(" -> " + arg);
		}
	}

	
	@After("execution(* com.example.demo.BankService.*(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("AUDIT: Method " + joinPoint.getSignature().getName() + " execution completed");

		System.out.println("================================");
	}

	@AfterReturning(pointcut = "execution(* com.example.demo.BankService.*(..))", returning = "result")
	public void logSuccess(JoinPoint joinPoint, Object result) {

		System.out.println();

		System.out.println("========== AOP SUCCESS ==========");

		System.out.println("AUDIT: Method " + joinPoint.getSignature().getName() + " executed successfully");

		if (result != null) {

			System.out.println("AUDIT: Returned value = " + result);
		}

		System.out.println("=================================");
	}

	
	@AfterThrowing(pointcut = "execution(* com.example.demo.BankService.*(..))", throwing = "ex")
	public void logFailure(JoinPoint joinPoint, Exception ex) {

		Object[] args = joinPoint.getArgs();

		System.out.println();

		System.out.println("========== AOP FAILURE ==========");

		System.out.println("AUDIT: Method " + joinPoint.getSignature().getName() + " failed");

		System.out.println("Arguments:");

		for (Object arg : args) {
			System.out.println(" -> " + arg);
		}

		System.out.println("AUDIT: Reason = " + ex.getMessage());

		System.out.println("==================================");
	}
}