package com.prabu.loosecouple;

import org.springframework.stereotype.Component;

@Component("oldPrinter")
public class HPPrinter implements Repo {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "HPPrinter";
	}

}
