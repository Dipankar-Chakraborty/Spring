package com.zensar.spring.performers;

import com.zensar.spring.exceptions.PerformerException;

public interface Performer {
	void perform() throws PerformerException;
}
