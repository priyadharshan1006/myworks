package week2.day1Assignment;

public class FibonnaciSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstNum= 0;
		int second = 1;
		int sum;
		for (int i = 1; i <= range; i++) {
			System.out.println(firstNum);
			sum= firstNum + second; 
			second= firstNum;
			firstNum=sum;}
		}
}
