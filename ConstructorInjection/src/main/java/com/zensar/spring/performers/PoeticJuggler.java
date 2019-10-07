package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler() {
		// TODO Auto-generated constructor stub
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While reciting a poem...");
		poem.recite();
	}
	
}
