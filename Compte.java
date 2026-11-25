import java.util.Scanner;
public class Compte {
    String numéroCpte = "", numéroLu = "";
    String typeCpte = "";
    double taux = 0, val_courante = 0;

    public void créerCpte(){
        Scanner lectureClavier = new Scanner(System.in);
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

    }


    public void afficherCpte()
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
