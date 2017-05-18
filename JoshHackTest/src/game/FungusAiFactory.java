package game;



/**
 * The class <code>FungusAiFactory</code> implements static methods that return instances of the class <code>{@link FungusAi}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:43 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class FungusAiFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	private FungusAiFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link FungusAi}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static FungusAi createFungusAi() {
		return new FungusAi(CreatureFactory.createCreature(), StuffFactoryFactory.createStuffFactory());
	}


	/**
	 * Create an instance of the class <code>{@link FungusAi}</code>.
	 *
	 * @generatedBy CodePro at 5/18/17 1:43 PM
	 */
	public static FungusAi createFungusAi2() {
		return new FungusAi(CreatureFactory.createCreature2(), (StuffFactory) null);
	}
}