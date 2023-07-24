package day02.test;
import day02.practice.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoggerTest {
	
	@Test
	void Debugtest() {
		Logger log = new Logger();
		assertEquals("hello", log.debug("hello"));
		assertEquals(5, log.debug(5));
	}
	
	@Test
	void Infotest() {
		Logger log = new Logger();
		assertEquals("info", log.info("info"));
		assertEquals(3, log.info(3)); // Corrected the assertion to assertEquals
	}
	
	@Test
	void Errortest() {
		Logger log = new Logger();
		assertEquals("error", log.error("error"));
		assertEquals(1, log.error(1));
	}
}
