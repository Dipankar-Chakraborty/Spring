package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformerException;

@Component("Jaggu")
public class Juggler implements Performer {
	@Value("5")
	private int beanBags;

	@Override
	public void perform() throws PerformerException {
		// TODO Auto-generated method stub
		if(beanBags<=3) {
			throw new PerformerException("Number of Bean Bags are not sufficient");
		}
		else {
			System.out.println("Juggler is juggling "+beanBags);
		}
	}

}
