import java.util.Scanner;
public class calcul {

    public static double Addition(int n1, int n2) {
        return n1 + n2;
    }
    public static double Soustraction(int n1, int n2) {
        return n1 - n2;
    }
    public static double Multiplication(int n1, int n2) {
        return n1 * n2;
    }
    public static double Division(int n1, int n2, Scanner sc) {
        while (n2 == 0) {
            System.out.println("Erreur : Division par zéro impossible.");
            System.out.print("Veuillez entrer un nombre différent de zéro pour le diviseur : ");
            n2 = sc.nextInt();
        }
        return (double) n1 / n2;
    }
    public static double Racinecarré(int n1) {
        return Math.sqrt(n1);
    }
    public static double Puissance(int n1, int n2) {
        return Math.pow(n1, n2);
    }
    public static long factorielle(int n) {
        if (n < 0) {
            System.out.println("Erreur la factorielle n'est pas defini pour les nombres negatifs");
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int choix, n1 = 0, n2 = 0;
        double resultat;
        Scanner Sc = new Scanner(System.in);
        while (true) {
            System.out.println("=================================");
            System.out.println("Menu principal de la calculatrice.");
            System.out.println("=================================");
            System.out.println("1- Addition (+)");
            System.out.println("2- Soustraction (-)");
            System.out.println("3- Multiplication (*)");
            System.out.println("4- Division (/)");
            System.out.println("5- Puissance (^)");
            System.out.println("6- Racine carré");
            System.out.println("7- factorielle");
            System.out.println("8- Quitter");
            System.out.print("Veuillez entrer votre choix : ");
            choix = Sc.nextInt();
            if (choix >=1&& choix<=5) {
                System.out.print("Entrer votre premier nombre : ");
                n1 = Sc.nextInt();
                System.out.print("Entrer votre deuxième nombre : ");
                n2 = Sc.nextInt();
            }
            switch (choix) {
                case 1:
                    resultat = Addition(n1, n2);
                    System.out.println("le resultat est:" + resultat);
                    break;
                case 2:
                    resultat = Soustraction(n1, n2);
                    System.out.print("le resultat est:" + resultat);
                    break;
                case 3:
                    resultat = Multiplication(n1, n2);
                    System.out.println("le resultat est:" + resultat);
                    break;
                case 4:
                    resultat = Division(n1, n2, Sc);
                    System.out.println("le resultat est:" + resultat);
                    break;
                case 5:
                    resultat = Puissance(n1, n2);
                    System.out.println("Le résultat de " + n1 + " élevé à la puissance " + n2 + " est : " + resultat);
                    break;
                case 6:
                    System.out.println("Entrer votre nombre :");
                    n1 = Sc.nextInt();
                    if (n1 >= 0) {
                        resultat = Racinecarré(n1);
                        System.out.println("La racine carrée de " + n1 + " est : " + resultat);
                    } else {
                        System.out.println("Erreur : La racine carrée d'un nombre négatif n'est pas définie.");
                    }
                    break;
                case 7:
                    System.out.println("Entrer le nombre pour lequel vous souhaitez calculer la factorielle :");
                    n1 = Sc.nextInt();
                    long fact = factorielle(n1);
                    if (fact != -1) {  // Si la factorielle a été correctement calculée
                        System.out.println("La factorielle de " + n1 + " est : " + fact);
                    }
                    break;
                case 8:
                    System.out.println("au revoir!");
                    break;
                default:
                    System.out.println("choix invalid");
                    break;
            }
        }
    }
}