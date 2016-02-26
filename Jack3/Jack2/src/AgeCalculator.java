//Created by Andrew Erickson, Sept 2014
//Level 1 - using methods


public class AgeCalculator {

	public static void main(String[] args) {
		// 1. Create a string variable for your name and an int for your age
String Name = "Jack";
int age = 48;
// 2. Call the Hello() method 
Hello();
//3. Create and call your own void method that takes a name as a string input and prints a greeting. Ex. ÒHello <input>. How are you?Ó
 Hi(Name);
//4. Modify that method so that it outputs the string
//5. Create a method that takes your age in years and returns your age in months
 double AgeMonths = Old(age);
//6. Create a method called printAge that takes an int as an input. Have this method say ÒYou are <input> months old. Ò
//7. Create a method called that takes your age in years and returns your age in days
 double AgeDays = Old2(age);
//8. Create a method that takes your age in years and returns your age in mins
 double AgeMinutes = Old3(age);
//9. Modify printAge to take a string value for a unit as well. Have this method say ÒYou are <input> <units> old.Ó
 double AgeSeconds = Old4(age);
//10. Call this method several times to display your age in months and mins. 
printAge("Months",AgeMonths);
printAge("Days",AgeDays);
printAge("Minutes",AgeMinutes);
printAge("Seconds",AgeSeconds);
	}
	
	public static void Hello() {
		System.out.print("Hello. ");
		System.out.print("How ");
		System.out.println("are you?");
	}
	public static void Hi(String input) {
		 System.out.println("Hello "+input+". How are you?");
	 }
	public static double Old(double input){
		double AgeMonth = input*12;
		return AgeMonth;
	}
	public static void printAge(String input2,double input){
		System.out.print("You are ");
		System.out.print(input);
		System.out.print(" ");
		System.out.print(input2);
		System.out.println(" Old.");
	}
	public static double Old2(double input){
		double AgeDay = input*360;
		return AgeDay;
	}
	public static double Old3(double input){
		double AgeMinute = input*525949;
		return AgeMinute;
	}
	public static double Old4(double input){
		double AgeSecond = input*31536000;
		return AgeSecond;
	}
}

