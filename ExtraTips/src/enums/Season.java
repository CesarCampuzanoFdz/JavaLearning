package enums;

//Enums are used to restict values of a variable (Case sensitive!). 
//They can have methods, constructors, etc.. like a class
public enum Season {
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);
    // They have ordinals associated: 0,1,2,3 by default
    // It is not a good practice to store in a database them with this
    // ordinals,since they are easily changed, its better use a constructor:

    private int value;

    private Season(int value) {
	this.value = value;
    }

    public int getValue() {
	return value;
    }

}