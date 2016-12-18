package com.easymock;

import java.util.logging.Logger;

import org.easymock.EasyMock;
import org.easymock.Mock;
import org.junit.Test;

public class MainClassTest {

	@Mock
	Logger logger;
	
	@Test
	public void test() {

		logger = EasyMock.createMock(Logger.class);
		MainClass mc = new MainClass();
		
		logger.info("mohammad");
		EasyMock.expectLastCall().andDelegateTo(mc);
		
		EasyMock.replay(logger);
		mc.doSomething();
//		logger.info("mohammad");
		EasyMock.verify(logger);
		
	}

}
