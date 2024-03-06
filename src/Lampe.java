public class Lampe {

    public boolean zustand = false;

    private String standort;

    //constructor:
    public Lampe(String standortZimmers) {
        standort = standortZimmers;
        System.out.println("Standort unseres Zimmers: " + standort);
    }

    public void zustandDerLampe(){
        if(zustand){
            System.out.println("im/in der " + standort + ": die Lampe ist an!");
        }else{
            System.out.println("im/in der " + standort + ": die Lampe ist aus!");
        }
    }
}
