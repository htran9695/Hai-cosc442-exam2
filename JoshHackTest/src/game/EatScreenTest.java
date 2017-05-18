package game;

import org.junit.*;
import ui.Screen;
import static org.junit.Assert.*;

/**
 * The class <code>EatScreenTest</code> contains tests for the class <code>{@link EatScreen}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:53 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class EatScreenTest {
	/**
	 * Run the EatScreen(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:53 PM
	 */
	@Test
	public void testEatScreen_1()
		throws Exception {
		Creature player = CreatureFactory.createCreature();

		EatScreen result = new EatScreen(player);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVerb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:53 PM
	 */
	@Test
	public void testGetVerb_1()
		throws Exception {
		EatScreen fixture = EatScreenFactory.createEatScreen();

		String result = fixture.getVerb();

		// add additional test code here
		assertEquals("eat", result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:53 PM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		EatScreen fixture = EatScreenFactory.createEatScreen();
		Item item = ItemFactory.createItem();

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAcceptable(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:53 PM
	 */
	@Test
	public void testIsAcceptable_2()
		throws Exception {
		EatScreen fixture = EatScreenFactory.createEatScreen();
		Item item = ItemFactory.createItem2();

		boolean result = fixture.isAcceptable(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Screen use(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:53 PM
	 */
	@Test
	public void testUse_1()
		throws Exception {
		EatScreen fixture = EatScreenFactory.createEatScreen();
		Item item = ItemFactory.createItem3();

		Screen result = fixture.use(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Creature.nameOf(Creature.java:543)
		//       at game.Creature.eat(Creature.java:406)
		//       at game.EatScreen.use(EatScreen.java:24)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 1:53 PM
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
	 * @generatedBy CodePro at 5/18/17 1:53 PM
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
	 * @generatedBy CodePro at 5/18/17 1:53 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EatScreenTest.class);
	}
}