
public class Decrypter {
	
	public static int [] decrypt(int firstDig, int secondDig, int thirdDig, int fourthDig) {
		//Swaps back the first digit with the third
	    int tempDig;
	    
	    tempDig = firstDig;
	    firstDig = thirdDig;
	    thirdDig = tempDig;
	    
	    //Swaps back the second digit with the fourth
	    tempDig = secondDig;
	    secondDig = fourthDig;
	    fourthDig = tempDig;
	    
	    //Each digit is now the original value + 7, then the remainder after dividing that by 10
	    //So... we can get back to original value by adding 10 - 7 and finding the remainder of THAT divided by 10
	    //The process is broken up into those two steps below:
	    firstDig = firstDig + 3;
	    secondDig = secondDig + 3;
	    thirdDig = thirdDig + 3;
	    fourthDig = fourthDig + 3;
	    
	    firstDig = firstDig % 10;
	    secondDig = secondDig % 10;
	    thirdDig = thirdDig % 10;
	    fourthDig = fourthDig % 10;
		
		//Adds each digit to a consolidated array to be returned and returns that new array
		int[] decryptedInt = {firstDig, secondDig, thirdDig, fourthDig};
		
		return decryptedInt;
	}
	
}