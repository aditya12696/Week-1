class AverageMarkOfSam {
	// Find the average percent mark in PCM of Sam
	public static void main(String[] args) {
		// Sam mark in Maths out of 100
		int markInMaths = 94;
		// Sam mark in Physics out of 100
		int markInPhysics = 95;
		// Sam mark in Chemistry out of 100
		int markInChemistry = 95;
		// Find the average of mark
		int averageOfMarks = (markInMaths + markInPhysics + markInChemistry) / 3;
		// Percent of mark in PCM
		float percentOfMarks = ((float) averageOfMarks / 300) * 100;
		// output percent of marks
		System.out.println("Sam's average mark in PCM is " + percentOfMarks);
	}
}