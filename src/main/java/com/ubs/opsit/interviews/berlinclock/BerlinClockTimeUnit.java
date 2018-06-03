package com.ubs.opsit.interviews.berlinclock;

/**
 *  BerlinClockTimeUnit holds the responsibilities for the timing units such as Hours,
 *  Minutes and seconds
 * 
 * @author Tushar Bishoyee
 * 
 */
public interface BerlinClockTimeUnit {
	 
	String ALL_FOUR_LIGHTS_OFF = "OOOO";
	String ALL_ELEVEN_LIGHTS_OFF = "OOOOOOOOOOO";
	String RED_LIGHT = "R";
	String YELLOW_LIGHT = "Y";
	
	String getBerlinClockLamps(int timeUnit);    
}
