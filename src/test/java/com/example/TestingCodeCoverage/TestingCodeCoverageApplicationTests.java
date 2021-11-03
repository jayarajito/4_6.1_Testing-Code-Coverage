package com.example.TestingCodeCoverage;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingCodeCoverageApplicationTests {
	
	private TestingCodeCoverageApplication analyser = new TestingCodeCoverageApplication();
	

	@Test
	    public void testWordCount() {     	 
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));	 
    }


}
