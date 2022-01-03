package javaCodeExamples;

public class stringReverseExample {

	public void usingStringBuffer() {
		String name = "Deepak";

		StringBuffer strname = new StringBuffer();
		strname.append(name);
		System.out.println("using String Buffer : " + strname.reverse());
	}
	public void usingOwnBuildIn()
	{
		String name= "Deepu";
		String reverse = "";
		 char[] nameArray= name.toCharArray();
	    for (int i=nameArray.length - 1 ; i>=0 ; i-- )
		 {
			reverse = reverse + nameArray[i] ;
		 }
		System.out.println("using Own : " + reverse);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Deepak");
		stringReverseExample strrev = new stringReverseExample();
		strrev.usingStringBuffer();
		strrev.usingOwnBuildIn();

	}

}
