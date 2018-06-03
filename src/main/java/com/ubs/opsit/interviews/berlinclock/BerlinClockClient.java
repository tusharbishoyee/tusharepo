package com.ubs.opsit.interviews.berlinclock;

import com.ubs.opsit.interviews.berlinclock.impl.BerlinClockServiceImpl;

public class BerlinClockClient {	
	public static void main(String[] args) {
		String BERLIN_TIME = "16:37:16";
		BerlinClockService berlinClockService = new BerlinClockServiceImpl();
		String berlinTime = berlinClockService.getBerlinTime(BERLIN_TIME);
		System.out.println(berlinTime);
	}
}
