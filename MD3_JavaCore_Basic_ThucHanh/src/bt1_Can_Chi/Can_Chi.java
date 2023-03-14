package bt1_Can_Chi;

import java.util.Scanner;

public class Can_Chi {
    public static void main(String[] args) {

        String[] can = {"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
        String[] chi = {"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mão","Thìn","Tỵ","Ngọ","Mùi"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuổi của người dùng : ");
        int age = scanner.nextInt();
        int year = 2023;
        int namSinh = 2023- age;
        String canChi = can[namSinh % 10] + " "+ chi[namSinh%12];
        System.out.println(canChi);
    }
}
