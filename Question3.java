/*  student name: Yuriko Uchida
 *  student number: #200448500
 *  due date: December 6th, 2020
 *  course name: Programming Fundamentals (COMP 1030)
 */



import java.util.Scanner; //Include Scanner.

public class Question3 {
	
	public static void main(String[] args) {
		
		String password = "georgian"; //Declare a variable, "password" to set a password.
		String reEnter = ""; //Declare an empty variable, "reEnter."
		int count = 3; //Declare a variable, "count."
		
		Scanner scan = new Scanner(System.in); //Refresh the scanner class.
		System.out.println("Enter the password: ");	//Ask to enter the password.
		String data = scan.nextLine();
		
		if (data.equals(password)) //If the password is valid.
		{
		System.out.println("Password Accepted !!!"); //Print the password is accepted.
		}
		else //If the password is not valid.
		{
			while ((1 <= count) && (count <= 3)) //If a user has a chance to try re-entering the password.
			{
				if ((count == 2) || (count == 3)) //If it is the first or second attempt.
				{
				System.out.println("Incorrect Password, Please re-enter password – " + count + " tries left"); //Print the number of attempts left.
				System.out.println("Enter the password: ");	//Ask to re-enter the password.
				String re = scan.nextLine();
				reEnter = re; //Substitute "re" in "reEnter."
				count--; //Count down the number of attempts.
				}
				else if (count == 1) //If it is the third attempt.
				{
				System.out.println("Incorrect Password, Please re-enter password – last try !!!"); //Print that is the last attempt.		
				System.out.println("Enter the password: ");	//Ask to re-enter the password.
				String re = scan.nextLine();
				reEnter = re; //Substitute "re" in "reEnter."
				count = 0; //No attempt is left.
				}

				if (reEnter.equals(password)) //If the re-entered password is valid during 1-3 attempts.
				{
				System.out.println("Password Accepted !!!"); //Print the password is accepted.
				count = -1; //Set "count" as -1 not to repeat while() loop again.
				}
			}

			while (count == 0) //If although the re-entered password is not valid, no attempt is left.
			{
			System.out.println("Reset the password. Please enter a new password."); //Ask to enter a new password to reset the password.
			String newPassword = scan.nextLine();
			password = newPassword; //Substitute "newPassword" in "password."
			System.out.println("Your new password is " + password); //Print the new password.
			break; //End the while() loop not to repeat again.
			}
			
			count = 3; //Restore "count" to 3 for the next time.
		}
		
		
		scan.close(); //End the input.

	} //The end of the main class.
} //The end of the class.