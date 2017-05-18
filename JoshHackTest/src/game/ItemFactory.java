package game;

import java.awt.Color;


/**
 * The class <code>ItemFactory</code> implements static methods that return instances of the class <code>{@link Item}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class ItemFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private ItemFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Item}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Item createItem() {
		return new Item(' ', Color.BLACK, "", "");
	}


	/**
	 * Create an instance of the class <code>{@link Item}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Item createItem2() {
		return new Item('\n', Color.BLUE, "0123456789", "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Item}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Item createItem3() {
		return new Item('a', Color.CYAN, "An??t-1.0.txt", "An??t-1.0.txt");
	}


	/**
	 * Create an instance of the class <code>{@link Item}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Item createItem4() {
		return new Item('?', Color.DARK_GRAY, (String) null, (String) null);
	}
}