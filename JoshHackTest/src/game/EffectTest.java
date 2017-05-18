package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EffectTest</code> contains tests for the class <code>{@link Effect}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:51 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class EffectTest {
	/**
	 * Run the Effect(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testEffect_1()
		throws Exception {
		int duration = 1;

		Effect result = new Effect(duration);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDone());
	}

	/**
	 * Run the Effect(Effect) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testEffect_2()
		throws Exception {
		Effect other = EffectFactory.createEffect();

		Effect result = new Effect(other);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isDone());
	}

	/**
	 * Run the void end(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testEnd_1()
		throws Exception {
		Effect fixture = EffectFactory.createEffect2();
		Creature creature = CreatureFactory.createCreature3();

		fixture.end(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Effect.<init>(Effect.java:13)
		//       at game.EffectFactory.createEffect2(EffectFactory.java:39)
	}

	/**
	 * Run the boolean isDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testIsDone_1()
		throws Exception {
		Effect fixture = EffectFactory.createEffect();

		boolean result = fixture.isDone();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isDone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testIsDone_2()
		throws Exception {
		Effect fixture = EffectFactory.createEffect2();

		boolean result = fixture.isDone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Effect.<init>(Effect.java:13)
		//       at game.EffectFactory.createEffect2(EffectFactory.java:39)
		assertTrue(result);
	}

	/**
	 * Run the void start(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		Effect fixture = EffectFactory.createEffect();
		Creature creature = CreatureFactory.createCreature2();

		fixture.start(creature);

		// add additional test code here
	}

	/**
	 * Run the void update(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Effect fixture = EffectFactory.createEffect2();
		Creature creature = CreatureFactory.createCreature();

		fixture.update(creature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Effect.<init>(Effect.java:13)
		//       at game.EffectFactory.createEffect2(EffectFactory.java:39)
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
		new org.junit.runner.JUnitCore().run(EffectTest.class);
	}
}