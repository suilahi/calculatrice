import java.util.Scanner;
public class calcul {

    public static void main(String[] args) {
        int choix, n1=0, n2=0;
        double resultat;
        System.out.println("Menu principal de la calculatrice.");
        System.out.println("1 - Addition (+)");
        System.out.println("2 - Soustraction(-)");
        System.out.println("3- Multiplication (*)");
        System.out.println("3- Division (/)");
        System.out.println("4 - Quitter");
        System.out.print("Veuillez entrer votre choix : ");
        Scanner Sc = new Scanner(System.in);

            choix = Sc.nextInt();

       if (choix!=5) {
           System.out.println("entrer votre premier nombre:");
           n1 = Sc.nextInt();
           System.out.print("entrer votre deuxieme nombre:");
           n2 = Sc.nextInt();
       }
        switch (choix) {

            case 1:
                resultat = n1 + n2;
                System.out.println("le resultat est:" + resultat);
                break;
            case 2:
                resultat = n1 - n2;
                System.out.print("le resultat est:" + resultat);
                break;
            case 3:
                resultat=n1 * n2;
                System.out.println("le resultat est:"+resultat);
            case 4:
                resultat=n1 /n2 ;
                System.out.println("le resultat est:"+resultat);

            case 5:
                resultat = Math.pow(n1, n2);
                System.out.println("Le résultat de " + n1 + " élevé à la puissance " + n2 + " est : " + resultat);
                break;
            case 6:
                    System.out.println("au revoir!");
                    break;
            default:
                System.out.println("choix invalid");
        }
    }
}
