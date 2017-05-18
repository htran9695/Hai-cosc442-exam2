package game;



/**
 * The class <code>LineFactory</code> implements static methods that return instances of the class <code>{@link Line}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class LineFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private LineFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Line}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Line createLine() {
		return new Line(-1, -1, -1, -1);
	}


	/**
	 * Create an instance of the class <code>{@link Line}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Line createLine2() {
		return new Line(0, 0, 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Line}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Line createLine3() {
		return new Line(1, 1, 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link Line}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Line createLine4() {
		return new Line(7, 7, 7, 7);
	}
}