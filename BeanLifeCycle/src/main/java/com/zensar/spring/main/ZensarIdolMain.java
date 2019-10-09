package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.instruments.Instrument;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Performer p = ctx.getBean("Jack Ryde", Performer.class);
		p.perform();
		Instrument i = ctx.getBean("guitar", Instrument.class);
		i.play();
		ConfigurableApplicationContext cfgCtx = (ConfigurableApplicationContext) ctx;
		cfgCtx.close();//shutting down spring ioc container
	}

}
