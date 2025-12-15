import java.util.Scanner;
class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        double bill = 0;
        if (liters > 3000)
            bill = ((liters - 3000) / 1000.0) * 10 + 2000 * 5;
        else if (liters > 1000)
            bill = ((liters - 1000) / 1000.0) * 5;
        System.out.println("Water Bill = " + bill);
    }
}
