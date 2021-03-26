import java.util.*;

public class Addition{
	
	public int add(int[] digits){
		
		int sum = 0;
		for(int d : digits){
			sum += d;
		}
		
		return sum;
	}
	
	
}