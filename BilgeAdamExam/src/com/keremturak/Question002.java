package com.keremturak;

public class Question002 {

	public static void main(String[] args) {
		int sayiDizisi[] = { 2, 3, 43, 5, 3,3};
		
		
		Arraycheck(sayiDizisi);
		

	}public static void Arraycheck(int[] a) {
		
		
		int toplam = 1;//kontrol edilen sayı kendisini eklemediği için 1 den başlattım. 
					   //for döngüsü içerisinde de yapılabilirdi.
		int sayi = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					toplam = toplam + 1;
					sayi = a[i];
					break;
				}

			}

		}
		if (toplam == 1) {
			System.out.println("tekrar eden sayi yoktur");

		} else {

			System.out.println(sayi + " sayisi " + toplam + " kere tekrar etmiştir");
		}
		
	}

}
