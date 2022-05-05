
import java.util.Scanner;

public class combackbook{
    Scanner scanner = new Scanner(System.in);
    char user;
    public void First(){
        Customer user = new Customer();
        while(true) {
            System.out.println("**Welcome to book borrowing system**");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            if(choice == 1){
                user.register();
                
            }
            else if(choice == 2){
                user.Login();
                break;
            }
            else{
                System.out.println("No Choose");
                continue;
            }
        }
    }
    public void Warnings(){
        System.out.println("**annotation**\n-Please don't lose the book.");
        System.out.println("-If lost, adjust according to the price of the book.");
        System.out.println("-If you return the book beyond the deadline, you will be fined 100 Baht per book per day.");
    }

    public void Catagory() {
        System.out.println("No Skill");
    }

    public void Catagory(String...Menu)
    {
        for (int i=0;i<Menu.length;i++) {
        System.out.println(Menu[i]);
        }
    } 
}
