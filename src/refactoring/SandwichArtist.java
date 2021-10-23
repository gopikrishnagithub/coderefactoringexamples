package refactoring;

public class SandwichArtist {

	private SandwichBuilder sandwichBuilder;

	public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
		this.sandwichBuilder = sandwichBuilder;
	}

	public Sandwich getSandwich() {
		return sandwichBuilder.getSandwich();
	}

	public void takeSandwichOrder() {
		sandwichBuilder.makeSandwich();
		sandwichBuilder.buildBread();
		sandwichBuilder.buildVegetables();
		sandwichBuilder.buildMeat();
		sandwichBuilder.buildCheese();
		sandwichBuilder.buildCondiments();
	}

}
