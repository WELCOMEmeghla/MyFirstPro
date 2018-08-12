package agileUniteTest;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class CalTest {

	@Test
	public void testPass() {

		assertEquals("error in addMethod()", 4, Cal.addMethod(2, 2));
		assertEquals("error in addMethod()", 5, Cal.addMethod(3, 2));
		assertEquals("error in addMethod()", 9, Cal.addMethod(4, 5));
		assertEquals("error in addMethod()", 0, Cal.addMethod(0, -0));
		
		assertEquals("error in subMethod()", 0, Cal.subMethod(2, 2));
		assertEquals("error in subMethod()", 1, Cal.subMethod(3, 2));
		assertEquals("error in subMethod()", -1, Cal.subMethod(4, 5));
		assertEquals("error in subMethod()", 0, Cal.subMethod(0, -0));
		
		assertEquals("error in multMethod()", 25, Cal.multMethod(5, 5));
		assertEquals("error in multMethod()", 9, Cal.multMethod(3, 3));
		assertEquals("error in multMethod()", 4, Cal.multMethod(2, 2));
		assertEquals("error in multMethod()", 100, Cal.multMethod(20, 5));
		
		//double n1 = 5.0;
		//double n2 = 5.1;
		
		//assertEquals("error divMethod()", 1.0, Cal.divMethod(n1, n2);
		
		
	}

}
