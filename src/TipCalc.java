import java.util.Scanner;
public class TipCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How much was the bill");
      double totalBill = s.nextDouble();
        System.out.println("What is the tip percentage in whole numbers?");
        double tipPercentage = s.nextDouble();
        System.out.println("What was the total number of people at the party/");
        int totalPeople = s.nextInt();
        double totalTip = ((double)tipPercentage * 0.01) * totalBill);


    }
}
