package EmailApp;

import java.util.Scanner;

public class email {
//first we are going to create variables to store our information
String firstName;
String lastName;
String department;
String password;
String randomPassword = "";
String newPass;
public email() {
	
}

public email(String firstName, String lastName, String departmemt) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.department = departmemt;
	
	
}
//Getting the users firstName and lastName
public void userInfo() {
	Scanner ui = new Scanner(System.in);
	System.out.println("What is your First Name: ");
	firstName = ui.nextLine();
	System.out.println("What is your Last Name: ");
	lastName = ui.nextLine();
	
}
public void getName() {
	System.out.println("Name: "+firstName +" "+ lastName);
}
//we are going to generate an email with the following syntax
//Firstname.lastName@department.compamy.com
public void generateEmail() {
	System.out.println("Your new email is: " +firstName.toLowerCase() +"." +lastName.toLowerCase() + "@" + department.toLowerCase() + ".Apple.com");
}

//Then we need to determine the department(sales,development, accounting if none leave blank
public String department() {
	Scanner ui = new Scanner(System.in);
	System.out.println("List of Departments \n1 for sales\n2 for development\n3 for accounting ");
	System.out.println("What is your department: ");
	int depNum = ui.nextInt();
	if(depNum == 1) {
		department = "Sales";
	}else if(depNum == 2) {
		department = "Development";
	}else if(depNum == 3) {
		department = "Accounting";
	}else {
		department = "";
	}
	

	return department;
}
public void generatePassword() {
	for(int j = 0; j < 14; j++) {
		//Add a random lowercase or UPPERCASE character to our randomPassword String
		randomPassword += randomCharacter();
	}
	this.password = randomPassword;
	System.out.println("Your new password is : " + randomPassword);
	
}
public char randomCharacter() {
		//We multiply Math.random() by 62 because there are 26 lowercase letters, 26 uppercase letters, and 10 numbers, and 26 + 26 + 10 = 62
		//This random number has values between 0 (inclusive) and 62 (exclusive)
		int rand = (int)(Math.random()*62);
		
		//0-61 inclusive = all possible values of rand
		//0-9 inclusive = 10 possible numbers/digits
		//10-35 inclusive = 26 possible uppercase letters
		//36-61 inclusive = 26 possible lowercase letters
		//If rand is between 0 (inclusive) and 9 (inclusive), we can say it's a number/digit
		//If rand is between 10 (inclusive) and 35 (inclusive), we can say it's an uppercase letter
		//If rand is between 36 (inclusive) and 61 (inclusive), we can say it's a lowercase letter
		if(rand <= 9) {
			//Number (48-57 in ASCII)
			//To convert from 0-9 to 48-57, we can add 48 to rand because 48-0 = 48
			int number = rand + 48;
			//This way, rand = 0 => number = 48 => '0'
			//Remember to cast our int value to a char!
			return (char)(number);
		} else if(rand <= 35) {
			//Uppercase letter (65-90 in ASCII)
			//To convert from 10-35 to 65-90, we can add 55 to rand because 65-10 = 55
			int uppercase = rand + 55;
			//This way, rand = 10 => uppercase = 65 => 'A'
			//Remember to cast our int value to a char!
			return (char)(uppercase);
		} else {
			//Lowercase letter (97-122 in ASCII)
			//To convert from 36-61 to 97-122, we can add 61 to rand because 97-36 = 61
			int lowercase = rand + 61;
			//This way, rand = 36 => lowercase = 97 => 'a'
			//Remember to cast our int value to a char!
			return (char)(lowercase);
		}
	}

	
// Then we need to determine the department(sales,development, accounting if none leave blank
	
// generate a random password
	
//have set methods to change the password
public void newPassword(){
	Scanner ui = new Scanner(System.in);
	System.out.println("Would you Like to change you password?\n1. Yes\n2. No");
	int passOption = ui.nextInt();
	if(passOption == 1) {
		System.out.println("Please enter your new password:");
		ui.nextLine();
		 String newPass = ui.nextLine();
		setPassword(newPass);
		//System.out.println("Your new password is: " + getPassword());
	}else if(passOption == 2){
		System.out.println("We will email you your password. Thank You!");
	}else {
		System.out.println("Please enter the right option!");
	}
	
}
//have get methods to display the name, email and mailbox capacity

public void display() {
	getName();
	generateEmail();
	System.out.println("Your new password is: " + getPassword());
}


//have set methods to set the mailbox capacity

	
//alternate email address

public String getPassword() {
	return password;
	
}
public void setPassword(String pass){ 
	
	this.password = pass;
}

}
