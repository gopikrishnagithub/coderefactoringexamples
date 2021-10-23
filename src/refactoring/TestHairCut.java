package refactoring;

public class TestHairCut {

	public static void main(String[] args) {
		HairCut permAndCut = new Perm(new RegularHairCut());
		System.out.println("Services");
		System.out.println(permAndCut.getDescription());
		System.out.println("Price: $" + permAndCut.getCost());
	}

}
