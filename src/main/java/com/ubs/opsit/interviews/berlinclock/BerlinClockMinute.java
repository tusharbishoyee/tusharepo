package com.ubs.opsit.interviews.berlinclock;

/**
 *  BerlinClockMinute holds the value of Minutes,
 * 
 * @author Tushar Bishoyee
 * 
 */

public class BerlinClockMinute implements BerlinClockTimeUnit {
        
    @Override
    public String getBerlinClockLamps(int minutes) {

        int minutesDiv5 = minutes / 5;
        int minutesMod5 = minutes % 5;

        return getLampsOfFirstRowOfButtom(minutesDiv5) + "\n" + getLampsOfLastRowOfButtom(minutesMod5);
    }
    
    /**
     *  getLampsOfFirstRowOfButtom() holds the value of the 1st row of buttom.
     *  (3rd, 6th and 9th indicates the quarters)
     * 
     */

    public String getLampsOfFirstRowOfButtom(int minutes) {

        StringBuilder lamps = new StringBuilder(ALL_ELEVEN_LIGHTS_OFF);

        for (int i = 0; i < minutes; i++) {
            if (0 == (i + 1) % 3) {
                lamps.replace(i, i + 1, RED_LIGHT);
            } else {
                lamps.replace(i, i + 1, YELLOW_LIGHT);
            }
        }
        return lamps.toString();
        
    }
    
    /**
     *  getLampsOfLastRowOfButtom() holds the value of the last row of buttom.
     *  where each minute is multiple of 1
     * 
     */

    public String getLampsOfLastRowOfButtom(int minutes) {

        StringBuilder lamps = new StringBuilder(ALL_FOUR_LIGHTS_OFF);

        for (int i = 0; i < minutes; i++) {
            lamps.replace(i, i + 1, YELLOW_LIGHT);
        }
        return lamps.toString();
    }

}
