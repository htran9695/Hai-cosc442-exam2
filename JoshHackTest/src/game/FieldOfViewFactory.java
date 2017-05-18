package game;



/**
 * The class <code>FieldOfViewFactory</code> implements static methods that return instances of the class <code>{@link FieldOfView}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class FieldOfViewFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private FieldOfViewFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link FieldOfView}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static FieldOfView createFieldOfView() {
		return new FieldOfView(WorldFactory.createWorld());
	}
}