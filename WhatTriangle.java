import java.util.Scanner;


public class WhatTriangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the first side value: ");
		int aSide = keyboard.nextInt();

		System.out.print("Please enter the second side value: ");
		int bSide = keyboard.nextInt();

		System.out.print("Please enter the third side value: ");
		int cSide = keyboard.nextInt();


		System.out.print("Please enter the first angle value: ");
		int aAngle = keyboard.nextInt();

		System.out.print("Please enter the second angle value: ");
		int bAngle = keyboard.nextInt();

		System.out.print("Please enter the third angle value: ");
		int cAngle = keyboard.nextInt();



		if (aAngle + bAngle + cAngle != 180) {
			System.out.println("This is not a triangle.");
		} else if (aSide != bSide && bSide != cSide && aSide != cSide) {
			System.out.println("This is a Scalene triangle.");
		} else  if ((aSide == bSide && bSide == cSide && aSide == cSide) 
			&& (aAngle == bAngle && bAngle == cAngle && aAngle == cAngle)) {
			System.out.println("This is an Equilateral triangle.");
		} else if ((aSide == bSide || bSide == cSide || aSide == cSide) 
			&& (aAngle == bAngle || bAngle == cAngle || aAngle == cAngle)
			&& aAngle != 90 && bAngle != 90 && cAngle != 90 ) {
			System.out.println("This is an Isosceles triangle.");
		} else if (aAngle == 90 || bAngle == 90 || cAngle == 90) {
			System.out.println("This is a Right Angled triangle.");			
		} else {
			System.out.println("This is not a triangle.");						
		}

	}

}
