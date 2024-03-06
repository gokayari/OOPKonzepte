public class Mensch {

    private int größe = 185;

    public int alter = 33;      //public

    private int gewicht = 76;

    private String augenfarbe = "blau";

    public void aufDerKonsoleAusgeben(String Nationalität){
        System.out.println("Dieser Mensch, der " + Nationalität+ " ist, ist " + größe + " groß, "
                + alter + " Jahre alt und hat eine " + augenfarbe + "e Augenfarbe.");
    }

}
