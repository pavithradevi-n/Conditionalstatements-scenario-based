import java.util.Scanner;
class MobileCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        System.out.println(num.length() >= 10 ? "Valid Number" : "Invalid Number");
    }
}
