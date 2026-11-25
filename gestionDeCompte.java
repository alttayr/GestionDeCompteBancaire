import java.util.*;

public class gestionDeCompte 
{
      // correction; j'avais mis la variable taux est en float  et valeurCrédité (val_courante) en long (pas logique vue qu'on peut crédité un evaleur a virgule)


    public static void main(String[] argument)
    {
        byte choix;
        int valeur, date ; // variable valeur et date pas dans la correction pour l'instant mais je pense que valeur sera en double
          // correction: j'avait pas initialisé ces 2 et a la place de numeroLu: verifierCompteExistant = 0; et numeroDeCompte a la place de numéroCpte

        char theme, moyenDePaiement; // correction : char typeDeCompte = '\0' , les variable theme et moyenDePaiement
        Compte C = new Compte();
        Scanner lectureClavier = new Scanner(System.in);
       do
        {
            choix = menuPrincipal();
        switch(choix)
        {
            case 1 :

                C.créerCpte();
                break;
            case 2 :
                //demande à l'tilisateur de saisir le numéro du compte à afficher
                System.out.print(" Quel compte souhaitez vous afficher ? : "); //j'avais mis dans la fonction afficherCpte
                C.numéroLu = lectureClavier.next(); //j'avais mis dans la fonction afficherCpte
                if (C.numéroCpte.equals(C.numéroLu)) C.afficherCpte(); //j'avais mis la condition dans la fonction'
                else IO.print("Le systeme ne connait pas ce compte " + C.numéroLu);


                break;
                //System.out.println("2");
                //System.out.println("Saisir le numero de compte : ");
                //verifierCompteExistant = lectureClavier.nextLong();
                //if (verifierCompteExistant == numeroDeCompte)
                //{
                    //System.out.println("Numero de compte: " + numeroDeCompte);
                    //System.out.println("Type de compte: " + typeDeCompte);
                    //System.out.println("Valeur initiale: " + valeurCredite);
                    //if (typeDeCompte == 'e') System.out.println("Taux: " + taux);
                //}
                //else System.out.print("ce compte n'existe pas");
                //break;

            case 3 :
                System.out.println("3");
                System.out.println("option non programmee");
                break;

            case 4 :
                sortir();

                break;

            case 5 :
                alAide();

                break;

            default : System.out.println("option non valide");
        }
    } while (choix != 4) ;

        
        



    }
    public static byte menuPrincipal()
    {
        byte choixMenu;

        Scanner lectureClavier = new Scanner(System.in);

            System.out.println("1. Creer un compte");
            System.out.println("2. Afficher un compte");
            System.out.println("3. Ecrire une ligne comptable");
            System.out.println("4. Sortir");
            System.out.println("5. De l'aide");
            System.out.println(); // ligne ajouté a la correction
            System.out.print("Votre choix : ");

            choixMenu = lectureClavier.nextByte();
        return choixMenu;


    }
    public static void sortir()
    {
        System.out.println("4");
        //option 4,  le programme termine son exécution
        System.out.println("Au revoir et a bientot"); // ajouté a la correction
        System.exit(0);
    }
    public static void alAide()
    {
        // le programme affiche une ligne d'explication pour chaque option
        // du menu principal.
        System.out.println("Option 1. Pour créer un compte Courant entrer C ");
        System.out.println("          Pour créer un compte Joint entrer J ");
        System.out.println("          Pour créer un compte Epargne entrer E");
        System.out.print("          Puis, entrer le numéro du compte, et");
        System.out.println(" sa première valeur creditee ");
        System.out.println("          Dans le cas d'un compte epargne, entrer le taux ");
        System.out.println("Option 2. Le systeme affiche les données du compte choisi ");
        System.out.println("Option 3. Ecrire une ligne comptable");
        System.out.println("Option 4. Pour quitter le programme");
        System.out.println("Option 5. Pour afficher de l'aide");


        System.out.println("5"); // c'est ce que j'ai mis, au dessus je l'ai rajouté a la correction

    }

}