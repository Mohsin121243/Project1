import java.util.Scanner;
public class TipCalc {
    public static void main(String[] args) {
        //Below, Scanner is used to have the user type the bill information
        Scanner s = new Scanner(System.in);

        /*Here I set up a print statement that asks the bill information and store it in a variable,
        I did this for all the billing info  */
        System.out.println("How much was the bill");
      double totalBill = s.nextDouble();

        System.out.println("What is the tip percentage in whole numbers?");
        double tipPercentage = s.nextDouble();

        System.out.println("What was the total number of people at the party?");
        int totalPeople = s.nextInt();

        /*Here I calculate the total tip of the bill by using the user input given, here specifically I'm using
        the tip percent and bill. I rounded the product using Math.round */
        double totalTip = (((double)tipPercentage * 0.01) * totalBill);
        totalTip = Math.round(totalTip*100.0)/100.0;

        //Here I calculated the bill with the tip using the user given bill plus the tip. Rounded using Math.round//
        double billWithTip = totalBill + totalTip;
        billWithTip = Math.round(billWithTip*100.0)/100.0;

       /* Here I calculated each tip the person in the party has to pay using the percent and total bill and people
         Rounded using Math.round */
      double eachTip =((double)tipPercentage * 0.01)* (totalBill/totalPeople);
      eachTip = Math.round(eachTip*100.0)/100.0;

      //Here I calculated the bill per person by dividing the bill by the amount of people plus each tip i calculated//
       double billPerPerson = (totalBill/totalPeople) + eachTip;
       billPerPerson = (billPerPerson*100.0)/100.0;

       //I used println statements to print the values i calculated using the user input//
       System.out.println("Total tip: " + totalTip);
       System.out.println("Total bill with including tip: " + billWithTip);
       System.out.println("The tip per person: " + eachTip);
       System.out.println("The total per person: "+billPerPerson);
}
}