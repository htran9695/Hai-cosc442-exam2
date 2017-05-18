package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ZombieAiTest</code> contains tests for the class <code>{@link ZombieAi}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:52 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class ZombieAiTest {
	/**
	 * Run the ZombieAi(Creature,Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testZombieAi_1()
		throws Exception {
		Creature creature = CreatureFactory.createCreature();
		Creature player = CreatureFactory.createCreature2();

		ZombieAi result = new ZombieAi(creature, player);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		ZombieAi fixture = ZombieAiFactory.createZombieAi();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:653)
		//       at java.util.ArrayList.get(ArrayList.java:429)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.ZombieAi.onUpdate(ZombieAi.java:17)
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testOnUpdate_2()
		throws Exception {
		ZombieAi fixture = ZombieAiFactory.createZombieAi2();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:653)
		//       at java.util.ArrayList.get(ArrayList.java:429)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.ZombieAi.onUpdate(ZombieAi.java:17)
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testOnUpdate_3()
		throws Exception {
		ZombieAi fixture = ZombieAiFactory.createZombieAi();

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:653)
		//       at java.util.ArrayList.get(ArrayList.java:429)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
		//       at game.ZombieAi.onUpdate(ZombieAi.java:17)
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
		new org.junit.runner.JUnitCore().run(ZombieAiTest.class);
	}
}