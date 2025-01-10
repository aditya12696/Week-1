class EquallyDistributedAndNonDistributedPens {
	/* how many pens each student will get if the pens must be divided equally.
	   Also, find the remaining non-distributed pens.*/
	public static void main(String args[]) {
		// Total number of pens
		int totalNumberPens = 14;

		// Total number of students
		int numberOfStudents = 3;

		// Number of pens received by each students
		int penGotBySingleStudent = totalNumberPens / numberOfStudents;

		// Calculation number of pens left
		int pensLeft = totalNumberPens % numberOfStudents;

		// Display output
		System.out.println("The Pen Per Student is " + penGotBySingleStudent
				+ " and the remaining pes left for distribution is " + pensLeft);
	}
}
