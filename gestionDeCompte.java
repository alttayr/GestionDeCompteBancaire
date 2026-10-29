import java.util.*;

public class gestionDeCompte {
    public static void main(String[] argument) {
        
        byte choixMenu;
        int valeur, date ; // variable valeur et date pas dans la correction pour l'instant mais je pense que valeur sera en double
        long numeroDeCompte = 0,verifierCompteExistant = 0; // correction: j'avait pas initialisé ces 2
        
        char typeDeCompte = '\0', theme, moyenDePaiement; // correction : char typeDeCompte = '\0' , les variable theme et moyenDePaiement
        
        double taux = 0, valeurCredite = 0; // correction; j'avais mis la variable taux est en float  et valeurCrédité en long (pas logique vue qu'on peut crédité un evaleur a virgule)
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("1. Creer un compte");
        System.out.println("2. Afficher un compte");
        System.out.println("3. Ecrire une ligne comptable");
        System.out.println("4. Sortir");
        System.out.println("5. De l'aide");
        System.out.println(); // ligne ajouté a la correction
        System.out.print("Votre choix : ");
// commentaire bidon pour le tezt
        choixMenu = lectureClavier.nextByte();

        switch(choixMenu){

        case 1 :
        //System.out.print("Type du compte [Types possibles : "); 
        //System.out.print("C(ourant), J(oint), E(pargne)] :")
        //System.out.print("Numero du compte :");
        //numéroCpte = lectureClavier.nextLong();
        //System.out.print("Premiere valeur creditee :");
        //val_courante = lectureClavier.nextDouble();  
        //if ( typeCpte == 'E')   {
            //System.out.print("Taux de placement :     ");
            //taux = lectureClavier.nextDouble();
        //} 
        //break;
        
        System.out.println("1");
        System.out.println("Type de compte: (c)courant, (j)joint, (e)epargne");
        
        typeDeCompte = lectureClavier.next().charAt(0);
        
        if (typeDeCompte == 'e'){
            System.out.print("taux de placement: ");
            taux  = lectureClavier.nextDouble();
        }
        
        System.out.println("Numero de compte:");
        numeroDeCompte = lectureClavier.nextLong();
        System.out.println("Première valeur créditée");
        valeurCredite = lectureClavier.nextDouble();
        
        break;

        case 2 :

         //demande à l'utilisateur de saisir le numéro du compte à afficher
        //System.out.print ( " Quel compte souhaitez vous afficher ? : ");
        //numéroLu = lectureClavier.nextLong();
        // vérifie que le numéro du compte existe, 
        //if ( numéroLu == numéroCpte) {  
                           //Si oui, affiche le numéro du compte, le type, la valeur initiale
                //System.out.print("Le compte n° : " + numéroCpte + " est un compte ");
                    //if (typeCpte == 'C') System.out.println(" courant  ");
                    //else if (typeCpte == 'J') System.out.println(" joint  ");
                    //else if (typeCpte == 'E') {
                                             // affiche son taux dans le cas d'un compte épargne.
                                     //System.out.println("epargne  dont le taux est  " + taux);
                            //}
                //System.out.println(" Premiere valeur créditée : " + val_courante);
        //}
        //else  {
                              // Sinon, affiche un message indiquant que numéro du compte non valide.
             //System.out.println("Le systeme ne connait pas le compte " + numéroLu);
        //} 
        //break;



        System.out.println("2");
        System.out.println("Saisir le numero de compte : ");
        verifierCompteExistant = lectureClavier.nextLong();
        if (verifierCompteExistant == numeroDeCompte)
            {
                System.out.println("Numero de compte: " + numeroDeCompte);
                System.out.println("Type de compte: " + typeDeCompte);
                System.out.println("Valeur initiale: " + valeurCredite);
                if (typeDeCompte == 'e') System.out.println("Taux: " + taux);
            }
        else System.out.print("ce compte n'existe pas");
        break;

        case 3 :
        System.out.println("3");
        System.out.println("option non programmee");
        break;
        
        case 4 :
        System.out.println("4");
                        //option 4,  le programme termine son exécution
        //System.out.println("Au revoir et a bientot");
        System.exit(0);
        break;

        case 5 :
        // le programme affiche une ligne d'explication pour chaque option
        // du menu principal.
        //System.out.println("Option 1. Pour créer un compte Courant entrer C ");
        //System.out.println("          Pour créer un compte Joint entrer J ");
        //System.out.println("          Pour créer un compte Epargne entrer E");
        //System.out.print("          Puis, entrer le numéro du compte, et"); 
        //System.out.println(" sa première valeur creditee ");
        //System.out.println("          Dans le cas d'un compte epargne, entrer le taux ");
        //System.out.println("Option 2. Le systeme affiche les données du compte choisi ");
        //System.out.println("Option 3. Ecrire une ligne comptable");
        //System.out.println("Option 4. Pour quitter le programme");
        //System.out.println("Option 5. Pour afficher de l'aide");

        
        System.out.println("5");   
        break;

        default : System.out.println("option non valide");

        }




    }
}
