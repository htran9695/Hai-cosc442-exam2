package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FungusAiTest</code> contains tests for the class <code>{@link FungusAi}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:51 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class FungusAiTest {
	/**
	 * Run the FungusAi(Creature,StuffFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testFungusAi_1()
		throws Exception {
		Creature creature = CreatureFactory.createCreature();
		StuffFactory factory = StuffFactoryFactory.createStuffFactory();

		FungusAi result = new FungusAi(creature, factory);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		FungusAi fixture = FungusAiFactory.createFungusAi();

		fixture.onUpdate();

		// add additional test code here
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testOnUpdate_2()
		throws Exception {
		FungusAi fixture = FungusAiFactory.createFungusAi2();

		fixture.onUpdate();

		// add additional test code here
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testOnUpdate_3()
		throws Exception {
		FungusAi fixture = FungusAiFactory.createFungusAi();

		fixture.onUpdate();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(FungusAiTest.class);
	}
}