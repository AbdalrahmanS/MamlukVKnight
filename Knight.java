/*
 * Project: Mamluk V Knight
 * Author: github.com/AbdalrahmanS
 * Last edited: 7/16/2021
 * Brief Description: This class is very simple, it just extends the GenericArmy method.
 * It mainly just  sets the attack, defense, and health for this type of attacker.
 * The Mamluk's have much higher attacks then the knights, but much lower defence
 * Extra Resources: GeneralInfo.txt, GenericArmy.java
 */

public class Knight extends GenericArmy {
	
	/*
	 * Method: Constructor
	 * General constructor
	 */
	public Knight() {
		
	}
	
	/*
	 * Method: Constructor
	 * This method is just a simple constructor method that creates an army. The input
	 * is the Field Marshal's name, the army's name, and the size of the army.
	 * All the methods use the GenericArmy super class methods. The first method
	 * sets the attack, defense, and health. This can't be changed once the object
	 * is initialized. Then next two methods set the name of the field marshal, and
	 * the name of the army. The last method generates the army given the army size. 
	 */
	public Knight(String FieldMarshalName, String armyName, int armySize) {
		super.setFieldMarshal(20, 30, 100);
		super.setfieldMarshalName(FieldMarshalName);
		super.setArmyName(armyName);
		super.generateArmy(armySize);
	}
}
