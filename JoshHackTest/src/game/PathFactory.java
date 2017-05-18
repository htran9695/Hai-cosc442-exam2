package game;



/**
 * The class <code>PathFactory</code> implements static methods that return instances of the class <code>{@link Path}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class PathFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private PathFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Path}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Path createPath() {
		return new Path(CreatureFactory.createCreature(), 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Path}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Path createPath2() {
		return new Path(CreatureFactory.createCreature2(), 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link Path}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Path createPath3() {
		return new Path(CreatureFactory.createCreature3(), 7, 7);
	}
}