import java.util.Random;

/**
 * A Enemy is an Entity that attacks the player
 * 
 * @author Christian Wance 012306864
 *
 */
abstract class Enemy extends Entity {

	/**
	 * An Item held by the Enemy
	 */
	private Item item;

	/**
	 * Generates an Enemy Entity
	 * 
	 * @param n The Enemy name
	 * @param l The Enemy level
	 * @param m The Enemy maxHp
	 * @param i The Enemy held item
	 */
	Enemy(String n, int l, int m, Item i) {
		super(n, l, m);
		item = i;
	}

	/**
	 * Override the attack function found in Entity
	 * 
	 * @param e Entity The Entity being attacked
	 */
	@Override
	abstract void attack(Entity e);

	/**
	 * Gets the item held by the enemy
	 * 
	 * @return Item
	 */
	Item getItem() {
		return item;
	}
}