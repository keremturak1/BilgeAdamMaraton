package com.keremturak;

import java.util.Scanner;

public class Question004 {

	public static void main(String[] args) throws InterruptedException {// throws InterruptedException ne olduğunu
																		// bilmiyorum.
																		// thread.sleep dediğimde eklemem gerekiyormuş.
																		// internetten bakarak yaptım
		Scanner input = new Scanner(System.in);
		int sayac = 0;
		while (true) {
			System.out.println(
					"* * * * * * * * * * ** * * \n* Geometrik Hesaplayıcı  *\n* * * * * * * * * * ** * * \n1. Kare alan hesaplama\n2. Kare çevre hesaplama\n3. Dikdörtgen alan hesaplama\n4. Dikdörtgen çevre hesaplama\n5. Daire alan hesaplama \n6. Daire Çevre hesaplama\n0. Metre==>Cm\n7. Çıkış");
			int islem = input.nextInt();
			if (islem == 7) {
				System.out.println("çıkılıyor...");
				Thread.sleep(500);
				System.out.println("3");
				Thread.sleep(500);
				System.out.println("2");
				Thread.sleep(500);
				System.out.println("1");
				Thread.sleep(500);
				System.out.println("******  Sağlıcakla kalın  *******");
				break;
			}

			switch (islem) {
			case 1: {// kare alan hesaplama
				System.out.println(Question004Methods.kareAl()+"cm2");
				Thread.sleep(2000);
				break;

			}
			case 2: {// kare çevre hesaplama
				System.out.println(Question004Methods.kareCev()+"cm");
				Thread.sleep(2000);
				break;

			}
			case 3: {// dikdörtgen alan hesaplama
				System.out.println(Question004Methods.dikAlan()+"cm2");
				Thread.sleep(2000);
				break;

			}
			case 4: {// dikdörgen çevre hesaplama
				System.out.println(Question004Methods.dikCevre()+"cm");
				Thread.sleep(2000);
				break;

			}
			case 5: {// daire alan hesaplama
				System.out.println(Question004Methods.daireAl()+"cm2");
				Thread.sleep(2000);
				break;

			}
			case 6: {// daire çevre hesaplama
				System.out.println(Question004Methods.daireCev()+"cm");
				Thread.sleep(2000);
				break;

			}	case 0: {// metre==>cm
				System.out.println(Question004Methods.cevir()+"cm");
				Thread.sleep(2000);
				break;

			}

			}

		}

	}

}


