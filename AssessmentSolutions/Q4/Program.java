import java.util.*;

public class Program{
	
	public int add(int[] digits){
		
		int sum = 0;
		for(int d : digits){
			sum += d;
		}
		
		return sum;
	}
	
	//Method name changed due to compilation error
	public String concatenate(int[] digits){
		
		String str = "";
		
		for(int d: digits){
			str += String.valueOf(d)+" ";
		}
		
		return str;
	}
	
	
	public static void main(String[] args){
		
		Program p = new Program();
		int[] arr = {1,2,3,4,5}; 
		
		System.out.println("Sum : "+p.add(arr));
		System.out.println("After Concatenation : "+p.concatenate(arr));
		
	}
	
}