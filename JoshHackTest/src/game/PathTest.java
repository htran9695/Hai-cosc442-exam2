package game;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PathTest</code> contains tests for the class <code>{@link Path}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:51 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class PathTest {
	/**
	 * Run the Path(Creature,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testPath_1()
		throws Exception {
		Creature creature = CreatureFactory.createCreature();
		int x = 1;
		int y = 1;

		Path result = new Path(creature, x, y);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Point> points() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testPoints_1()
		throws Exception {
		Path fixture = PathFactory.createPath();

		List<Point> result = fixture.points();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
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
	 * @generatedBy CodePro at 5/18/17 1:51 PM
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
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PathTest.class);
	}
}