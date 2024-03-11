public class Hund extends Tier{

    public Hund(String name, String rasse, int alter){
        super(name, rasse, alter);
    }



    //inheritance
    @Override
    void lärmMachen() {
        System.out.println("Der Hund bellt!");
    }


    @Override
    public void schlafen(){
        super.schlafen();
        System.out.println("Der Hund schnarcht im Schlaf...zZ");    //Overriding
    }

}
