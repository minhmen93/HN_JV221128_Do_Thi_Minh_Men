package bt3_Nhap_Vao_1_Mang_Gom_50_Phan_Tu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Nhap_Vao_1_Mang_Gom_50_Phan_Tu {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random random = new Random();

        // Tạo mảng ngẫu nhiên
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }

        // In mảng
        System.out.println("In ra mảng các phần tử nhận giá trị ngẫu nhiên từ 1 đến 100 là : \n");
        System.out.print(" Arr = [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "," + " ");
            if ((i + 1) % 10 == 0) {
            }
        }
        System.out.println(" ] ");

        // Tìm giá trị lớn nhất và nhỏ nhất
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println(" Giá trị nhỏ nhất là : " +min);
        System.out.println(" Giá trị lớn nhất là : " +max);

        // Sắp xếp mảng và in ra mảng

         Arrays.sort(arr);
         System.out.println();
         System.out.println(" In ra mảng đã sắp xếp : ");
        System.out.print(" Arr = [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "," + " ");
        }
         System.out.print(" ] ");

        // Đếm số lần xuất hiện số nguyên tố trong mảng
        int[] primeCount = new int[101];
        int count = 0;


    }
}

