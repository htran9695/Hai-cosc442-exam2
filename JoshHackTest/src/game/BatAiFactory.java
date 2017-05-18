package game;



/**
 * The class <code>BatAiFactory</code> implements static methods that return instances of the class <code>{@link BatAi}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class BatAiFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private BatAiFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link BatAi}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static BatAi createBatAi() {
		return new BatAi(CreatureFactory.createCreature());
	}
}