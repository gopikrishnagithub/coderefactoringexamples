package refactoring;

public abstract class HairCutDecorator implements HairCut {

	protected HairCut hairCut;

	HairCutDecorator(HairCut hairCut) {
		this.hairCut = hairCut;
	}

	public String getDescription() {
		return hairCut.getDescription();
	}

	public double getCost() {
		return hairCut.getCost();
	}

}
