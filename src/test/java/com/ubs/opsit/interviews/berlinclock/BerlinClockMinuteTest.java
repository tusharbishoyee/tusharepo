package com.ubs.opsit.interviews.berlinclock;

import static org.junit.Assert.*;

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

import com.ubs.opsit.interviews.berlinclock.BerlinClockMinute;


@RunWith(PowerMockRunner.class)
public class BerlinClockMinuteTest {
	
	@InjectMocks
	private BerlinClockMinute subject;
		
	// Top minutes should have 3rd, 6th and 9th lamps in red to indicate first quarter, half and last quarter
    @Test
	public void testLampsOfFirstRowOfButtomFor3rd6th9th() {
	   String minutes = subject.getLampsOfFirstRowOfButtom(32);
	   Assert.assertEquals("R", minutes.substring(2, 3));
	   Assert.assertEquals("R", minutes.substring(5, 6));
	   Assert.assertEquals("O", minutes.substring(8, 9));
	}
	
    // Top minutes should light a yellow lamp for every 5 minutes unless it's first quarter, half or last quarter
    @Test
    public void testLampsOfFirstRowOfButtom() {    	
        Assert.assertEquals("OOOOOOOOOOO", subject.getLampsOfFirstRowOfButtom(0));
        Assert.assertEquals("YYROOOOOOOO", subject.getLampsOfFirstRowOfButtom(17));
        Assert.assertEquals("YYRYYRYYRYY", subject.getLampsOfFirstRowOfButtom(59));
    }
    
    // Bottom minutes should light a yellow lamp for every minute left from top minutes
    @Test
    public void getLampsOfLastRowOfButtom() {
        Assert.assertEquals("OOOO", subject.getLampsOfLastRowOfButtom(0));
        Assert.assertEquals("YYOO", subject.getLampsOfLastRowOfButtom(17));
        Assert.assertEquals("YYYY", subject.getLampsOfLastRowOfButtom(59));
    }			
}
