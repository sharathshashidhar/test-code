package for_interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntCount {
	
	public static void main(String[] args)
	{
	    try{
	            int count=1,index=1;
	            BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
	            System.out.print("Enter the Size of array : ");
	            int size=Integer.parseInt(br.readLine());
	            System.out.print("Enter the Elements of array : ");
	            Integer arr[]=new Integer[size];

	            for(int i=0;i<arr.length;i++)
	            {
	                System.out.print("arr["+i+"] :  ");
	                arr[i]=Integer.parseInt(br.readLine());
	            }
	            System.out.print("Sorted Array is :");
	            List<Integer> intList = Arrays.asList(arr);
	            Collections.sort(intList);

	            for(int i=0;i<arr.length;i++)
	            {
	                System.out.println("arr["+i+"] :  "+arr[i]);

	            }

	            for(int i=0;i<arr.length;)
	            {
	                count=1;
	                for(index=i+1;index<arr.length;index++)
	                {
	                    if(arr[i]==arr[index])
	                    {
	                        count++;
	                    }
	                    else{

	                        break;
	                    }
	                }
	                System.out.println(""+arr[i] +"----> "+count);
	                i+=count;
	            }

	    }catch(Exception ex)
	    {
	        ex.printStackTrace();
	    }
	}

}
