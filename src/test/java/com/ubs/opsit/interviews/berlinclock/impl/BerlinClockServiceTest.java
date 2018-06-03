package com.ubs.opsit.interviews.berlinclock.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.ubs.opsit.interviews.berlinclock.impl.BerlinClockServiceImpl;
import com.ubs.opsit.interviews.berlinclock.BerlinClockHour;
import com.ubs.opsit.interviews.berlinclock.BerlinClockMinute;
import com.ubs.opsit.interviews.berlinclock.BerlinClockSecond;


@RunWith(PowerMockRunner.class)
public class BerlinClockServiceTest {
	
	private String BERLIN_TIME = "16:37:16";
	private String BERLIN_LAMP = "YRRROROOOYYRYYRYOOOOYYOO";
	private String BERLIN_LAMP_HOUR = "RRROROOO";
	private String BERLIN_LAMP_MIN =  "YYRYYRYOOOO";
	private String BERLIN_LAMP_SEC = "YYOO";
	
	@InjectMocks
	private BerlinClockService subject;
	
	@Mock
	BerlinClockHour berlinClockHour;
	
	@Mock
	BerlinClockMinute berlinClockMinute;
	
	@Mock
	BerlinClockSecond berlinClockSecond;

	
	@Before
	public void init() {
		subject = new BerlinClockServiceImpl();
	
	}
		
    @Test
    public void testBerlineTime() {
    	
    	//SETUP
    	Mockito.when(berlinClockHour.getBerlinClockLamps(Mockito.any(String.class))).thenReturn(BERLIN_LAMP_HOUR);
    	Mockito.when(berlinClockMinute.getBerlinClockLamps(Mockito.any(String.class))).thenReturn(BERLIN_LAMP_MIN);
    	Mockito.when(berlinClockSecond.getBerlinClockLamps(Mockito.any(String.class))).thenReturn(BERLIN_LAMP_SEC);
    	
    	//CALL
        String berlinTime = subject.getBerlinTime(BERLIN_TIME);
        
        //VERIFY
        assertEquals(berlinTime.length(), BERLIN_LAMP.length());
    }
	
}
