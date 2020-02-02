
public class Encrypter {
	
	public static int[] encrypt(int firstDig, int secondDig, int thirdDig, int fourthDig) {
	    //Replaces each digit with the result of adding seven to the digit
		firstDig = firstDig + 7;
	    secondDig = secondDig + 7;
	    thirdDig = thirdDig + 7;
	    fourthDig = fourthDig + 7;
	    
	    //Replaces each digit by the remainder after dividing it by 10
	    firstDig = firstDig % 10;
	    secondDig = secondDig % 10;
	    thirdDig = thirdDig % 10;
	    fourthDig = fourthDig % 10;
	    
	    //Swaps the first digit with the third
	    int tempDig;
	    
	    tempDig = firstDig;
	    firstDig = thirdDig;
	    thirdDig = tempDig;
	    
	    //Swaps the second digit with the fourth
	    tempDig = secondDig;
	    secondDig = fourthDig;
	    fourthDig = tempDig;
		
	    //Adds each digit to a consolidated array to be returned and returns that new array
	    int[] encryptedInt = {firstDig, secondDig, thirdDig, fourthDig};
	    
		return encryptedInt;
	}
	
}
