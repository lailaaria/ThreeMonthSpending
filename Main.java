import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner(System.in);

   System.out.println("What is your name?");
   String name = scan.next();
   System.out.println("Hello, " + name);
   System.out.println("About, how much money did you spend Nov. 2020?");
   double novMoney = scan.nextDouble();
   System.out.println("About, how much money did you spend Dec. 2020?");
   double decMoney = scan.nextDouble();
   System.out.println("About, how much money did you spend Jan. 2021?");
   double janMoney = scan.nextDouble();

   double aveSpendings = moneySpent(novMoney, decMoney, janMoney);

   System.out.println("You spent an average of $" + aveSpendings + " the last 3 months.");
   System.out.println(regulateMoney(aveSpendings));

  }

  //method averages money spent the last three months
  static double moneySpent(double novMoney, double decMoney, double janMoney)
  {
    double total = novMoney + decMoney + janMoney;
    double aveSpendings = total / 3.0;
    return aveSpendings;
  }

  //method returns how to regulate spending
  static String regulateMoney(double aveSpendings)
  {
    if (150.0 >= aveSpendings)
    {
      
      return "Good job regulating your spending!";

    }else{
      double difference = aveSpendings - 150.00;

      return "Good effort, but over the next 3 months try spending about $" + difference + " less, in order to regulate your spending.";
    }
  }

  

}