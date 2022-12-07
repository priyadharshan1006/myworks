package week2day2assignment;

import java.util.Arrays;

public class PrintDuplicate {
	public static void main(String[] args) {
		int [] num = {1,2,3,4,2,5,6,7,3,5,2,7};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) 
				{
					System.out.println(num[i]);				
			}
		}
    }

}}
