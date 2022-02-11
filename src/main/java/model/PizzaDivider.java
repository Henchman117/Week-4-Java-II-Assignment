package model;

public class PizzaDivider {
	private int pizzaSlices;
	final protected int people = 2;
	private int slicePerPerson;
	private String chefName;
	
	//Constructor
	public PizzaDivider() {
		super();
	}
	public PizzaDivider(int pizzaSlices) {
		super();
		this.pizzaSlices = pizzaSlices;
	}
	
	// Methods
	public void dividePizza(){
		this.slicePerPerson = this.pizzaSlices / this.people;
	}
	public String pizzaMadLib() {
		return "This pizza was made by " + chefName;
	}
	
	// Get and Set
	public int getPizzaSlices() {
		return pizzaSlices;
	}

	public void setPizzaSlices(int pizzaSlices) {
		this.pizzaSlices = pizzaSlices;
	}

	public int getPeople() {
		return people;
	}

	public int getSlicePerPerson() {
		return slicePerPerson;
	}

	public void setSlicePerPerson(int slicePerPerson) {
		this.slicePerPerson = slicePerPerson;
	}
	
	public String getChefName() {
		return chefName;
	}
	public void setChefName(String chefName) {
		this.chefName = chefName;
	}
	// toString
	@Override
	public String toString() {
		return "PizzaDivider [pizzaSlices=" + pizzaSlices + ", people=" + people + ", slicePerPerson=" + slicePerPerson
				+ ", chefName=" + chefName + "]";
	}

	
}
