package game;

import java.util.ArrayList;
import java.util.List;


/**
 * The class <code>PlayerAiFactory</code> implements static methods that return instances of the class <code>{@link PlayerAi}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class PlayerAiFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private PlayerAiFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link PlayerAi}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static PlayerAi createPlayerAi() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		return new PlayerAi(CreatureFactory.createCreature2(), list, (FieldOfView) null);
	}


	/**
	 * Create an instance of the class <code>{@link PlayerAi}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static PlayerAi createPlayerAi2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		return new PlayerAi(CreatureFactory.createCreature(), list, FieldOfViewFactory.createFieldOfView());
	}


	/**
	 * Create an instance of the class <code>{@link PlayerAi}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static PlayerAi createPlayerAi3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("0123456789");
		return new PlayerAi(CreatureFactory.createCreature3(), list, (FieldOfView) null);
	}
}