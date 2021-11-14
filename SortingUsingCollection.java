package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String>values=new ArrayList<String>();
		
		for(String eachdata:input) {
			values.add(eachdata);
		}
		Collections.sort(values);
		int len=values.size();
		
		for(int i=len-1;i>=0;i--){
			{
			System.out.println(values.get(i));
		}
			
		}
		
		
	}

}
