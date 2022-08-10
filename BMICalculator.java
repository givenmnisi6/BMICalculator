import java.util.Scanner;
public class BMICalculator {

	public static void main(String args[]) {
		//variables, double to accomodate decimals
		int choice = 0;
		double weight = 0.0;
		double height = 0.0;
		double BMI = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BMI Calculator!");
		
		System.out.println("\n1. Weight in kilograms, height in meters");
		System.out.println("2. Weight in pounds, height in inches ");
		
		System.out.printf("\nIndicate your choice: ");
		choice = sc.nextInt();

		//while loop to check whether one of the two options are entered
		//if not ask the user to input again
		while(choice != 1 && choice != 2) {
			System.out.println("Incorrect choice, choose 1 or 2");
			System.out.printf("\nIndicate your choice: ");
			choice = sc.nextInt();
		}

		//the user can either select 1 or 2, calculations may vary
		if(choice == 1) {
			System.out.printf("Enter your weight in kg: ");
			weight = sc.nextDouble();
		
			System.out.printf("Enter your height in m: ");
			height = sc.nextDouble();
			
			BMI = Math.round((weight/(Math.pow(height,2)))*100)/100.0;
			System.out.println("\nBMI Report");
			System.out.println("Weight:  " + weight + " kg");
			System.out.println("Height:  " + height + " m");
			System.out.println("BMI:     " + BMI);

		} else if(choice == 2)  {
			System.out.printf("Enter your weight in pounds: ");
			weight = sc.nextDouble();
		
			System.out.printf("Enter your height inches: ");
			height = sc.nextDouble();		
			
			BMI = Math.round(weight/Math.pow(height,2) * 703 * 100)/100.0;
			//BMI report
			System.out.println("\n--------------------------------");
			System.out.println("BMI Report");
			System.out.println("Weight:  " + weight + " lb");
			System.out.println("Height:  " + height + " in");
			System.out.println("BMI:     " + BMI);	
		} 	

		//conditions of BMIs
			if(BMI >= 35) {
				System.out.println("Status:  Severely obese");
			} else if (BMI > 30 && BMI < 35) {
				System.out.println("Status:  Obese");
			} else if (BMI > 25 && BMI < 30) {
				System.out.println("Status:  Overweight");
			} else if (BMI > 18.5 && BMI < 25) {
				System.out.println("Status:  Healthy");		
			} else {
				System.out.println("Status:  Underweight");
			}
	}
}