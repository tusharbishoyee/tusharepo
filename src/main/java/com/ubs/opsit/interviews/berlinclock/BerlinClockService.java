package com.ubs.opsit.interviews.berlinclock;

/**
 * Composite Service to provide the timing related operation of the Berlin Clock.
 *  This is access point for the client.
 * @author Tushar Bishoyee
 *
 */
public interface BerlinClockService {	
	String getBerlinTime(String time);
}
