package refactoring;

public class BLTBuilder extends SandwichBuilder {

	public void buildBread() {
		sandwich.setBread("White Bread");
	}

	public void buildVegetables() {
		sandwich.setVegetables("Lettuce Tomato");
	}

	public void buildMeat() {
		sandwich.setMeat("Bacon");
	}

	public void buildCheese() {
		sandwich.setCheese("White Bread");
	}

	public void buildCondiments() {
		sandwich.setCondiments("Mayonnaise");
	}
}
