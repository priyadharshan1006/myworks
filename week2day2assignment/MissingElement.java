package week2day2assignment;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5,7,8,9,10};
		Arrays.sort(num);
			for (int i = 0; i < num.length; i++) {
				if(num[i]!=i+1) {
					System.out.println(num[i]-1);
					break;
				
				
			}
			
		
	}

}}
