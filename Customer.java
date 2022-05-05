
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends StudentName implements CustomStudentData{
	private String StudentID;
	private String StudentEmail;
    private String StudentPass;
    private ArrayList<String>dataNames = new ArrayList<String>();
    private ArrayList<String>dataIDs = new ArrayList<String>();
    private ArrayList<String>dataEmail = new ArrayList<String>();
    private ArrayList<String>dataPass = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

	public void register() {
		System.out.println("\n--------Register--------");
		System.out.print("User your Name: ");
		StudentName = input.next();
        if(StudentName != null) {
            dataNames.add(StudentName);
        }
		System.out.print("User your ID: ");
		StudentID = input.next();
        if(StudentID != null){
            dataIDs.add(StudentID);
        }
		System.out.print("User your email: ");
		StudentEmail = input.next();
        if(StudentEmail != null){
            dataEmail.add(StudentEmail);
        }
        System.out.print("User your Password: ");
		StudentPass = input.next();
        if(StudentPass != null){
            dataPass.add(StudentPass);
        }
        System.out.print("\033\143");		
	}

	public void Login() {
		System.out.println("\n--------Login--------");
        System.out.print("Input Email: ");
        String InputEmail = input2.next();

        System.out.print("Input Password: ");
        String InputPassword = input2.next();

        if(dataEmail.contains(InputEmail)){
            if(dataPass.contains(InputPassword)){
                if(true){
                    System.out.println("Welcome  " + StudentName);
                    MainGood();
                }
            }
            else{
                ChangeLogin();
                System.out.print("\033\143");
            }
        }
        else{
            ChangeLogin();
            System.out.print("\033\143");

            
        }
	}

    public void ChangeLogin() {
        System.out.println("Error Email or Password Wrong");
        System.out.print("If you want to login again input Y or you want change password input C: ");
        char Uw = input.next().charAt(0);
        if(Uw == 'Y'){
            Login();
        }
        else if(Uw == 'C'){
            updateProfile();
        }
        else{
            System.out.println("You input not valid");
        }
    }
	public void updateProfile() {
        System.out.println("Change Password ");
        System.out.print("Input New Password: ");
        String newPassword = input.next();

        if(newPassword != null ){
            dataPass.remove(StudentPass);
            dataPass.add(newPassword);
            System.out.print("\033\143");
            Login();
        }
	}

    public void MainGood(){
    	
    	System.out.println("\nWelcome  " + StudentName);
		Menuall menu = new Menuall();
		while (true) {
            System.out.println("\n------Menu------");
			System.out.println("1. Book");
			System.out.println("2. List of book");
			System.out.println("3. History of book");
			System.out.println("4. Givebook");
			System.out.println("5. Exit");
			System.out.print("Choose: ");
			int Choice = scanner.nextInt();
    
            if(Choice == 1){
                menu.test1();
                System.out.print("Choose: ");
                int select = scanner.nextInt(); 
            
                if(select == 1) {
                    menu.test2();
                    menu.howbook();
                }
                if(select == 2){
                    menu.test3();
                    menu.howbook();
                }
                if(select == 3){
                    menu.test4();
                    menu.howbook();
                }
                if(select == 4){
                    continue;
                }
            }
            else if(Choice == 2){
                menu.CartBook();
                if(true){
                    menu.ConfirminCart();
                }
               while(true){
                System.out.print("\nWould you like to do another list?");
                System.out.println("\npress [Y]=Yes \npress [N]=No ");
                char list = scanner.next().charAt(0);
                if(list == 'Y'){
                    break;
                }
                else if(list == 'N'){
                    System.out.println("Thank You");
                    break;
                }
                else{
                    System.out.println("Try Again!");
                    continue;
                }
               }
                
            }
            if(Choice == 3){
                menu.history();
            }
            if(Choice == 4){
                menu.givebook();
            }
            if(Choice == 5){
                System.out.println("Good Bye");
                break;
            }
            
        }
    }

    @Override
    public void Customer() {
        
    }

}