package com.ubs.opsit.interviews.berlinclock.impl;

import com.ubs.opsit.interviews.berlinclock.BerlinClockTime;
import com.ubs.opsit.interviews.berlinclock.BerlinClockService;
import com.ubs.opsit.interviews.berlinclock.BerlinClockTimeUnit;
import com.ubs.opsit.interviews.berlinclock.BerlinClockSecond;
import com.ubs.opsit.interviews.berlinclock.BerlinClockHour;
import com.ubs.opsit.interviews.berlinclock.BerlinClockMinute;


public class BerlinClockServiceImpl implements BerlinClockService {
	 
	BerlinClockTime berlinClockTime = new BerlinClockTime(); 

	public void calculateTime() {
		berlinClockTime.add(new BerlinClockSecond());
		berlinClockTime.add(new BerlinClockHour());
		berlinClockTime.add(new BerlinClockMinute());
	}

   public String getBerlinTime(String time) {
	   
	   calculateTime();
	   
	   int i=0;
	   int j=2;
	   
	   StringBuilder berlinTime = new StringBuilder();
	   String[] timeAfterSplit = time.split(":");	 
	   
	   for(BerlinClockTimeUnit timeUnit : berlinClockTime){
	     	for(String timeSplit : timeAfterSplit){
	     		berlinTime.append(berlinClockTime.get(i).getBerlinClockLamps(Integer.parseInt(timeAfterSplit[j]))).append("\n");
	           i++;
	           j--;
	           break;
	        }
	   }

	  return berlinTime.toString();	    
	}
}
