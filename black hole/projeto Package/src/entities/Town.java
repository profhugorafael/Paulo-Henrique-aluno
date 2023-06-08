package entities;

//-------------------------------------------
//Class to register a Town
public class Town {

// ------------------------
// instances of town
	private int numberOfPeople;

// ------------------------
// constructor methods
	public Town() {
	}

	public Town(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

// ------------------------
// getters and setters
	public int getNumberOfPeople() {
		return numberOfPeople;
	}

// ------------------------
// other methods
	public void addBirths(int births) {
		System.out.println("O registro de " + births + " novas pessoas foram feitas");
		numberOfPeople += births;
	}

// ------------------------
// toString method
	public String toString() {
		return "Total de pessoas: " + numberOfPeople;
	}

}
