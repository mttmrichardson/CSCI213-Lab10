/**
 * Lab 10 Car class
 * @author Matthew richardson
*/
public class Car extends Vehicle {
	private int doors;
	private int passengers;

	// constructor
	public Car(String aMake, String aModel, String aPlate, int numDoors, int numPassengers) {
		super(aMake, aModel, aPlate);
		this.doors = numDoors;
		this.passengers = numPassengers;
	}

	//getters
	public int getDoors() {
		return this.doors;
	}

	public int getPassengers() {
		return this.passengers;
	}

	public Car copy() {
		return new Car(this.getMake(), this.getModel(), this.getPlate(), this.getDoors(), this.getPassengers());
	}

	//Overridden methods
	@Override
	public String toString() {
		return "" + this.doors + "-door " + this.getMake() + " " + this.getModel() + " with license " + this.getPlate();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car))
			return false;

		Car other = (Car) obj;
		if (this.doors == other.doors) {
			if (this.passengers == other.passengers)
				return super.equals(other);
		}
		return false;
	}

	public static void main(String[] args) {
		Car car = new Car("Ford", "Taurus", "RIDR-MAN", 4, 6);
	}
}