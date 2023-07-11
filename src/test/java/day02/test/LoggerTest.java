package day02.test;
import day02.practice.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class LoggerTest {
	
	
	@Test
	void Debugtest() {
		Logger log = new Logger();
		assertEquals("hello",log.debug("hello"));
		assertEquals(5,log.debug(5));
	}
	
	@Test
	void Infotest() {
		Logger log = new Logger();
		assertEquals("info",log.info("info"));
		assertNotEquals(10,log.info(3));
	}
	
	@Test
	void Errortest() {
		Logger log = new Logger();
		assertEquals("error",log.error("error"));
		assertEquals(1,log.error(1));
	}
		
		
	
		
	
	
	

}