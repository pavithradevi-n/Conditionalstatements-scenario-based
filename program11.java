import java.util.Scanner;
class PurchaseDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double amt=sc.nextDouble();
        if (amt >= 5000) amt *= 0.80;
        else if (amt >= 2000) amt *= 0.90;
        System.out.println("Final Amount = " + amt);
    }
}
