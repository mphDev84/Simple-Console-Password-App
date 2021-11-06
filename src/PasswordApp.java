import java.util.Scanner;
public class PasswordApp {

	public static void main(String[] args) {

	/*simple password checker app*/
		
		Scanner sc = new Scanner(System.in);
		
		int counter=0;
		
		String name = "";
		
		String password  = "";
		boolean isNameValid = false;
		boolean isPasswordValid = false;
		
		while (!isNameValid) {
			System.out.println("Enter name: ");
			name = sc.next();
			if (name.equalsIgnoreCase("matt")) {
				isNameValid=true;
				Person person = infoDataBase.getPerson(name);
				System.out.println(person.getInfo()+" "+name+" is "+person.getAge()+" years old");
			}
			else if (name.equalsIgnoreCase("ali")) {
				isNameValid=true;
				Person person = infoDataBase.getPerson(name);
				System.out.println(person.getInfo()+" "+name+" is "+person.getAge()+" years old");
			}
			else {
				System.out.println("Error! Enter a valid name.");
				
			}
		}
		
		while (!isPasswordValid) {
			System.out.println("Enter password: ");
			password = sc.next();
			if (password.equalsIgnoreCase("parasailing")) {
				isPasswordValid=true;
			}
			else {
				System.out.println("Error! Enter a valid password. "+(2-counter)+" tries left!");
				counter++;
			}
			if(counter==3) {
				System.out.println("locked out!");
				break;
			}
		}
		
		if (isPasswordValid && isNameValid) {
			System.out.println("You've gained access!");
		
		}
	}

}
