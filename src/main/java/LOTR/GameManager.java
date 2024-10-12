package LOTR;

import java.util.Scanner;

public class GameManager {
    Character c1;
    Character c2;
    
    GameManager(){
        CharacterFactory cf = new CharacterFactory();
        try {
            c1 = cf.createCharacter();
            c2 = cf.createCharacter();
        } catch (Exception e){
            System.out.println("fight impossible");
        }
        
    }

    GameManager(Character c1, Character c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to create 2 characters to fight? [y/n]");
        boolean custom = sc.nextLine().contains("y")?true:false;
        CharacterFactory chF = new CharacterFactory();
        Character f1;
        Character f2;
        if (custom) {
            System.out.println("Please choose 1st character from this list:");
            System.out.println("Hobbit: power=0 health=3");
            System.out.println("Elf: poer=10 health=10");
            System.out.println("King: poer=[5:15] health=[5:15]");
            System.out.println("Knight: poer=[2:12] health=[2:12]");
            String c1 = sc.nextLine();
            f1 = chF.fromString(c1);

            System.out.println("Please choose 2nd character from this list:");
            System.out.println("Elf: poer=10 health=10");
            System.out.println("King: poer=[5:15] health=[5:15]");
            System.out.println("Knight: poer=[2:12] health=[2:12]");
            String c2 = sc.nextLine();
            f2 = chF.fromString(c2);
        } else {
            f1 = chF.createCharacter();
            f2 = chF.createCharacter();
        }

        System.out.println("Your fighters are: " + f1.toString() + " and " + f2.toString());
        if (f1.toString().equals("Hobbit: (3hp; 0pw)") && f2.toString().equals("Hobbit: (3hp; 0pw)")) {
            System.out.println("They are both Hobbits. They'll just have a tea party");
            sc.close();
            return;
        }
        System.out.println();

        while (f1.isAlive() && f2.isAlive()) {
            System.out.println(f1.toString() + " kicks " + f2.toString());
            f1.kick(f2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

            if (f2.isAlive()){
                System.out.println(f2.toString() + " throws a kick back");
                f2.kick(f1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            } else {
                System.out.println(f2.toString() + " is dead");
                System.out.println(f1.toString() + " wins!!!");
            }
        }

        sc.close();
    }
}
