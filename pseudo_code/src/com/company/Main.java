package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InteractionAvecLutilisateur();
    }
    public static void InteractionAvecLutilisateur() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int age = scanner.nextInt();
        System.out.println("vous avez ecris " + age);

    }
    public static void DiametreDunCercle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le rayon d'un cercle");
        float rayon = scanner.nextFloat();
        float diametre = rayon * 2;
        System.out.printf("le diamétre du cercle est égale a " + diametre);

    }
    public static void CalculDePerimetre() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le rayon d'un cercle");
        float rayon = scanner.nextFloat();
        float perimetre = 2*3.14f*rayon;
        System.out.printf("Le perimétre du cercle est égal a " + perimetre);

    }
    public static void CalculDeLaTva (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre prix hors taxe");
        float prixht = scanner.nextFloat();
        System.out.println("votre pourcentage de tva");
        float pourcentagetva = scanner.nextFloat();
        float tva = prixht/100*pourcentagetva;
        float ttc = tva + prixht;
        System.out.println("Votre TVA est de "+ tva);
        System.out.println("Votre prix total TTC est de "+ ttc);

    }
    public static void CalculDeLimcDunePersonne (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre poids");
        float poids = scanner.nextFloat();
        System.out.println("Entrez votre taille sous le format 0,00");
        float taille = scanner.nextFloat();
        float IMC = poids/(taille*taille);
        System.out.println("votre IMC est de "+ IMC);

    }
    public static void CalculDeLaRentabiliteDunJetSki (){

        System.out.println("Pour la location d'un jet ski essence celui la te reviendra a 125€/jour de location plus 1.65 euros par litre d'essence soit");
        float prixE = 125+(1.65f*16);
        System.out.println(prixE + " euros pour la location d'un jet ski et 16l d'essence pour 100 km");
        System.out.println("Pour la location d'un jet ski electrique celui la te reviendra a 165€/jour de location plus 0.75 euros par Kwh d'electricité soit");
        float prixe = 165+(0.75f*14);
        System.out.println(prixe + "euros pour la location d'un jet ski et 14Kwh d'electricité pour 100 km\"");
        float result;
        if (prixE<prixe){
            result = prixE;
        }
        else {
            result = prixe;
        }
        System.out.print("le plus rentable est "+ result);
    }
    public static void CalculerLaRemiseDeVetementsSoldes (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrire V ou R");
        String reponse = scanner.nextLine();
        System.out.println("Ecrire le Prix");
        float prix = scanner.nextFloat();

        if (reponse.equals("V") == true){
            if (prix >= 100 && prix < 150) {
                System.out.println(prix * 0.75);
            }
            else if (prix >= 150 && prix < 500){
                System.out.println(prix*0.65);
                }
            else if (prix >=500) {
                System.out.println(prix);
            }
            else if (prix < 100 && prix > 500){
                System.out.println(prix);
            }

        }
        else if (reponse.equals("R") == true){
            System.out.println("Ecrire le nombre d'articles");
            int nmbArticle = scanner.nextInt();
            if (prix >= 100 && prix <= 150 && nmbArticle > 5){
                System.out.println(prix*0.85);
            }
            else if (prix >= 150 && prix <= 500 && nmbArticle >2){
                System.out.println(prix*0.90);
            }
            else if (prix >= 500 && nmbArticle >=1){
                System.out.println(prix);
            }
        }
    }
    public static void CalculerLaMoyenneDunModulePourUnEtudiantDeLaCodingFactoryEnFonctionDeCesNotesDeJavaEtDePoo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre note en JAVA");
        float Java = scanner.nextFloat();
        System.out.println("Entrez votre note en POO");
        float POO = scanner.nextFloat();
        float moyenne = (Java+POO)/2;
        System.out.println("Votre moyenne est de "+ moyenne);
        if (moyenne < 10){
            System.out.println("recalé");
        }
        else if (moyenne >=10 & moyenne<12){
            System.out.println("passable");
        }
        else if (moyenne >= 12 & moyenne<14){
            System.out.println("assez bien");
        }
        else if (moyenne >=14 & moyenne<16){
            System.out.println("bien");
        }
        else if (moyenne >=16 & moyenne <= 20){
            System.out.println("trés bien");
        }
    }
    public static void DelphineSouhaiteElleUnCafe(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour Delphine souhaitez vous un café?");
        System.out.println("répondre par O ou N");
        String reponse = scanner.nextLine();
        while (reponse.equals("O")!=true & reponse.equals("N")!=true){
            System.out.println("Bonjour Delphine souhaitez vous un café?");
            reponse = scanner.nextLine();
        }
        if (reponse.equals("O")== true){
            System.out.println("Café en cours de préparation");
        }
        else if (reponse.equals("N")== true){
            System.out.println("Bonne journée");
        }
    }
    public static void DelphineSouhaiteElleUnCafe2(){

        int I;
        int J;
        for (I = 0; I<=10 ;I++)
        for (J = 0; J<=10 ; J++)
        System.out.println(I+"X"+J+"="+ I*J);
    }

    public static void TriParSelection(){

        System.out.println("Voici votre liste 6,66,2,84,54");
        int [] liste ={6,66,2,84,54};

        for (int i = 0; i<liste.length;++i){
            int indice = i;

            for (int j = i+1;j<liste.length;++j){

                if (liste[j]<liste[indice]){
                    indice=j;
                }
            }
            int petit = liste[indice];
            liste[indice]=liste[i];
            liste[i]=petit;
        }
        for (int j = 0;j<liste.length;j++){
            System.out.println(liste[j]);
        }
    }

    public static void TriParInsertion(){
        System.out.println("Voici votre liste 8,4,15,-5,64");
        int [] liste ={8,4,15,-5,64};
        int j;
        int i;
        for (i = 0; i< 5;++i){
             j=i;
            while (j>= 1){
                if (liste[j]<liste[j-1]){
                    int c = liste[j];
                    liste[j]= liste[j-1];
                    liste[j-1]=c;
                }
                j=j-1;
            }
        }
        for (i = 0; i<5;++i){
            System.out.println(liste[i]);
        }

    }
    public static void TriParDichtomie(){
        System.out.println("Voici votre liste 8,4,15,-5,64,6,66,2,84,54");
        int [] liste ={-5,2,4,6,8,15,54,64,66,84};

        int i;
        for (i=0;i<10;++i){
            System.out.println(liste[i]);
        }
        System.out.println("Ecrire un nombre du tableau");
        Scanner scanner = new Scanner(System.in);
        float nombre = scanner.nextFloat();
        int a = 1;
        int b = 10;
        int c = 0;
        int milieu = ((a+b)/2)%10;
        while (milieu<=10 & milieu>1 & liste[milieu] !=nombre && c != a && c != b){
            if (nombre<liste[milieu]){
                b=milieu-1;
                c=b;
                milieu=((a+b)/2);
            }
            if (nombre>liste[milieu]){
                a=milieu+1;
                c=a;
                milieu=((a+b)/2);
            }
        }
        if (nombre==liste[milieu]) {
            System.out.println("res:" + liste[milieu]);
        }
        else System.out.println("le nombre n'est pas dedans");
    }

    public static void MonPremierAppelDeMethodeParArgument(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre prénom");
        String nom = scanner.nextLine();
        module(nom);
    }
    public static void module (String nom){

        System.out.println("Bonjour "+ nom +" bienvenue a la coding factory");
    }

    public static void MonPremierAppelDeMethodeParArgument2(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre chiffre");
        float chiffre = scanner.nextFloat();
        AfficherUneTable(chiffre);
    }
    public static void AfficherUneTable (float chiffre){

        int i;
        for (i=0;i<=10;++i)
        {
            System.out.println(chiffre * i +  "=" + calcul_puissance(chiffre*i));
        }
        calcul_puissance(chiffre);
    }
    public static float calcul_puissance(float chiffre){

        float X;
        X=chiffre * chiffre;
        return X;
    }
    public static void CalculerLeFactorielleDunNombre(){

        System.out.println("Rentre un nombre");
        Scanner scanner = new Scanner(System.in);
        float nombre = scanner.nextFloat();
        int i;
        int c = 1;
        for (i=1;i<=nombre;i++){
            c=c*i;
        }
        System.out.println(c);
    }
    public static void CalculDesBanques(){

        System.out.println("Combien de temps avez vous cotisé?");
        Scanner scanner = new Scanner(System.in);
        float temps = scanner.nextInt();
        float D = 0;
        int i;
        for (i=1;i<=temps;i++){
            D= (float) (1000*Math.pow(1.10f,temps));
        }
        System.out.println("vos cotisations sur "+ temps + " années reviennent a = "+ D);
    }
    public static void ValeursMiroirs(){

        System.out.println("Entrez A");
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float C=A;
        System.out.println("Entrez B");
        float B = scanner.nextFloat();
        float D = B;
        A=D;
        B=C;
        System.out.println("La valeur de A est "+ A + "et la valeur de B est "+B);
    }
    public static void ViveLesPuissances(){

        int n;

        for (n=10;n<=20;n++)
        {
            System.out.println(n+"^4= "+Math.pow(n,4));
        }
    }
    public static void ViveLesPuissances2(){

        for (int i = 0; i < 999; i++) {
            int compteur = 0;
            int c;
            if (i % 10 == 3) {
                String chiffre = Integer.toString(i);
                for (int j = 0; j < chiffre.length(); j++) {
                    if (j == 0)
                        c = i % 10;
                    else if (j == 1)
                        c = i % 100 / 10;
                    else
                        c = i % 1000 / 100;
                    compteur = compteur + c;
                    if (compteur >= 15) {
                        if (chiffre.length() > 1)
                        {
                            int test = i % 100 /10;
                            if (test % 2 == 0)
                                System.out.println(i);
                        }
                    }
                }
            }
        }
    }
    public static void LaPauseSyndicalDeColombe(){
        Scanner sc = new Scanner(System.in);
        int number = new Random().nextInt(99);
        for (int i = 0; i < 7; i++)
        {
            System.out.println("Entrez un nombre :");
            int n = sc.nextInt();
            if (n > number)
                System.out.println("Trop grand");
            else if (n < number)
                System.out.println("Trop petit");
            else {
                System.out.println("Bravo c'est le nombre");
                break;
            }
        }
    }
    public static void EquationDuPremierDegres(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Resolution de l'equation ax+b=0");
        System.out.println("Entrez a :");
        int a = sc.nextInt();
        System.out.println("Entrez b :");
        int b = sc.nextInt();
        if (a == 0)
        {
            if (b == 0)
                System.out.println("Tout nombre x est solution");
            else
                System.out.println("Aucun nombre x n'est solution");
        }
        else
        {
            int x = -b / a;
            System.out.printf("Solution approchée : %d", x);
        }
    }
    public static void EquationDuSecondDegres(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Résolution de l'equation :");
        System.out.println("Entrez la valeur de a :");
        int a = sc.nextInt();
        System.out.println("Entrez la valeur de b :");
        int b = sc.nextInt();
        System.out.println("Entrez la valeur de c :");
        int c = sc.nextInt();

        int delta = (b * b) - 2 * a * c;
        if (delta > 0)
        {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("Les solutions de x sont %d %d", x1, x2);
        }
        else
        {
            if (delta == 0) {
                int x = (-b) / (2 * a);
                System.out.printf("Valeur approchée de la solution : %d", x);
            }
            else
                System.out.println("Pas de solution");
        }
    }
    public static void PairOuImpair(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("pair");
        else
            System.out.println("impair");
    }
    public static void DistanceDeHamming(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le premier mot :");
        String mot1 = sc.nextLine();
        char[] first = mot1.toCharArray();
        System.out.println("Entrez le deuxieme mots :");
        String mot2 = sc.nextLine();
        char[] second = mot2.toCharArray();
        int dif = 0;
        for (int i = 0; i < mot1.length(); i++)
        {
            if (first[i] != second[i])
                dif++;
        }
        System.out.println(dif);
    }
    public static int Palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un mot :");
        String mot = sc.nextLine();
        char[] mot1 = mot.toCharArray();
        int len = mot.length() - 1;
        for (int i = 0; i < (len / 2); i++)
        {
            if (mot1[i] != mot1[len])
            {
                System.out.println("ce n'est pas un palindrome");
                return 0;
            }
            len --;
        }
        System.out.println("c'est un palindrome");
        return 0;
    }
    public static void SuiteDeFibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre de Fibanocci :");
        int n = sc.nextInt();
        int av = 1;
        int avav = 0;
        int fibo = 0;
        if (n > 1)
        {
            for (int i = 2; i <= n; i++)
            {
                fibo = av + avav;
                avav = av;
                av = fibo;
            }

        }
        else if (n == 1)
            fibo = 1;
        else
            fibo = 0;
        System.out.printf("Le nombre est %d", fibo);
    }
}
