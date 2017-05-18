package game;

import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PathFinderTest</code> contains tests for the class <code>{@link PathFinder}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:52 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class PathFinderTest {
	/**
	 * Run the PathFinder() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testPathFinder_1()
		throws Exception {

		PathFinder result = new PathFinder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<Point> findPath(Creature,Point,Point,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testFindPath_1()
		throws Exception {
		PathFinder fixture = PathFinderFactory.createPathFinder();
		Creature creature = CreatureFactory.createCreature();
		Point start = PointFactory.createPoint();
		Point end = PointFactory.createPoint2();
		int maxTries = 1;

		ArrayList<Point> result = fixture.findPath(creature, start, end, maxTries);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ArrayList<Point> findPath(Creature,Point,Point,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testFindPath_2()
		throws Exception {
		PathFinder fixture = PathFinderFactory.createPathFinder();
		Creature creature = CreatureFactory.createCreature2();
		Point start = PointFactory.createPoint3();
		Point end = PointFactory.createPoint();
		int maxTries = 1;

		ArrayList<Point> result = fixture.findPath(creature, start, end, maxTries);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ArrayList<Point> findPath(Creature,Point,Point,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testFindPath_3()
		throws Exception {
		PathFinder fixture = PathFinderFactory.createPathFinder();
		Creature creature = CreatureFactory.createCreature3();
		Point start = PointFactory.createPoint2();
		Point end = PointFactory.createPoint3();
		int maxTries = 1;

		ArrayList<Point> result = fixture.findPath(creature, start, end, maxTries);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ArrayList<Point> findPath(Creature,Point,Point,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testFindPath_4()
		throws Exception {
		PathFinder fixture = PathFinderFactory.createPathFinder();
		Creature creature = CreatureFactory.createCreature4();
		Point start = PointFactory.createPoint();
		Point end = PointFactory.createPoint2();
		int maxTries = 0;

		ArrayList<Point> result = fixture.findPath(creature, start, end, maxTries);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
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
	 * @generatedBy CodePro at 5/18/17 1:52 PM
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
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PathFinderTest.class);
	}
}