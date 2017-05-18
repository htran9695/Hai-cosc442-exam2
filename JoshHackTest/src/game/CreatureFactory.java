package game;

import java.awt.Color;


/**
 * The class <code>CreatureFactory</code> implements static methods that return instances of the class <code>{@link Creature}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class CreatureFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private CreatureFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Creature}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Creature createCreature() {
		return new Creature(WorldFactory.createWorld(), ' ', Color.BLACK, "", 0, 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Creature}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Creature createCreature2() {
		return new Creature(WorldFactory.createWorld(), '\n', Color.LIGHT_GRAY, "0123456789", Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link Creature}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Creature createCreature3() {
		return new Creature(WorldFactory.createWorld(), 'a', Color.CYAN, "An??t-1.0.txt", 7, 7, 7);
	}


	/**
	 * Create an instance of the class <code>{@link Creature}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Creature createCreature4() {
		return new Creature((World) null, ' ', Color.GREEN, "", Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link Creature}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Creature createCreature5() {
		return new Creature((World) null, '\n', Color.BLUE, "0123456789", 1, 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link Creature}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Creature createCreature6() {
		return new Creature((World) null, 'a', Color.MAGENTA, (String) null, 1, 0, Integer.MIN_VALUE);
	}


	/**
	 * Create an instance of the class <code>{@link Creature}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Creature createCreature7() {
		return new Creature((World) null, '?', Color.DARK_GRAY, (String) null, -1, -1, -1);
	}
}