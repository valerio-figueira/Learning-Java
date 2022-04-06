package populationGrowth;

public class PopulationGrowth {
	static double pA = 80000;
	static double pB = 200000;
	static double growthA;
	static double growthB;
	static int years = 1;

	public static void main(String[] args) {

		while (pA <= pB) {
			growthA = pA / 100 * 3;
			pA = growthA + pA;
			System.out.println("pA: " + pA);
			
			growthB = (pB / 100) * 1.5;
			pB = growthB + pB;
			System.out.println("pB: " + pB);
			
			years++;
		}
		System.out.println(years);
	}
}
