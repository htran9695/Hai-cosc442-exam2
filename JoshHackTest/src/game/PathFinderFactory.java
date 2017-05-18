package game;



/**
 * The class <code>PathFinderFactory</code> implements static methods that return instances of the class <code>{@link PathFinder}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class PathFinderFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private PathFinderFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link PathFinder}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static PathFinder createPathFinder() {
		return new PathFinder();
	}
}