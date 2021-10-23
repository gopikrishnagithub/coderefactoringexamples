package refactoring;

public abstract class SandwichBuilder {

	Sandwich sandwich;

	public Sandwich getSandwich() {
		return sandwich;
	}

	public void makeSandwich() {
		sandwich = new Sandwich();
	}

	public abstract void buildBread();

	public abstract void buildVegetables();

	public abstract void buildMeat();

	public abstract void buildCheese();

	public abstract void buildCondiments();

}
