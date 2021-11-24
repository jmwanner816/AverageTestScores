public class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter the first test score");
		double scoreOne = s.nextDouble();
		System.out.println("Please enter the second test score");
		double scoreTwo = s.nextDouble();
		System.out.println("Please enter the third test score");
		double scoreThree = s.nextDouble();
		System.out.println("Please enter the fourth test score");
		double scoreFour = s.nextDouble();
		System.out.println("Please enter the fifth test score");
		double scoreFive = s.nextDouble();

		double totalScore = scoreOne+scoreTwo+scoreThree+scoreFour+scoreFive;
		double averageScore = totalScore/5;
		System.out.println("The average test score is:" + averageScore);
		s.close();
	}
}

}
