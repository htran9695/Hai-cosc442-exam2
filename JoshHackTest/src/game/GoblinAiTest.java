package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GoblinAiTest</code> contains tests for the class <code>{@link GoblinAi}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:52 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class GoblinAiTest {
	/**
	 * Run the GoblinAi(Creature,Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testGoblinAi_1()
		throws Exception {
		Creature creature = CreatureFactory.createCreature();
		Creature player = CreatureFactory.createCreature2();

		GoblinAi result = new GoblinAi(creature, player);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(GoblinAiTest.class);
	}
}