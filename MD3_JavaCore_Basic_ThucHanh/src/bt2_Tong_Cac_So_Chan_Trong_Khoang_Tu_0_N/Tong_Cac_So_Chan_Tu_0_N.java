package bt2_Tong_Cac_So_Chan_Trong_Khoang_Tu_0_N;

import java.util.Scanner;

public class Tong_Cac_So_Chan_Tu_0_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n : ");
        int sumOdd = 0;
        int n = scanner.nextInt();
        System.out.println("Các số chẵn từ 0 đến  " + n + " là : " );
        for (int i = 0; i <= n; i++) {
         if (i % 2 == 0){
             sumOdd += i;
             System.out.print(i + " ");
         }
        }
    System.out.println(" \nTổng các số chẵn trong khoảng từ 0 đến " + n + " là : " +sumOdd);
    }

}
