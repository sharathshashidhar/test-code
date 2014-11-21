package for_interview;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if("String ".trim() == "String"){
			System.out.println("1 - True");
		}
		if(" String ".trim() == "String"){
			System.out.println("2 - True");
		}
		if("String".trim() == "String"){
			System.out.println("3 - True");
		}
		if("Str ing".trim() == "String"){
			System.out.println("4 - True");
		}
	}

}
