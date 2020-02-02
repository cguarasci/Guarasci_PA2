
import java.util.Scanner;

public class BMICalculator {
	Scanner in = new Scanner(System.in);
	int height, weight;
	
	public void readUserData () {
		int unitType;
		
		unitType = readUnitType();
		readMeasurementData(unitType);
	}
	
	private int readUnitType() {
		int unitType;
		
		//Asks the user if they are inputting the values in metric or imperial
		System.out.print("Would you like to use metric or imperial units? Enter 1 for metric (kilograms/meters) or 2 for imperial (pounds/inches): ");
		unitType = in.nextInt();
		
		return unitType;
	}
	
	private void readMeasurementData(unitType) {
		//Calls either readMetricData or readImperialData
		if (units == 1) {
			readMetricData();
		}
		else {
			readImperialData();
		}
	}
	
	private void readMetricData() {
		int weight, height;
		
		//Take the  user's inputed weight
		System.out.print("Enter your weight in kilograms: ");
		int weight = getWeight();
		setWeight(weight);
		
		//Take the  user's inputed height
		System.out.print("Enter your height in meters: ");
		int height = getHeight();
		setHeight(height);
	}
	
	private void readImperialData() {
		int weight, height;
		
		//Ask for the  user's inputed weight
		System.out.print("Enter your weight in pounds: ");
		int tempWeight = getWeight();
		setWeight(weight);
				
		//Ask for the  user's inputed height
		System.out.print("Enter your height in inches: ");
		int tempHeight = getHeight();
		setHeight(height);
	}
	
	public void calculateBmi() {
		//Calculates BMI and BMI category
	}
	
	private void calculateBmiCategory() {
		
	}
	
	public void displayBMI() {
		//prints BMI value and category
	}
	
	public int getWeight() {
		int weight = in.nextInt();
		return weight;
	}
	
	private int setWeight(tempWeight) {
		//Take the  user's inputed weight
		weight = tempWeight;
	}
		
	public int getHeight() {
		int height = in.nextInt();
		return height;
	}
	
	public int setHeight() {
		//Take the  user's inputed height
		int height = in.nextInt();
		
		return height;
	}
	
	public void getBmi() {
		
	}
	
	public void getBmiCategory() {
		
	}
	
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();   
	}
	
}

Scanner in = new Scanner(System.in);
int units, weight, height;

//Asks the user if they are inputting the values in metric or imperial
System.out.print("Would you like to use metric or imperial units? Enter 1 for metric (kilograms/meters) or 2 for imperial (pounds/inches): ");
units = in.nextInt();

//If they chose the metric system
if (units == 1) {
	//Take the  user's inputed weight
	System.out.print("Enter your weight in kilograms: ");
	weight = in.nextInt();
	
	//Take the  user's inputed height
	System.out.print("Enter your height in meters: ");
	height = in.nextInt();
}
//If they chose the imperial system
else {
	//Take the user's inputed weight
	System.out.print("Enter your weight in inches: ");
	weight = in.nextInt();
	
	//Take the  user's inputed height
	System.out.print("Enter your height in inches: ");
	height = in.nextInt();
}