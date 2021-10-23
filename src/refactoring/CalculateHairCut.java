package refactoring;

public class CalculateHairCut implements HairCut {

	enum HairCutOptions {
		BASIC_CUT, PERM, HAIR_FROSTING
	};

	HairCutOptions optionPicked;

	CalculateHairCut(HairCutOptions options) {

		optionPicked = options;

	}

	public String getDescription() {

		if (optionPicked == HairCutOptions.PERM) {

			return "\nAdd Chemicals and Put Hair in Rollers";

		} else if (optionPicked == HairCutOptions.HAIR_FROSTING) {

			return "\nAdd Chemicals and Put Hair in Foil";

		} else
			return "Trim the Hair";

	}

	public double getCost() {
		return 0;
	}

}
