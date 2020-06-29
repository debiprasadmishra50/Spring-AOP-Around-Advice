package demo.spring.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.spring.aopdemo.service.TrafficFortuneService;

public class AroundDemoMainApp {
	
	public static void main(String[] args) {
		
		// read the spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// get the bean from spring container
		TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("Main Program : AroundDemoMainApp");
		
		System.out.println("\nCalling getFortune()");
		
		String fortune = fortuneService.getFortune();
		
		System.out.println("\nMy fortune is : "+fortune);
		
		System.out.println("\nFinished");
		
		// close the context
		context.close();
	}
}
