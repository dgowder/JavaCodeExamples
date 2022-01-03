package javaCodeExamples;

public class TrainglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lengthPattern=5;
		int row;
		int column;
		for (row=0;row<lengthPattern;row++)
		{
			for (column=0;column<=row;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
