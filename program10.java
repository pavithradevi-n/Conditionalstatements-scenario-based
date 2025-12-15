import java.util.Scanner;
class TrafficLight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String color=sc.next().toLowerCase();
        if (color.equals("red")) System.out.println("Stop");
        else if (color.equals("yellow")) System.out.println("Ready");
        else if (color.equals("green")) System.out.println("Go");
    }
}
