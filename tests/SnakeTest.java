
// Student Name : Sagar Saini
// Student ID : C0736242


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	
	
	private Snake peter;
	private Snake takis;
	
	@Before
	public void setUp() throws Exception {
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	public void test() {
		
		
		boolean takisHealthy = takis.isHealthy();
		assertEquals(true, takisHealthy);
		System.out.println("takis healthy");

		boolean notHealthy = peter.isHealthy();
		assertEquals(false, notHealthy);
		System.out.println("peter unhealthy");
		
		//cage length < snake length
		boolean fitcage = takis.fitsInCage(54);
		assertEquals(false,fitcage);
		System.out.println("takis does not fits");
		
		//cage length = snake length
		boolean fitcage1 = peter.fitsInCage(10);
		assertEquals(true,fitcage1);
		System.out.println("peter fits");

		//cage length > snake length
		boolean fitcage2 = peter.fitsInCage(12);
		assertEquals(true,fitcage2);
		System.out.println("peter fits");

		

	
		
	}

}
