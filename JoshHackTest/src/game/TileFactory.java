package game;



/**
 * The class <code>TileFactory</code> implements static methods that return instances of the class <code>{@link Tile}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class TileFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private TileFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Tile createTile() {
		return Tile.BOUNDS;
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Tile createTile2() {
		return Tile.FLOOR;
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Tile createTile3() {
		return Tile.STAIRS_DOWN;
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Tile createTile4() {
		return Tile.STAIRS_UP;
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Tile createTile5() {
		return Tile.UNKNOWN;
	}


	/**
	 * Create an instance of the class <code>{@link Tile}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Tile createTile6() {
		return Tile.WALL;
	}
}