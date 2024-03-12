public class Loginseite implements Seite,Menü {

    @Override
    public void tasteDrücken() {
        System.out.println("Die Taste gedrückt.");
    }

    @Override
    public void elementFinden() {
        System.out.println("Das Element gefunden!");
    }

    @Override
    public void widget() {

    }
}
