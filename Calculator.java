
//Lancer dans le terminal (ctrl + ù de VSCode) les deux commandes :
//javac Calculator.java
//Lancer le jeu en envoyant la commande suivante chaque fois que vous voulez jouer :
//java Calculator

//Code de base généré par Copilot, Idée originale et Modifications apportées par Ange_Rmy

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande des trois nombres
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();
        System.out.print("Entrez le troisième nombre : ");
        double num3 = scanner.nextDouble();

        // Demande de l'opération
        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        // Effectue l'opération
        switch (operation) {
            case '+':
                result = num1 + num2 + num3;
                break;
            case '-':
                result = num1 - num2 - num3;
                break;
            case '*':
                result = num1 * num2 * num3;
                break;
            case '/':
                if (num2 != 0 && num3 != 0) {
                    result = num1 / num2 / num3;
                } else {
                    System.out.println("Erreur : Division par zéro !");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Opération non valide !");
                validOperation = false;
        }

        // Affiche le résultat
        if (validOperation) {
            System.out.println("Le résultat est : " + result);
        }

        scanner.close();
    }
    
}

//Lancer dans le terminal (ctrl + ù de VSCode) les deux commandes :
//javac Calculator.java
//Lancer le jeu en envoyant la commande suivante chaque fois que vous voulez jouer :
//java Calculator

//Code de base généré par Copilot, Idée originale et Modifications apportées par Ange_Rmy
