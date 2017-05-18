package game;



/**
 * The class <code>SpellFactory</code> implements static methods that return instances of the class <code>{@link Spell}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class SpellFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private SpellFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Spell}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Spell createSpell() {
		return new Spell("", 0, EffectFactory.createEffect());
	}


	/**
	 * Create an instance of the class <code>{@link Spell}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Spell createSpell2() {
		return new Spell("0123456789", 1, EffectFactory.createEffect2());
	}


	/**
	 * Create an instance of the class <code>{@link Spell}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Spell createSpell3() {
		return new Spell("An??t-1.0.txt", 7, (Effect) null);
	}
}