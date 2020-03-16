import java.util.Scanner;

public class S_hinh_thang {
    public static void main(String[] args) {
        int cao, dayTren, dayDuoi;
        float dienTich;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều cao: ");
        cao = scanner.nextInt();
        System.out.print("nhập đáy trên: ");
        dayTren = scanner.nextInt();
        System.out.print("nhập đáy dưới: ");
        dayDuoi = scanner.nextInt();
        dienTich = dienTichHinhThang(cao,dayTren,dayDuoi);
        System.out.println("diện tích hình thang: "+ dienTich);
    }
    public static float dienTichHinhThang(int h,int a,int b)
    {
        return (float)h*(a+b)/2;
    }
}
