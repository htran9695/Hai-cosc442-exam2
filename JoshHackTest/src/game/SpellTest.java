package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SpellTest</code> contains tests for the class <code>{@link Spell}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:52 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class SpellTest {
	/**
	 * Run the Spell(String,int,Effect) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testSpell_1()
		throws Exception {
		String name = "";
		int manaCost = 1;
		Effect effect = EffectFactory.createEffect();

		Spell result = new Spell(name, manaCost, effect);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.name());
		assertEquals(1, result.manaCost());
		assertEquals(true, result.requiresTarget());
	}

	/**
	 * Run the Effect effect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testEffect_1()
		throws Exception {
		Spell fixture = SpellFactory.createSpell3();

		Effect result = fixture.effect();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Effect.<init>(Effect.java:13)
		//       at game.Spell.effect(Spell.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the int manaCost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testManaCost_1()
		throws Exception {
		Spell fixture = SpellFactory.createSpell2();

		int result = fixture.manaCost();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at game.Effect.<init>(Effect.java:13)
		//       at game.EffectFactory.createEffect2(EffectFactory.java:39)
		//       at game.SpellFactory.createSpell2(SpellFactory.java:39)
		assertEquals(0, result);
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Spell fixture = SpellFactory.createSpell();

		String result = fixture.name();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean requiresTarget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testRequiresTarget_1()
		throws Exception {
		Spell fixture = SpellFactory.createSpell();

		boolean result = fixture.requiresTarget();

		// add additional test code here
		assertEquals(true, result);
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
		new org.junit.runner.JUnitCore().run(SpellTest.class);
	}
}