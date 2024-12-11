import java.util.Scanner;
public class calcul {
    public static void main(String[] args) {
        int choix,n1,n2;
        System.out.println("menu principal de calculatrice.");
        System.out.println("1-Addition (+).");
        System.out.println("2-Quitter");
        System.out.print("Veuillez entrer votre choix :");
        Scanner Sc = new Scanner(System.in);
        choix = Sc.nextInt();
        int resultat=0;
        System.out.print("entrer votre premier nombre:");
        n1 = Sc.nextInt();
        System.out.print("entrer votre deuxieme nombre:");
        n2 = Sc.nextInt();

        switch (choix){

            case 1:
                resultat = n1 + n2 ;
                break;
            case 2:
                System.out.print("au revoir");
                return;

        }
        System.out.println("le resultat est:"+resultat);
    }
}