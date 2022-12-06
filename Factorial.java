package week2.day1Assignment;

public class Factorial {
	public static void main(String[] args) {
		int input = 5;
		int multi = 1;
		for (int i = 1; i <=input; i++) {
			multi= multi*i;}
		System.out.println(input+multi);
	}
}
