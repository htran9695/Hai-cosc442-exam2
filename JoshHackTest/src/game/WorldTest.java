package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WorldTest</code> contains tests for the class <code>{@link World}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:52 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class WorldTest {
	/**
	 * Run the World(Tile[][][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testWorld_1()
		throws Exception {
		Tile[][][] tiles = new Tile[][][] {};

		World result = new World(tiles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void add(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Creature pet = CreatureFactory.createCreature5();

		fixture.add(pet);

		// add additional test code here
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptyLocation_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Creature creature = CreatureFactory.createCreature();
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptyLocation_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Creature creature = CreatureFactory.createCreature2();
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
	}

	/**
	 * Run the void addAtEmptyLocation(Creature,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptyLocation_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Creature creature = CreatureFactory.createCreature3();
		int z = 1;

		fixture.addAtEmptyLocation(creature, z);

		// add additional test code here
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptyLocation_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem2();
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptyLocation_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem3();
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
	}

	/**
	 * Run the void addAtEmptyLocation(Item,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptyLocation_6()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem4();
		int depth = 1;

		fixture.addAtEmptyLocation(item, depth);

		// add additional test code here
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptySpace_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = null;
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptySpace_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptySpace_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem2();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptySpace_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem3();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptySpace_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem4();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testAddAtEmptySpace_6()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.World.item(World.java:114)
		//       at game.World.color(World.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testColor_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.World.item(World.java:114)
		//       at game.World.color(World.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the Color color(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testColor_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Color result = fixture.color(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.World.item(World.java:114)
		//       at game.World.color(World.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testCreature_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testCreature_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int depth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testDepth_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		int result = fixture.depth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testDig_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testDig_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.World.item(World.java:114)
		//       at game.World.glyph(World.java:51)
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testGlyph_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.World.item(World.java:114)
		//       at game.World.glyph(World.java:51)
		assertEquals(' ', result);
	}

	/**
	 * Run the char glyph(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testGlyph_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		char result = fixture.glyph(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.World.item(World.java:114)
		//       at game.World.glyph(World.java:51)
		assertEquals(' ', result);
	}

	/**
	 * Run the int height() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testHeight_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		int result = fixture.height();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Item result = fixture.item(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.World.item(World.java:114)
		assertNotNull(result);
	}

	/**
	 * Run the void remove(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Creature other = CreatureFactory.createCreature4();

		fixture.remove(other);

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
		World fixture = WorldFactory.createWorld();
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
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem2();

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
	public void testRemove_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem3();

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
	public void testRemove_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
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
	public void testRemove_6()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem();

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testRemove_7()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.remove(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.World.remove(World.java:131)
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = -1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals('x', result.glyph());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals('x', result.glyph());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testTile_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = -1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals('x', result.glyph());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testTile_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals('x', result.glyph());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testTile_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = -1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals('x', result.glyph());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testTile_6()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals('x', result.glyph());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testTile_7()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals('x', result.glyph());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the int width() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:52 PM
	 */
	@Test
	public void testWidth_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		int result = fixture.width();

		// add additional test code here
		assertEquals(1, result);
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
		new org.junit.runner.JUnitCore().run(WorldTest.class);
	}
}