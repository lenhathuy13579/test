import java.util.Scanner;

public class tam_giac {
    public static void main(String[] args) {
        int canhA, canhB, canhC;
        int chuVi ;
        double p, dienTich;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập cạnh a: ");
        canhA = scanner.nextInt();
        System.out.print("nhập cạnh b: ");
        canhB = scanner.nextInt();
        System.out.print("nhập cạnh c: ");
        canhC = scanner.nextInt();
        if ( canhA+canhB<=canhC || canhB+canhC<=canhA || canhC+canhB<=canhA)
        {
            System.out.println("không phải hình tam giác");
        }
        else {
            chuVi =  chuViTamGiac(canhA,canhB,canhC);
            p = (double) chuVi / 2;
            dienTich = dienTichTamGiac(canhA,canhB,canhC);
            System.out.println("chu vi: " + chuVi);
            System.out.println("diện tích: "+dienTich);
        }
    }
    public static int chuViTamGiac(int a,int b,int c)
    {
        return a+b+c;
    }
    public static double dienTichTamGiac(int a,int b,int c)
    {
        double p = (double)(a+b+c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


}
