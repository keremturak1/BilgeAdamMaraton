package com.keremturak;

import java.util.Scanner;

public class Question003 {

	public static void main(String[] args) {
		
		// verileri kullanıcıdan alarak yaptırdım. 10-15 satırları yorum satırı yapılıp kendimiz değer vererkte kullanabiliriz
		Scanner input = new Scanner(System.in);
		System.out.println("kontrol etmek istediğiniz metni giriniz");
		String a = input.nextLine();
		System.out.println("kontrol etmek istediğiniz karakteri giriniz");
		String c = input.nextLine();
		char b = c.charAt(0);   // veriyi kullanıcıdan aldığımda string oluyordu bu şekilde chara çeviriyorum

		System.out.println(karakterSayici(a, b)); 

	}

	private static int karakterSayici(String a, char b) {
		int toplam = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b) {
				toplam = toplam + 1;

			}

		}return toplam;

	}
}
