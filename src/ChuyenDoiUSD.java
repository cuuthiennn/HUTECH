import java.util.Scanner;

public class ChuyenDoiUSD {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        final int tyGia = 23500;
        float usd;
        int vnd;
        System.out.println("Đổi tiền từ USD => VND");
        System.out.println("Vui lòng nhập số USD cần đổi: ");
        usd = scan.nextFloat();
        vnd = (int) (tyGia * usd);
        System.out.println("Số VND sau khi đổi là: "+ vnd + " vnđ");
    }
}
