import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        double bill=0;
         if (units > 300)
            bill=(units - 300) * 10 + 200 * 5;
        else if (units > 100)
            bill=(units - 100) * 5;
if (units > 500) bill += bill * 0.10; // surcharge
        System.out.println("Bill Amount = " + bill);
    }
}
