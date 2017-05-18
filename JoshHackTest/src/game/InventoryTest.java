package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:52 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		int max = 1;

		Inventory result = new Inventory(max);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isFull());
	}

	/**
	 * Run the void add(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem();

		fixture.add(item);

		// add additional test code here
	}

	/**
	 * Run the void add(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem2();

		fixture.add(item);

		// add additional test code here
	}

	/**
	 * Run the void add(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem3();

		fixture.add(item);

		// add additional test code here
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem3();

		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem4();

		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testContains_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem();

		boolean result = fixture.contains(item);

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the Item[] getItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testGetItems_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		Item[] result = fixture.getItems();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testIsFull_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testIsFull_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isFull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testIsFull_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		boolean result = fixture.isFull();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem4();

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem();

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Item item = ItemFactory.createItem2();

		fixture.remove(item);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}