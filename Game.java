import java.util.Scanner;
@SuppressWarnings("unused")

public class Game {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner enterScanner = new Scanner(System.in);

    static int playerHp;
    static String playerWeapon;
    static String playerName;
    static int choice;

    static int goblinHp;

    
    public static void main(String[] args){

        PlayerSetup();

        TownGate();
    
    }

    public static void PlayerSetup(){
        playerHp = 15;

        playerWeapon = "Knife";

        System.out.println("Your HP: " + playerHp);
        System.out.println("Your Weapon: " + playerWeapon);


        System.out.print("Please enter your name: ");

        playerName = scanner.next();

        System.out.println("Hello " + playerName + ", welcome to adventure game!");
    }

    public static void TownGate(){

        System.out.println("You are at the gate of the town.");
        System.out.println("A guard is standing in front of you.");
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("[1] Talk to the guard");
        System.out.println("[2] Attack the guard");
        System.out.println("[3] Leave\n");
        
        System.out.print("What would you like to do?: ");
        choice = scanner.nextInt();

        System.out.println("\n\n\n");
        switch (choice) {
            case 1 -> {
                System.out.println("Guard: Hello there stranger.");
                enterScanner.nextLine();
                TownGate();
            }
            case 2 -> {
                System.out.println("Guard: What the hell? Don't be stupid.");
                System.out.println("\nThe guard hits you back. He don't seem to be fazed.");
                playerHp--;
                System.out.println("\nYour HP: " + playerHp);
                enterScanner.nextLine();
                TownGate();
            }
            case 3 -> {
                CrossRoad();
            }
            default -> TownGate();
        }
    }

    public static void CrossRoad(){
        System.out.println("\n\n\n");
        System.out.println("You found yourself at a cross road.");
        System.out.println("[1] North");
        System.out.println("[2] East");
        System.out.println("[3] West");
        System.out.println("[4] South");
        System.out.print("\nWhere would you like to go?: ");

        choice = scanner.nextInt();
        switch(choice){
            case 1-> {
                TownGate();
            }
            case 2-> {
                Lake();
            }
            case 3-> {
                Forest();
            }
            case 4-> {
                Fountain();
            }
            default -> CrossRoad();
        }
    }

    public static void Lake(){
        System.out.println("\n\n\n");
        System.out.println("You found yourself at a crystal clear lake.\n");
        System.out.println("[1] Drink lake water");
        System.out.println("[2] Go Back");
        System.out.print("\nWhat would you like to do?: ");

        choice = scanner.nextInt();

        switch(choice){
            case 1 -> { //some novelistic writing about drinking water from the lake
                System.out.println("You scooped some water with your hands.");

                if(playerHp == 14){
                    playerHp++;
                    System.out.println("You feel somehow feel better.");
                    System.out.println("+1 HP");
                    enterScanner.nextLine();
                }

                else if(playerHp < 14){
                    playerHp+=2;
                    System.out.println("You feel refreshed.");                    
                    System.out.println("+2 HP");
                    enterScanner.nextLine();
                }

                else if(playerHp >= 15){
                    System.out.println("Nothing happened.");
                    enterScanner.nextLine();
                }

                Lake();
            }

            case 2 -> {
                CrossRoad();
            }

            default -> Lake();
        }
    }

    public static void Forest(){
        System.out.println("\n\n\n");
        System.out.println("You found yourself at a forest.");
        enterScanner.nextLine();
        System.out.println("A goblin appeared!\n");
        System.out.println("[1] Attack");
        System.out.println("[2] Flee");
        System.out.print("\nWhat would you like to do?: ");

        choice = scanner.nextInt();

        switch(choice){
            case 1 -> { //Battle Starts!
            System.out.println("You attacked the goblin and dealt 2 damage!");
            enterScanner.nextLine();
            System.out.println("The goblin hit you back!");

            }
            case 2 -> {
                CrossRoad();
            }
    }
}

    public static void Fountain(){
        System.out.println("\n\n\n");
        System.out.println("You stumbled upon a fountain with a statue of a certain Goddess.");
        System.out.println("[1] Pray");
        System.out.println("[2] Leave");
        System.out.print("\nWhat would you like to do?: ");

        choice = scanner.nextInt();

        switch(choice){
            case 1 -> {
                System.out.println("Facing the statue, you slightly bowed and closed your eyes.");
                enterScanner.nextLine();
                System.out.println("...");
                enterScanner.nextLine();
                System.out.println("...");
                enterScanner.nextLine();
                System.out.println("You feel at ease.");
                enterScanner.nextLine();
                Fountain();
            }

            case 2 -> {
                CrossRoad();
            }

            default -> Fountain();
        }
    }

    public static void Goblin(){
        goblinHp = 10 
    }
}
