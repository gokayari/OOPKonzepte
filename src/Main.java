public class Main {

    public static void main(String[] args) {
        Mensch derErsteMensch = new Mensch();
        derErsteMensch.aufDerKonsoleAusgeben("deutsch");

        derErsteMensch.alter = 85;
        derErsteMensch.aufDerKonsoleAusgeben("türkisch");




        //----------------------------------
        System.out.println("-------------");


        Lampe wohnzimmerLampe = new Lampe("Wohnzimmer");
        wohnzimmerLampe.zustandDerLampe();
        wohnzimmerLampe.zustand= true;
        wohnzimmerLampe.zustandDerLampe();

        Lampe schlafzimmerLampe = new Lampe("Schlafzimmer");
        schlafzimmerLampe.zustandDerLampe();
        schlafzimmerLampe.zustand = true;
        schlafzimmerLampe.zustandDerLampe();
        schlafzimmerLampe.zustand = false;
        schlafzimmerLampe.zustandDerLampe();


        System.out.println("============================");
        //Encapsulation:

        Hund meinErsterHund = new Hund("Buddy","Golden",5);
        System.out.println("Mein Hund heißt "+meinErsterHund.getName()+", seine Rasse ist "
                + meinErsterHund.getRasse()+" und er ist "+meinErsterHund.getAlter()+ " Jahre alt.");

        meinErsterHund.setName("Karabas");
        System.out.println("Der neue Name meines Hundes ist " + meinErsterHund.getName() );


        System.out.println("============================");
        //Abstraction & Inheritance:

        meinErsterHund.lärmMachen();        //Polymorphism
        meinErsterHund.schlafen();

        System.out.println("============================");
        //Polymorphism:

        Katze katze = new Katze("Pamuk", "Tekir", 3);
        katze.lärmMachen();     //Polymorphism
        katze.schlafen();

        katze.befehl();         //Verwendung des super-Schlüsselworts


    }



/*
-Encapsulation
-Abstraction
-Inheritance
-Polymorphism
 */
}
