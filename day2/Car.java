package week1.day2;

public class Car {
	public void applyBreak() {
		System.out.println("applyBreak");}
	public void applyGear() {
		System.out.println("applyGear");}
	public void switchOnAc() {
		System.out.println("switchOnAc");}
	public void applyAcclerate() {
		System.out.println("applyAcclerate");}
	public static void main(String[] args) {
		Car car = new Car();
		car.applyAcclerate();
		car.applyBreak();
		car.applyGear();}
	}
