import java.util.Scanner;
class SeniorCitizen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println(age >= 60 ? "Senior Citizen" : "Not a Senior Citizen");
    }
}
