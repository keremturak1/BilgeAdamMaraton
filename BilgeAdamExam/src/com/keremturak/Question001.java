package com.keremturak;

import java.util.Scanner;

public class Question001 {

	public static void question1(int a, int b) {
		// a = dikey sınır
		// b = yatay sınır
		String text = "";
		for (int i = 0; i < a; i++) {
			if (text.length() >= b) {
				System.out.println(text);

			} else {
				System.out.println("*" + text);
				text = text + "*";
			}
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("yatay siniri giriniz");
		int yat = input.nextInt();
		System.out.println("dikey siniri giriniz");
		int dik = input.nextInt();

		question1(yat, dik);

	}

}
