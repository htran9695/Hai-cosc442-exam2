package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CreatureAiTest</code> contains tests for the class <code>{@link CreatureAi}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:51 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class CreatureAiTest {
	/**
	 * Run the CreatureAi(Creature) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCreatureAi_1()
		throws Exception {
		Creature creature = CreatureFactory.createCreature();

		CreatureAi result = new CreatureAi(creature);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanPickup_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canPickup();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanPickup_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canPickup();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canPickup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanPickup_3()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canPickup();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanRangedWeaponAttack_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Creature other = CreatureFactory.createCreature5();

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanRangedWeaponAttack_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Creature other = CreatureFactory.createCreature6();

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanRangedWeaponAttack_3()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Creature other = CreatureFactory.createCreature7();

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canRangedWeaponAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanRangedWeaponAttack_4()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Creature other = CreatureFactory.createCreature();

		boolean result = fixture.canRangedWeaponAttack(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanSee_3()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanSee_4()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanSee_5()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanSee_6()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanSee_7()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanThrowAt_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Creature other = CreatureFactory.createCreature2();

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanThrowAt_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Creature other = CreatureFactory.createCreature3();

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canThrowAt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanThrowAt_3()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Creature other = CreatureFactory.createCreature4();

		boolean result = fixture.canThrowAt(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanUseBetterEquipment_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanUseBetterEquipment_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanUseBetterEquipment_3()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanUseBetterEquipment_4()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanUseBetterEquipment_5()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean canUseBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testCanUseBetterEquipment_6()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		boolean result = fixture.canUseBetterEquipment();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getName(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Item item = ItemFactory.createItem();

		String result = fixture.getName(item);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetName_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Item item = ItemFactory.createItem2();

		String result = fixture.getName(item);

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetWeaponToThrow_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetWeaponToThrow_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetWeaponToThrow_3()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetWeaponToThrow_4()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetWeaponToThrow_5()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetWeaponToThrow_6()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Item getWeaponToThrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testGetWeaponToThrow_7()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		Item result = fixture.getWeaponToThrow();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void hunt(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testHunt_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Creature target = CreatureFactory.createCreature2();

		fixture.hunt(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:653)
		//       at java.util.ArrayList.get(ArrayList.java:429)
		//       at game.CreatureAi.hunt(CreatureAi.java:114)
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testOnEnter_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
	}

	/**
	 * Run the void onEnter(int,int,int,Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testOnEnter_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int x = 1;
		int y = 1;
		int z = 1;
		Tile tile = Tile.BOUNDS;

		fixture.onEnter(x, y, z, tile);

		// add additional test code here
	}

	/**
	 * Run the void onGainLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testOnGainLevel_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.onGainLevel();

		// add additional test code here
	}

	/**
	 * Run the void onNotify(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testOnNotify_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		String message = "";

		fixture.onNotify(message);

		// add additional test code here
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.onUpdate();

		// add additional test code here
	}

	/**
	 * Run the Tile rememberedTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testRememberedTile_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.rememberedTile(wx, wy, wz);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(unknown)", result.details());
		assertEquals(true, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals(' ', result.glyph());
		assertEquals("UNKNOWN", result.name());
		assertEquals("UNKNOWN", result.toString());
		assertEquals(5, result.ordinal());
	}

	/**
	 * Run the void setName(Item,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();
		Item item = ItemFactory.createItem3();
		String name = "";

		fixture.setName(item, name);

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_3()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_4()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_5()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_6()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_7()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_8()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_9()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_10()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_11()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_12()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_13()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_14()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_15()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void useBetterEquipment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testUseBetterEquipment_16()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.useBetterEquipment();

		// add additional test code here
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testWander_1()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.wander();

		// add additional test code here
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testWander_2()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.wander();

		// add additional test code here
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testWander_3()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.wander();

		// add additional test code here
	}

	/**
	 * Run the void wander() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	@Test
	public void testWander_4()
		throws Exception {
		CreatureAi fixture = CreatureAiFactory.createCreatureAi();

		fixture.wander();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 1:51 PM
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
	 * @generatedBy CodePro at 5/18/17 1:51 PM
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
	 * @generatedBy CodePro at 5/18/17 1:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureAiTest.class);
	}
}