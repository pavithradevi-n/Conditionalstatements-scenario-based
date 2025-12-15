import java.util.Scanner;
class DayTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next().toLowerCase();
        if (day.equals("saturday") || day.equals("sunday"))
            System.out.println("Ticket: ₹150");
        else
            System.out.println("Ticket: ₹100");
    }
}

