package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem {
	private static final String LINES[]= {
			"Twinkle Twinkle Little Star", 
			"How I wonder what you are", 
			"Up above the world so high",
			"Like a diamond in the sky"
	};

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for(String line:LINES) {
			System.out.println(line);
		}
	}

}
