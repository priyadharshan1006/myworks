package week1.day2;

public class Mobile {
	String mobileBrandName="oneplus9R";
	char mobileLogo='o';
	short noOfMobilePiece=1;
	int modelNumber=805332219;
	long mobileImeiNumber=12345678910l;
	float mobilePrice=35000.23f;
	boolean isDamaged=true;
	public static void main(String[] args) {
		Mobile oneplus = new Mobile();
		System.out.println(oneplus.mobileBrandName);
		System.out.println(oneplus.mobileLogo);
		System.out.println(oneplus.noOfMobilePiece);
		System.out.println(oneplus.modelNumber);
		System.out.println(oneplus.mobileImeiNumber);
		System.out.println(oneplus.mobilePrice);
		System.out.println(oneplus.isDamaged);
	}
}
