import java.util.Scanner;
class SpeedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        System.out.println(speed > 100 ? "Over Speeding" : "Within Limit");
    }
}
