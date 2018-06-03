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


@RunWith(PowerMockRunner.class)
public class BerlinClockSecondTest {
	
	@InjectMocks
	private BerlinClockSecond subject;
		
	@Test
    public void testBerlinClockLampsSeconds() {
        Assert.assertEquals("Y", subject.getBerlinClockLamps(0));
        Assert.assertEquals("O", subject.getBerlinClockLamps(1));
        Assert.assertEquals("O", subject.getBerlinClockLamps(59));
    }
}
