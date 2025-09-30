//1. made 'public' lowercase// 
public class Cat {
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
    //2. made "Cat" uppercase, and added "String breed" to the parameter.
	public Cat(String name, String breed) {
		this.name = name; //3. added keyword 'this' to name.
		this.breed = breed; //4. added keyword 'this' to breed.
		this.isHungry = true; // 5. changed 'yes' to true.
		livesRemaining = 9;
	}

	public String getName() { //6. changed 'void' to 'String'
		return name; 
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getBreed() { // 7. added getBreed() method
        return breed;
    }

    public void setBreed(String breed) { //8. added setBreed() method
        this.breed = breed;
    }


	public boolean getIsHungry(){ // 8. changed void to boolean
		return isHungry;
	}

	public boolean feed() {
		this.isHungry = false;
        return isHungry; // 9. added return statement.
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed) // 10. changed '==' to '.equals()' when compaing names
			&& this.livesRemaining == other.livesRemaining;
	}

	public String toString() {
		String sentence = name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining."; //11. changed so that it returns a string instead of just printing it out. 
        return sentence;
	}
}