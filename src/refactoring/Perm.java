package refactoring;

public class Perm extends HairCutDecorator {

	Perm(HairCut hairCut) {
		super(hairCut);
	}

	public String getDescription() {
		return hairCut.getDescription() + "\nAdd Chemicals and Put Hair in Rollers";
	}

	public double getCost() {
		return hairCut.getCost() + 75.00;
	}

}
