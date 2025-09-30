Public class Cats {
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public cat(String name) {
		name = name;
		breed = breed;
		this.isHungry = yes;
		livesRemaining = 9;
	}

	public void getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getishungry(){
		return isHungry;
	}

	public boolean feed() {
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return this.name == other.name && this.breed.equals(other.breed)
			&& this.livesRemaining = other.livesRemaining;
	}

	public String toString() {
		System.out.println(name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
	}
}
