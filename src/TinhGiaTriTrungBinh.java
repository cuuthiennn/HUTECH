import java.util.Scanner;

public class TinhGiaTriTrungBinh {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int tong = 0;
        float trungBinh;
        final int soLuong = 5;
        System.out.println("Nhập vào số nguyên thứ nhất: ");
        tong += scan.nextInt();
        scan.nextLine();
        System.out.println("Nhập vào số nguyên thứ hai: ");
        tong += scan.nextInt();
        scan.nextLine();
        System.out.println("Nhập vào số nguyên thứ ba: ");
        tong += scan.nextInt();
        scan.nextLine();
        System.out.println("Nhập vào số nguyên thứ bốn: ");
        tong += scan.nextInt();
        scan.nextLine();
        System.out.println("Nhập vào số nguyên thứ năm: ");
        tong += scan.nextInt();
        trungBinh = 1f * tong / soLuong;
        System.out.println("Trung bình của năm số nhập là: " + trungBinh);
    }
}
