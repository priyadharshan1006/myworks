package week1.day2;

public class TwoWheels {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=12345678910l;
	boolean isPunctured=false;
	String bikeName="yamahaR15M";
	double runningKM=2496.456;
	public static void main(String[] args) {
		TwoWheels bike = new TwoWheels();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);
		}
}
