import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("Ask for a price");
		double price = in.nextDouble();
		//Read in the amount paid
		System.out.println("Make a payment");
		double payment = in.nextDouble();
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		System.out.println("You paid $"+payment);
		//How do you get just one digit? HINT: %
		
		double change = payment - price;
		System.out.println(change);
		//shift the decimal place by 2, used the modulus. Make sure its an int.
		int lastDigit = (int)((change*100)%10);
		//if output is 1 or 2 or 6 or 7, round down
		if (lastDigit==1 || lastDigit ==2) {
			change = change-(lastDigit/100.0);
		}else if (lastDigit==3 || lastDigit ==4) {
			change = change +((5-lastDigit)/100.0);
		}
		//Print out the amount of change
		System.out.println("Your change is $"+change);
		//Break the change into all denominations: 		
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		int num100 = (int)(change/100);
		change = change - num100*100;
		System.out.println(num100);
		int num50 = (int)(change/50);
		change = change-num50*50;
		System.out.println(num50);
		int num20 = (int)(change/20);
		change = change - num20*20;
		System.out.println(num20);
		int num10 = (int)(change/10);
		change = change-num10*10;
		System.out.println(num10);
		int num5 = (int)(change/5);
		change = change-num5*5;
		System.out.println(num5);
		int num2 = (int)(change/2);
		change = change-num2*2;
		System.out.println(num2);
		int num1 = (int)(change/1);
		change = change-num1*1;
		System.out.println(num1);
		int num025 = (int)(change/0.25);
		change = change-num025*0.25;
		System.out.println(num025);
		int num010 = (int)(change/0.10);
		change = change-num010*0.10;
		System.out.println(num010);
		int num005 = (int)(change/0.05);
		change = change-num005*0.05;
		System.out.println(num005);
		
		
		
		
		in.close();
	}

}
