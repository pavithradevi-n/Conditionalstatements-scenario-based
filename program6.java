import java.util.Scanner;
class PassFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        System.out.println(marks >= 35 ? "Pass" : "Fail");
    }
}
