package game;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PointTest</code> contains tests for the class <code>{@link Point}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:44 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class PointTest {
	/**
	 * Run the Point(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testPoint_1()
		throws Exception {
		int x = 1;
		int y = 1;
		int z = 1;

		Point result = new Point(x, y, z);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Point fixture = PointFactory.createPoint2();
		Object obj = PointFactory.createPoint3();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Point fixture = PointFactory.createPoint();
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Point fixture = PointFactory.createPoint2();
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Point fixture = PointFactory.createPoint3();
		Object obj = PointFactory.createPoint();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Point fixture = PointFactory.createPoint2();
		Object obj = PointFactory.createPoint3();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Point fixture = PointFactory.createPoint();
		Object obj = PointFactory.createPoint2();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Point fixture = PointFactory.createPoint3();
		Object obj = PointFactory.createPoint();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Point fixture = PointFactory.createPoint();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(29791, result);
	}

	/**
	 * Run the List<Point> neighbors8() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testNeighbors8_1()
		throws Exception {
		Point fixture = PointFactory.createPoint2();

		List<Point> result = fixture.neighbors8();

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Run the List<Point> neighbors8() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testNeighbors8_2()
		throws Exception {
		Point fixture = PointFactory.createPoint3();

		List<Point> result = fixture.neighbors8();

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Run the List<Point> neighbors8() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testNeighbors8_3()
		throws Exception {
		Point fixture = PointFactory.createPoint();

		List<Point> result = fixture.neighbors8();

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Run the List<Point> neighbors8() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testNeighbors8_4()
		throws Exception {
		Point fixture = PointFactory.createPoint2();

		List<Point> result = fixture.neighbors8();

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Run the List<Point> neighbors8() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Test
	public void testNeighbors8_5()
		throws Exception {
		Point fixture = PointFactory.createPoint3();

		List<Point> result = fixture.neighbors8();

		// add additional test code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/17 1:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PointTest.class);
	}
}