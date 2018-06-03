package com.ubs.opsit.interviews.berlinclock;

/**
 *  BerlinClockMinute holds the value of Seconds,
 * 
 * @author Tushar Bishoyee
 * 
 */

public class BerlinClockSecond implements BerlinClockTimeUnit {
	
	@Override
    public String getBerlinClockLamps(int seconds) {

        if (0 == seconds%2) {
            return "Y";
        }

        return "O";
    }
}
