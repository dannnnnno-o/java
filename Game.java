import java.util.Scanner;
@SuppressWarnings("unused")

public class Game {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner enterScanner = new Scanner(System.in);

    static int playerHp;
    static String playerWeapon;
    static String playerName;
    static int choice;
    static int event = 0;
    static int townEvent = 0;
    static int fountainEvent = 0;
    static int lakeEvent = 0;

    static int goblinHp;
    static String goblinWeapon;    
    public static void main(String[] args){

        PlayerSetup();
        GoblinSetup();
        System.out.println("");
        TownGate();
    
    }

    public static void PlayerSetup(){
        playerHp = 15;
        playerWeapon = "Knife";

        System.out.println("Your HP: " + playerHp);
        System.out.println("Your Weapon: " + playerWeapon);
        System.out.println("");
        System.out.print("Please enter your name: ");

        playerName = scanner.next();

        System.out.println("Hello " + playerName + ", welcome to adventure game!");
    }

    public static void GoblinSetup(){
        goblinHp = 10;
        goblinWeapon = "club";
    }



    public static void TownGate(){

        if(townEvent == 0){
            System.out.println("You are at the gate of the town.");
            System.out.println("A guard is standing in front of you.\n");
        }
        else if(townEvent == 1){
            System.out.println("The guard is standing in front of you.\n");
        }

        System.out.println("[1] Talk to the guard");
        System.out.println("[2] Attack the guard");
        System.out.println("[3] Leave\n");
        
        System.out.print("What would you like to do?: ");
        choice = scanner.nextInt();

        System.out.println("\n\n\n");
        switch (choice) {
            case 1 -> {
                if(townEvent == 0){
                    System.out.println("Guard: Hello there stranger.");
                    enterScanner.nextLine();
                    System.out.println("Guard: So your name is " + playerName + "?");
                    enterScanner.nextLine();
                    System.out.println("Guard: There's currently a roaming goblin in the forest towards the west.");
                    enterScanner.nextLine();
                    System.out.println("Guard: Would you mind dealing with that for me?");
                    enterScanner.nextLine();
                    System.out.println("Guard: I can let you in if you bring me his head.");
                    enterScanner.nextLine();
                    townEvent = 1;
                }

                else if (townEvent == 1 && goblinHp != 0){
                    System.out.println("Guard: I can let you in if you bring me the goblin's head.");
                    enterScanner.nextLine();
                    System.out.println("Guard: He was roaming around the forest towards the west.");
                    enterScanner.nextLine();
                }

                else if(townEvent == 1 && goblinHp == 0){
                    System.out.println("Guard: Oh! Is that...");
                    enterScanner.nextLine();
                    System.out.println("Guard: The goblin's head?!");
                    enterScanner.nextLine();
                    System.out.println("Guard: Thank you so much for taking him down!");
                    enterScanner.nextLine();
                    System.out.println("Guard: I can't leave my post and there isn't anyone available recently to deal with him.");
                    enterScanner.nextLine();
                    System.out.println("Guard: Anyways, the sun is about to set. You should spend the rest of the night here.");
                    enterScanner.nextLine();
                    System.out.println("Guard: Again, thank you, "+ playerName + ".");
                    enterScanner.nextLine();

                    System.out.println("Prologue Ends");

                    System.exit(0);
                }

                TownGate();
            }
            case 2 -> {
                if(playerHp > 10){
                System.out.println("Guard: What the hell? Don't be stupid.");
                System.out.println("\nThe guard hits you back. He don't seem to be fazed.");
                playerHp--;
                System.out.println("\nYour HP: " + playerHp);
                }

                else if(playerHp <= 10){
                    System.out.println("The guard blocks your attack.");
                    enterScanner.nextLine();
                    System.out.println("Guard: You've taken a lot of damage already, learn your lesson.\n");
                }

                enterScanner.nextLine();
                townEvent = 1;
                TownGate();
            }
            case 3 -> {
                System.out.println("You walked towards south.");
                enterScanner.nextLine();
                CrossRoad();
            }
            default -> TownGate();
        }
    }

    public static void CrossRoad(){
        System.out.println("\n\n\n");
        System.out.println("You found yourself at a cross road.\n");
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
        if(lakeEvent == 0){
        System.out.println("You found yourself at a crystal clear lake.\n");
        }
        else if(lakeEvent == 1){
        System.out.println("You're at a crystal clear lake.\n");
        }
    System.out.println("[1] Drink lake water");
    System.out.println("[2] Go Back");
    System.out.print("\nWhat would you like to do?: ");

        choice = scanner.nextInt();

        switch(choice){
            case 1 -> { //some novelistic writing about drinking water from the lake
                System.out.println("You scooped some water with your hands.");
                enterScanner.nextLine();

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

                lakeEvent = 1;
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
        switch(goblinHp){
            case 10 -> {
                System.out.println("You found yourself at a forest.");
                enterScanner.nextLine();
                System.out.println("A goblin appears before you!\n");
            }

            case 6 ->{
            System.out.println("The goblin seems hurt.\n");
            }
            
            case 2 -> {
            System.out.println("The goblin struggles to stay on his feet.\n");
            }

            case -2 -> {
                System.out.println("The goblin fell!\n");
                goblinHp = 0;
            }
        }

        if(goblinHp > 0){
        System.out.println("[1] Attack");
        System.out.println("[2] Flee");
        }
        else if(goblinHp <= 0){
            System.out.println("It's about night time.");
            System.out.println("Better head back to the town.\n");

            System.out.println("[1] Return to the crossroad");
        }
        System.out.print("\nWhat would you like to do?: ");


        choice = scanner.nextInt();
        if(goblinHp != 0){
            switch(choice){
                case 1 -> { //Battle Starts!
                if(goblinHp > 0){
                    if(playerHp > 0){
                        Battle();
                    }
                    else if(playerHp == 0){
                        System.out.println("The goblin kills you.");
                        enterScanner.nextLine();
                        System.out.println("Game Over");
                        enterScanner.nextLine();
                        System.exit(0);
                    }
                    Forest();
                }

                }
                case 2 -> {
                    CrossRoad();
                }
                default -> Forest();
            }
        }

        else if(goblinHp == 0){
            switch(choice){
                case 1 -> CrossRoad();

                default -> Forest();
            }

        }
    }

    public static void Battle(){
        System.out.println("You attacked the goblin and dealt 4 damage!");
        goblinHp -= 4;
        enterScanner.nextLine();
        if(goblinHp > 0){
            System.out.println("The goblin hit you back with it's " + goblinWeapon + " and dealt 3 damage!");
            playerHp -= 3;
            System.out.println("Your HP: " + playerHp);
            enterScanner.nextLine();
        }
    }

    public static void Fountain(){
        System.out.println("\n\n\n");
        if(fountainEvent == 0){
            System.out.println("You stumbled upon a fountain with a statue of a certain Goddess.\n");
        }
        else if(fountainEvent == 1){
            System.out.println("A fountain with a statue of a certain Goddess stands before you.\n");
        }
            System.out.println("[1] Pray");
            System.out.println("[2] Leave");
            System.out.print("\nWhat would you like to do?: ");

        choice = scanner.nextInt();

        switch(choice){
            case 1 -> {
                if(fountainEvent == 0){
                    System.out.println("Facing the statue, you slightly bowed and closed your eyes.");
                }
                else if(fountainEvent == 1){
                    System.out.println("You slightly bowed your head and closed your eyes.");
                }
                enterScanner.nextLine();
                System.out.println("...");
                enterScanner.nextLine();
                System.out.println("...");
                enterScanner.nextLine();
                System.out.println("You feel at ease.");
                enterScanner.nextLine();
                fountainEvent = 1;
                Fountain();
            }

            case 2 -> {
                CrossRoad();
            }

            default -> Fountain();
        }
    }
}
