package Assignment2.Assi2;

 import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class ArrayReversorTest {
	@Mock
	private ArrayFlattenerService arrayFlattenerService;
	private ArrayReversor arrayReversor;
    
	@Before
	public void setUp() throws Exception {
	this.arrayReversor= new ArrayReversor(arrayFlattenerService);
	
	}

	@After
	public void tearDown() throws Exception {
	this.arrayReversor=null;	
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testReverseArray() {
	 when(arrayFlattenerService.flattenArray(new Integer[][] {{1,3}, {0}, {4,5,9}})).thenReturn(new Integer[]{1,3,0,4,5,9}); 
	  Integer[] expected = new Integer[]{9,5,4,0,3,1};
	  Integer[] actual= arrayReversor.reverseArray(new Integer[][] {{1,3}, {0}, {4,5,9}});
	  assertEquals(expected,actual);
	  assertThat(actual,is(expected));
 	  verify(arrayFlattenerService).flattenArray(new Integer[][] {{1,3}, {0}, {4,5,9}});                               
	    
     }
//	public void testComputeSumOfSqueres() {
//		when(squareComputingService.computeSquares(new Integer[] {1,2,3})).thenReturn(new Integer[] {1, 4, 9});
//	    Integer actual = SumOfSquaresComputer.computeSumOfSqueres(new Integer[] {1,2,3});
//	    Integer expected = 14;
//	    assertEquals(expected , actual);
//	    assertThat(actual, is(expected));
//	    verify(squareComputingService).computeSquares(new Integer[] {1,2,3});                              // the squares are 
//	    
		
	}


