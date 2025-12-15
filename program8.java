import java.util.Scanner;
class PinCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        int storedPin=1234;
        System.out.println(pin == storedPin ? "Access Granted" : "Wrong PIN");
    }
}
