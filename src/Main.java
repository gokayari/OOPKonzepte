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

    }



/*
-Encapsulation
-Abstraction
-Inheritance
-Polymorphism
 */
}
