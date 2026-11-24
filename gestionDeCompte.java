import java.util.*;

public class gestionDeCompte 
{
      // correction; j'avais mis la variable taux est en float  et valeurCrédité (val_courante) en long (pas logique vue qu'on peut crédité un evaleur a virgule)


    public static void main(String[] argument)
    {
        byte choix;
        int valeur, date ; // variable valeur et date pas dans la correction pour l'instant mais je pense que valeur sera en double
          // correction: j'avait pas initialisé ces 2 et a la place de numeroLu: verifierCompteExistant = 0; et numeroDeCompte a la place de numéroCpte
        String numéroCpte = "", numéroLu = "";
        String typeCpte = "";
        double taux = 0, val_courante = 0;
        char theme, moyenDePaiement; // correction : char typeDeCompte = '\0' , les variable theme et moyenDePaiement

        Scanner lectureClavier = new Scanner(System.in);
       do
        {
            choix = menuPrincipal();
        switch(choix)
        {
            case 1 :

                do
                {  // exercice n'a pas demandé d'ajoute une controle de saisie boucle do ...while mais j'aurais du prendre l'initiative
                    System.out.println("1"); // cette ligne n'est pas dans la correction
                    System.out.println("Type de compte: (C)courant, (J)joint, (E)epargne");
                    typeCpte = lectureClavier.next();
                }while (!typeCpte.equals("C") && !typeCpte.equals("J") && !typeCpte.equals("E"));
                if (typeCpte.equals("E"))
                {
                    System.out.print("taux de placement: ");
                    taux  = lectureClavier.nextDouble();
                }
                switch (typeCpte) {
                    case "C" : typeCpte = "courant";
                    break;
                    case "J" : typeCpte = "joint";
                    break;
                    case "E" : typeCpte = "épargne";
                    break;
                }


                System.out.println("Numero de compte:");
                numéroCpte = lectureClavier.next();
                System.out.println("Première valeur créditée");
                val_courante = lectureClavier.nextDouble();

                // correction de tasso equivalente à part la saisie deu taux a la fin
                    //System.out.print("Type du compte [Types possibles : ");
                    //System.out.print("C(ourant), J(oint), E(pargne)] :")
                    //numéroCpte = lectureClavier.nextLong();
                    //System.out.print("Premiere valeur creditee :");
                    //val_courante = lectureClavier.nextDouble();
                    //if ( typeCpte == 'E')
                    //{
                    //System.out.print("Taux de placement :     ");
                    //taux = lectureClavier.nextDouble();
                    //}
                    //break;
                break;

            case 2 :
                //demande à l'tilisateur de saisir le numéro du compte à afficher
                System.out.print(" Quel compte souhaitez vous afficher ? : "); //j'avais mis dans la fonction afficherCpte
                numéroLu = lectureClavier.next(); //j'avais mis dans la fonction afficherCpte
                if (numéroCpte.equals(numéroLu)) afficherCpte(numéroCpte, typeCpte, taux, val_courante); //j'avais mis la condition dans la fonction'
                else IO.print("Le systeme ne connait pas ce compte " + numéroLu);


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
    public static void afficherCpte(String numéroCpte ,String typeCpte, double taux, double val_courante  )
    {
            System.out.print("Le compte n° : " + numéroCpte + " est un compte ");
            if (typeCpte.equals("courant")) System.out.println(" courant  ");
            else if (typeCpte.equals("joint")) System.out.println(" joint  ");
            else if (typeCpte.equals("épargne")) {
                //affiche son taux dans le cas d'un compte épargne.
                System.out.println("epargne  dont le taux est  " + taux);
            }
            System.out.println(" Premiere valeur créditée : " + val_courante);




        //demande à l'utilisateur de saisir le numéro du compte à afficher
        //System.out.print(" Quel compte souhaitez vous afficher ? : ");
        //numéroLu = lectureClavier.nextLong();
        //vérifie que le numéro du compte existe,
        //if (numéroLu == numéroCpte) {
        //Si oui, affiche le numéro du compte, le type, la valeur initiale
        //System.out.print("Le compte n° : " + numéroCpte + " est un compte ");
        //    if (typeCpte == 'C') System.out.println(" courant  ");
        //    else if (typeCpte == 'J') System.out.println(" joint  ");
        //    else if (typeCpte == 'E') {
        //affiche son taux dans le cas d'un compte épargne.
        //        System.out.println("epargne  dont le taux est  " + taux);
        //    }
        //    System.out.println(" Premiere valeur créditée : " + val_courante);
        //} else {//Sinon, affiche un message indiquant que numéro du compte non valide.
        //    System.out.println("Le systeme ne connait pas le compte " + numéroLu);
        //}
    }
}