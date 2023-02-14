package com.keremturak;

import java.util.Scanner;

public class Question004Methods {
	public static double kareAl() {
		Scanner input = new Scanner(System.in);
		System.out.println("kare kenar uzunluğunu giriniz");
		double kenar = input.nextDouble();
		double alan = kenar * kenar;
		return (alan);

	}

	public static double kareCev() {
		Scanner input = new Scanner(System.in);
		System.out.println("kare kenar uzunluğunu giriniz");
		double kenar = input.nextDouble();
		double cevre = kenar * 4;
		return (cevre);

	}public static double dikAlan() {
		Scanner input = new Scanner(System.in);
		System.out.println("kısa kenar uzunluğunu giriniz");
		double kenar1 = input.nextDouble();
		System.out.println("uzun kenar uzunluğunu giriniz");
		double kenar2 = input.nextDouble();
		double alan = kenar1*kenar2;
		return (alan);

	}public static double dikCevre() {
		Scanner input = new Scanner(System.in);
		System.out.println("kısa kenar uzunluğunu giriniz");
		double kenar1 = input.nextDouble();
		System.out.println("uzun kenar uzunluğunu giriniz");
		double kenar2 = input.nextDouble();
		double cevre = 2*(kenar1+kenar2);
		return(cevre);
		

	}public static double daireAl() {
		final double pi =3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("daire yarıçapını uzunluğunu giriniz");
		double r = input.nextDouble();
		double alan = pi*(r*r);
		return (alan);

	}public static double daireCev() {
		final double pi =3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Daire yarıçap uzunluğunu giriniz");
		double r = input.nextDouble();
		double cevre = 2*pi*r;
		return (cevre);

	}public static double cevir() {
		Scanner input = new Scanner(System.in);
		System.out.println("metre uzunluğunu giriniz");
		double m = input.nextDouble();
		double cm = m*100;
		return (cm);

	}
}
