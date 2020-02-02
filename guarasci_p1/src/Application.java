
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//Declares the variables
		Scanner in = new Scanner(System.in);
		int encOrDec, inputDigits, firstDig, secondDig, thirdDig, fourthDig, i;
		
		//Gets the four digit number from the user
		System.out.print("Enter a four digit number: ");
		inputDigits = in.nextInt();
		
		//Separates the number into separate digits
		fourthDig = (inputDigits % 10);
		inputDigits = inputDigits / 10;
		thirdDig = (inputDigits % 10);
		inputDigits = inputDigits / 10;
		secondDig = (inputDigits % 10);
		inputDigits = inputDigits / 10;
		firstDig = (inputDigits % 10);
		
		//Gets whether or not the user would like to encrypt or decrypt the dumber
		System.out.print("Would you like to encrypt or decrypt this number? Enter 1 to encrypt or 2 to decrypt: ");
		encOrDec = in.nextInt();
		
		//If they said they'd like to encrypt it....
		if (encOrDec == 1) {
			//Uses the Encrypter class and encrypt method with the inputed digits and inputs the result into "encryptedDig"
			int[] encryptedDig = Encrypter.encrypt(firstDig, secondDig, thirdDig, fourthDig);
			
			//Prints the encrypted digit that was returned earlier by printing each digit in the returned array
			System.out.print("Encrypted integer: ");
			for (i=0; i<4; i++) {
				System.out.print(encryptedDig[i]);
			}
		}
		//If they said they'd like to decrypt it....
		else {
			//Uses the Decrypter class and decrypt method with the inputed digits and inputs the result into "decryptedDig"
			int[] decryptedDig = Decrypter.decrypt(firstDig, secondDig, thirdDig, fourthDig);
			
			//Prints the encrypted digit that was returned earlier by printing each digit in the returned array
			System.out.print("Decrypted integer: ");
			for (i=0; i<4; i++) {
				System.out.print(decryptedDig[i]);
			}
		}
		
		//Closes in to avoid a resource leak
		in.close();
	}

}
