package for_interview;

public class Sets {
	
	public static void main(String args[]){
		
		int array[] = {3,7,5,1,2,4,6,8,4,3,2,9,1};
		int n = 10;
		
		for (int i = 0; i < array.length; i++) { 
			int first = array[i]; 
			for (int j = i + 1; j < array.length; j++) 
			{ 
				int second = array[j]; 
				if ((first + second) == n) 
				{ 
					System.out.printf("(%d, %d) %n", first, second); 
					} 
				} 
			}

	}

}
