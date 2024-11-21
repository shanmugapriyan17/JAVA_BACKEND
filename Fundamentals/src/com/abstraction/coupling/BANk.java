package com.abstraction.coupling;

public class BANk {
	private PNB bank;//null
	BANk(PNB bank){
		this.bank = bank;
		
	}
	public String getName() {
		return this.bank.getBankName();
	}
}

