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

import com.ubs.opsit.interviews.berlinclock.BerlinClockHour;


@RunWith(PowerMockRunner.class)
public class BerlinClockHourTest {
	
	@InjectMocks
	private BerlinClockHour subject;
	
	// To test the lamps of the top row of Hour
	@Test
	public void testLampsOfTopRow() {
	   Assert.assertEquals("OOOO", subject.getLampsOfTopRow(0));
	   Assert.assertEquals("RROO", subject.getLampsOfTopRow(13));
	   Assert.assertEquals("RRRR", subject.getLampsOfTopRow(23));
	   Assert.assertEquals("RRRR", subject.getLampsOfTopRow(24));
	}
	 
	// To test the lamps of the top row of Hour
	@Test
	public void testLampsOfLowerRow() {
	   Assert.assertEquals("OOOO", subject.getLampsOfLowerRow(0));
	   Assert.assertEquals("RRRO", subject.getLampsOfLowerRow(13));
	   Assert.assertEquals("RRRO", subject.getLampsOfLowerRow(23));
	   Assert.assertEquals("RRRR", subject.getLampsOfLowerRow(24));
	}			
}
