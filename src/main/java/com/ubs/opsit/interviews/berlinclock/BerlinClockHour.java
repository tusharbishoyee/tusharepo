package com.ubs.opsit.interviews.berlinclock;

/**
 *  BerlinClockHour holds the value of Hours,
 * 
 * @author Tushar Bishoyee
 * 
 */

public class BerlinClockHour implements BerlinClockTimeUnit {

	    @Override
	    public String getBerlinClockLamps(int hours) {
	        return getLampsOfTopRow(hours) + "\n" + getLampsOfLowerRow(hours);
	    }   
	    
	    
	    /**
	     *  getLampsOfTopRow() calculates the value of the Top row.
	     *  where each hour is multiple of 5
	     * 
	     */
	    
	    public String getLampsOfTopRow(int hours) {

	        StringBuilder lamps = new StringBuilder(ALL_FOUR_LIGHTS_OFF);

	        for (int i = 0; i < (hours / 5); i++) {
	            lamps.replace(i, i + 1, RED_LIGHT);
	        }
	        return lamps.toString();
	    }
	    
	    /**
	     *  getLampsOfLowerRow() calculates the value of the Lower row.
	     *  where each hour is multiple of 1
	     * 
	     */

	    public String getLampsOfLowerRow(int hours) {

	        StringBuilder lamps = new StringBuilder(ALL_FOUR_LIGHTS_OFF);
	        for (int i = 0; i < (hours % 5); i++) {
	            lamps.replace(i, i + 1, RED_LIGHT);
	        }
	        return lamps.toString();
	    }
}
