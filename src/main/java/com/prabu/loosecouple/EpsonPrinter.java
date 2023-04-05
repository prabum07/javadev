package com.prabu.loosecouple;

import org.springframework.stereotype.Component;

@Component("newPrinter")
public class EpsonPrinter implements Repo {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "EpsonPrinter";
	}

}
