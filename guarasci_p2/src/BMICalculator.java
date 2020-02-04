
import java.util.Scanner;

public class BMICalculator {
	//Creates a new Scanner so we can read user input
	Scanner in = new Scanner(System.in);
	//Declares the variables needed
	int bmiCategory, unitType;
	double height, weight, bmi;
	
	public void readUserData () {
		//This method 
		
		//Asks the user if they would like to use the metric or imperial system
		System.out.print("Would you like to use metric or imperial units? Enter 1 for metric (kilograms/meters) or 2 for imperial (pounds/inches): ");
		//Jumps to the method that will read their input and sort it
		readUnitType();
		//Jumps to the method that will ask for and read the user's height and weight
		readMeasurementData();
	}
	
	private void readUnitType() {
		//This method reads the input of the user (using metric or imperial) and saves it if it is a valid input
		
		//Reads the user's input (either 1 or 2)
		int inputUnit = in.nextInt();
		//If the input is valid, it will save the input into the variable unitType
		if (inputUnit == 1 || inputUnit == 2) {
			unitType = inputUnit;
		}
		//If not it will tell the user to input a valid input and restart the method until they do
		else {
			System.out.print("Invalid input. Please enter either 1 for metric or 2 for imperial: ");
			readUnitType();
		}
	}
	
	private void readMeasurementData() {
		//This program takes the input from the user and either tells the program to ask for their data in metric or imperial
		//If the user inputed 1, they want metric
		//If the user inputed 2, they want imperial
		
		//If the previously stored unit type is equal to 1, call to read their data in metric, if not call to read it in imperial
		if (unitType == 1) {
			readMetricData();
		}
		else {
			readImperialData();
		}
	}
	
	private void readMetricData() {
		//This has been called if the user wants to input in metric, and will ask the user for their data
		
		//Ask for the user for their weight and go to method setWeight to save it for future use
		System.out.print("Enter your weight in kilograms: ");
		setWeight();
		
		//Ask for the user for their height and go to method setHeight to save it for future use
		System.out.print("Enter your height in meters: ");
		setHeight();
	}
	
	private void readImperialData() {
		//This has been called if the user wants to input in imperial, and will ask the user for their data
		
		//Ask for the user for their weight and go to method setWeight to save it for future use
		System.out.print("Enter your weight in pounds: ");
		setWeight();
		
		//Ask for the user for their height and go to method setHeight to save it for future use
		System.out.print("Enter your height in inches: ");
		setHeight();
	}
	
	public void calculateBmi() {
		//This function calculates the BMI of the user based on their input
		
		//Calculates the formula for BMI (weight/height^2)
		double calcedBmi = weight / (height * height);
		//If the user chose imperial (unitType should equal 2) it updates the formula to multiply by 703
		if (unitType == 2) {
			calcedBmi = calcedBmi * 703;
		}
		
		//Jumps to the method getBmi to store the calculated BMI for future use
		getBmi(calcedBmi);
		//Jumps to the method to calculate the BMI category
		calculateBmiCategory();
	}
	
	private void calculateBmiCategory() {
		//Initializes the variable needed
		int calcedBmiCat;
		
		//Sorts the BMI value into its BMI category
		/*	Underweight = <18.5 = The value '1'
			Normal weight = 18.5-24.9 = The value '2'
			Overweight = 25-29.9 = The value '3'
			Obesity = BMI of 30 or greater = The value '4'*/
		if (bmi < 18.5) {
			calcedBmiCat = 1;
		}
		else if (bmi<25 && bmi>=18.5) {
			calcedBmiCat = 2;
		}
		else if (bmi<30 && bmi>=25) {
			calcedBmiCat = 3;
		}
		else {
			calcedBmiCat = 4;
		}
		
		//Jumps to the getBmiCategory method to store the BMI category for future use
		getBmiCategory(calcedBmiCat);
	}
	
	public void displayBmi() {
		//Prints the BMI value and the BMI category based on calculated values from the methods before
		System.out.printf("Your calculated BMI is %.1f", bmi);
		System.out.print(". This means that your BMI category is ");
		
		if (bmiCategory == 1) {
			System.out.print("underweight.");
		}
		else if (bmiCategory == 2) {
			System.out.print("normal weight.");
		}
		else if (bmiCategory == 3) {
			System.out.print("overweight.");
		}
		else {
			System.out.print("obesity.");
		}
	}
	
	public void getWeight(double inputWeight) {
		//Stores the user inputed weight from before into the variable 'weight'
		weight = inputWeight;
	}
	
	private void setWeight() {
		//Stores the user's input into a temporary variable called 'inputWeight'
		double inputWeight = in.nextDouble();
		
		//If the weight inputed is negative, exit the program, if not go to the method getWeight to store it
		if (inputWeight>0) {
			getWeight(inputWeight);
		}
		else {
			System.exit(0);
		}
	}
		
	public void getHeight(double inputHeight) {
		//Stores the user inputed height from before into the variable 'height'
		height = inputHeight;
	}
	
	public void setHeight() {
		//Stores the user's input into a temporary variable called 'inputHeight'
		double inputHeight = in.nextDouble();
		
		//If the height inputed is negative, exit the program, if not go to the method getHeight to store it
		if (inputHeight>0) {
			getHeight(inputHeight);
		}
		else {
			System.exit(0);
		}
	}
	
	public void getBmi(double calcedBmi) {
		//Stores the calculated BMI from before into the variable 'bmi'
		bmi = calcedBmi;
	}
	
	public void getBmiCategory(int calcedBmiCat) {
		//Stores the calculated BMI from before into the variable 'bmiCategory'
		bmiCategory = calcedBmiCat;
	}
	
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();   
	}
	
}