import java.util.Scanner;
class DiscountBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double bill=sc.nextDouble(), discount;
        if (bill < 1000) discount=bill * 0.05;
        else if (bill <= 5000) discount=bill * 0.10;
        else discount=bill * 0.15;
        System.out.println("Payable Amount = " + (bill - discount));
    }
}

