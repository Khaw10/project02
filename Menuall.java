
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Menuall extends BookInheritance{
    private String[] Ma= {"1. Math Vary Fast ", "2. Math New Bie "};
    private String[] Ca= {"3. Car Vary Fast ", "4. Car New Bie "};
    private String[] An= {"5. Animal Vary Fast ", "6. Animal New Bie "};
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> AB = new ArrayList<String>();
    private ArrayList<String> BC = new ArrayList<String>();
    private int many = 0;
    private int i = 0;
    private int day = 0;
    private int k = 0;
    private int[] hab = new int[6];

    combackbook cm = new combackbook();
	combackbook comeback = new combackbook();
	combackbook Math =new combackbook();
	combackbook Car =new combackbook();
	combackbook Animal=new combackbook();

	public void test1(){
		String[] name = {"\n----Category----\n1. Math", "2. Car", "3. Animal", "4. Exit"};
		printArray(name);

	}
	
	public void test2(){
		Math.Catagory("1. Math Vary Fast ", "2. Math New Bie");

	}
	
	public void test3(){
		Car.Catagory("3. Car Vary Fast ", "4. Car New Bie ");

	}
	
	public void test4(){
		Animal.Catagory("5. Animal Vary Fast ", "6. Animal New Bie ");

	}
    public void howbook(){
        System.out.print("\n[How many books would you like to borrow ?] = ");
        many = scanner.nextInt();
        
        int[] array = new int[many];
        for (k = 0; k < array.length;k++){
            System.out.print("Choose books number : ");
            hab[k] = scanner.nextInt();
            if(hab[k] == 1){
                AB.add(Ma[0]);
                BC.add(Ma[0]);
                getBook1Name();
                getBook1ID();
                getBook1Price();
            }
            if(hab[k] == 2){
                AB.add(Ma[1]);
                BC.add(Ma[1]);
                getBook2Name();
                getBook2ID();
                getBook2Price();
            }
            if(hab[k] == 3){
                AB.add(Ca[0]);
                BC.add(Ca[0]);
                getBook3Name();
                getBook3ID();
                getBook3Price();
            }
            if(hab[k] == 4){
                AB.add(Ca[1]);
                BC.add(Ca[1]);
                getBook4Name();
                getBook4ID();
                getBook4Price();
            }
            if(hab[k] == 5){
                AB.add(An[0]);
                BC.add(An[0]);
                getBook5Name();
                getBook5ID();
                getBook5Price();
            }
            if(hab[k] == 6){
                AB.add(An[1]);
                BC.add(An[1]);
                getBook6Name();
                getBook6ID();
                getBook6Price();
            }
            
            
        }
        
    }

    public void CartBook(){
        System.out.println("\nList of Book");
        for ( int i = 0; i < AB.size(); i++ ){
            System.out.println(AB.get(i));
        }


    }

    public void ConfirminCart(){

        while(true){
            System.out.println("press [Y] to Comfirm \npress [B] to return to the Menu page  ");
            char confirm = scanner.next().charAt(0);

            if(confirm == 'Y' ){
                cm.Warnings();
                System.out.print("Please enter the date of borrowing books : " );
                day = scanner.nextInt();
                if(true){
                    day = day + 7;
                    int day7 = 7;
                    if(day >= 31){
                        day = 1;
                        day += day7;
                        System.out.println("Please return books by the date [" + day+"]");
                    }
                    else{
                        System.out.println("Please return books by the date [" + day+"]");

                    }
                }
                System.out.println("======Complete======");
                AB.clear();
                break;
            }
            if(confirm == 'B'){
                break;
            }
            if(confirm == 'D' ){
                System.out.println("Cancel Order");
                i = 0;
                AB.clear();
                BC.clear();
                break;
            }
            else{
                System.out.println("Try agian");
                continue;
            }
        }
    }

    public void history(){
        System.out.println("History of Book");
        for ( int i = 0; i < BC.size(); i++ ){
            System.out.println(BC.get(i) + " Date return a book  "+ day);
        }

    }

    public void givebook(){
        for ( int i = 0; i < BC.size(); i++ ){
            System.out.println(BC.get(i) + day);
        }
        
        System.out.print("Choose for give book : ");
        int give = scanner.nextInt();
        if(give == 1){
            BC.remove(Ma[0]);
        }
        if(give == 2){
            BC.remove(Ma[1]);
        }
        if(give == 3){
            BC.remove(Ca[0]);
        }
        if(give == 4){
            BC.remove(Ca[1]);
        }
        if(give == 5){
            BC.remove(An[0]);
        }
        if(give == 6){
            BC.remove(An[1]);
        }
        if(give >= 1){
            System.out.print("Please enter the return date of the book.: ");
            int returndate = scanner.nextInt();
            int overdue = returndate - day;
            int mulct = overdue * 100;
            if( returndate >= day){
                if(returndate != day){
                    System.out.println("Price per book " + mulct);
                    System.out.print("Do you want to pay? (Y=Yes/D=Don't) ");
                    char want = scanner.next().charAt(0);
                    if(want == 'Y'){
                    
                    System.out.print("How much to pay?: ");
                    int pay = scanner.nextInt();
                    if(pay >= mulct){
                        System.out.println("Paid");
                        System.out.println("Change money " + (pay-mulct));
                    }else{
                        System.out.println("The amount you want to pay is insufficient.");
                    }
                }
                }
                else{
                    System.out.println("You don't have any payable list");
                }
            }
            if( returndate <= day){
                System.out.println("Thank You");
            }
        }
        if(give <= 0){
            System.out.println("No Data!");
        }
    }
    public void printArray(String[] name){
        for(int i = 0; i < name.length; i++){
            System.out.print(name[i]+ " ");
            System.out.println();
        }
    } 
}
