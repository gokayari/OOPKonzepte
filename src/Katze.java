public class Katze extends Tier{

    public Katze(String name, String rasse, int alter) {
        super(name, rasse, alter);
    }

    @Override
    void lärmMachen() {
        System.out.println("Die Katze miaut");
    }

    public void befehl(){
        System.out.println(super.name + ", komm her!");
    }

}
