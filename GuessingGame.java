
//Lancer dans le terminal (ctrl + ù de VSCode) les deux commandes :
//javac GuessingGame.java
//Lancer le jeu en envoyant la commande suivante chaque fois que vous voulez rejouer avec le terminal :
//java GuessingGame

//Code de base généré par Copilot, Idée originale et Modifications apportées par Ange_Rmy

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int previousGuess = -1;
        int currentGuess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Bienvenue dans le jeu de devinette !");
        System.out.println("J'ai choisi un nombre entre 1 et 100. À toi de deviner lequel.");

        while (!hasGuessedCorrectly) {
            System.out.print("Entrez votre devinette : ");
            currentGuess = scanner.nextInt();

            if (currentGuess == numberToGuess) {
                System.out.println("Félicitations ! Tu as deviné le bon nombre !");
                hasGuessedCorrectly = true;
            } else {
                if (previousGuess != -1) {
                    if (Math.abs(numberToGuess - currentGuess) < Math.abs(numberToGuess - previousGuess)) {
                        System.out.println("Chaud !");
                    } else {
                        System.out.println("Froid !");
                    }
                } else {
                    System.out.println("Essayez encore !");
                }
                previousGuess = currentGuess;
            }
        }

        scanner.close();
    }
}


//Lancer dans le terminal (ctrl + ù de VSCode) les deux commandes :
//javac GuessingGame.java
//Lancer le jeu en envoyant la commande suivante chaque fois que vous voulez rejouer avec le terminal :
//java GuessingGame

//Code de base généré par Copilot, Idée originale et Modifications apportées par Ange_Rmy
