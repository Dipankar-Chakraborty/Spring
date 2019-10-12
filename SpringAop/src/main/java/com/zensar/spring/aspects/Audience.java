package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	@Pointcut("execution(* *.perform(..))")//..indicates all parameter * * indicates method belongs to any class
	//@Pointcut("execution(void *.perform(..))")
	//@Pointcut("execution(void com.zensar.spring.performers.perform(..)")
	//@Pointcut("execution(public void com.zensar.spring.performers.perform(..)")
	public void performancePointCut() {
		
	}
	//@Before(value = "performancePointCut()")
	@Before("execution(* *.perform(..))")
	public void takeSeats() {
		System.out.println("Audience is taking their seats");
	}
	@Before("performancePointCut()")
	public void switchOffCellPhones() {
		System.out.println("Audience is switching off their cell phones");
	}
	@AfterReturning( "performancePointCut()")
	public void applaud() {
		System.out.println("Clap Clap Clap");
	}
	@AfterThrowing( "performancePointCut()")
	public void demandRefund() {
		System.out.println("Give me my money back !");
	}
}
