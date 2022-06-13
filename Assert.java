package co.misbah;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {
	@Test
	public void testAssertion()
	{
		String str = new String ("mishi");
		String str1 = new String ("mishi");
		   String str3 = null;
		   String str4 = "mishi";
		   String str5 = "mishi";
		   int val1 = 5;
		   int val2 = 6;
		   String[] exceptedArray= {"one" , "two" , "three"};
		   String[] resultArray= {"one" , "two" , "three"};
		   assertEquals(str,str1);
		   //check for true
		  assertTrue(val1<val2);
		  //check for false
		  assertFalse(val1<val2); 
		  //check for null
		  assertNotNull(str);
		  
		  assertNull(str3);
		  
		  //check if the refrence is to the same object
		  assertSame(str4,str5);
		  //not same
		  assertNotSame(str3,str1);
		  
		  assertArrayEquals(exceptedArray,resultArray);
		  
		  
			   
	}


}
