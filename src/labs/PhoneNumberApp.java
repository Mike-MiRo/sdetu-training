package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a file and will retrieve phone number
		
		String filename = "C:/_JAVA_JUNIOR_COURSE/Files/PhoneNumber.txt";
		File file = new File(filename);
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNum = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file " + filename);
			e.printStackTrace();
		}
		
		// Valid phone number: 
			// 10 digits long
			// Area code cannot start in 0 or 9
			// There can be no 911 in the phone
		try {
			if(phoneNum.length() != 10) {
				throw new TenDigitsException(phoneNum);
			}
			if(phoneNum.substring(0, 1).equals("0")  ||  phoneNum.substring(0, 1).equals("9")) {
				throw new AreaCodeException(phoneNum);
			}
			if(phoneNum.contains("911")) {
				throw new EmergencyException(phoneNum);
			}
			System.out.println(phoneNum);
		} catch (TenDigitsException e) {
			System.out.println("ERROR: Phone number '" + phoneNum + "' is not 10 digits");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("ERROR: Phone number '" + phoneNum + "' has invalid area code");
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			System.out.println("ERROR: Phone number '" + phoneNum + "' contains invalid 911 sequence");
			System.out.println(e.toString());
		}

	}

}

class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString() {
		return "TenDigitsException: " + num;
	}
}

class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num){
		this.num = num;
	}
	public String toString() {
		return "AreaCodeException: " + num;
	}
}

class EmergencyException extends Exception {
	String num;
	EmergencyException(String num){
		this.num = num;
	}
	public String toString() {
		return "EmergencyException: " + num;
	}
}