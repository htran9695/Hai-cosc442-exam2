package game;



/**
 * The class <code>InventoryFactory</code> implements static methods that return instances of the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class InventoryFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private InventoryFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Inventory}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static Inventory createInventory() {
		return new Inventory(0);
	}
}