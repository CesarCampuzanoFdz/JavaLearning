package nonAccessMods.package1;

/*
 * Static modifier in a variable of a class makes it the same for all instances
 * of the class, allowing for example take a count of all instances created.
 * 
 * "public static final" is a common modifier to variables in coding, as they define a constant 
 * 
 * Static modifier in a method make it available using only the Class itself (using
 * the name of the class itself) not instances. This methods can only use Static variables,
 * since they are not associated to any instance. 
 * (In instances methods, both static and instace variables can be used)
 */
class Player {
    private String name;
    // I create a static int:
    private static int playersCount;

    public Player(String name) {
	super();
	this.setName(name);
	// every time a Player is created, count increments by 1
	playersCount = getPlayersCount() + 1;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
	// In instance methods, static can be called:
	System.out.println(getPlayersCount());
    }

    // I create a static method to return the playersCount
    public static int getPlayersCount() {
	// But in static, instance methods can be not:
	// System.out.println(getName());
	return playersCount;
    }
}

class Constant {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTE_IN_HOUR = 60;
    public static final int HOURS_IN_DAY = 24;

    public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTE_IN_HOUR * HOURS_IN_DAY;
}

public class StaticModifierRunner {

    public static void main(String[] args) {
	Player player1 = new Player("Player1");
	Player player2 = new Player("Player2");

	System.out.println(Player.getPlayersCount());
	// Static methods can be called through an instance, but it is not recommended:
	System.out.println(player1.getPlayersCount());
	System.out.println(Constant.SECONDS_IN_DAY);
    }

}
