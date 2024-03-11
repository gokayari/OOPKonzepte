abstract class Tier {

    protected String name;  //Wenn es privat wäre, könnten wir von der Katze-Unterklasse aus nicht darauf zugreifen.
                            //Protected wurde verwendet, um der Unterklasse Berechtigungen zu erteilen.
    private String rasse;
    private int alter;

    public Tier(String name, String rasse, int alter){
        this.name = name;
        this.rasse = rasse;
        this.alter = alter;
    }

    public String getName(){
        return this.name;
    }
    public String getRasse(){
        return this.rasse;
    }
    public int getAlter(){
        return this.alter;
    }


    public void setName(String neuerName) {
        this.name = neuerName;
    }
    /*public setName(String neuerName) {
        return this.name = neuerName;
    }
     */

    abstract void lärmMachen();

    public void schlafen(){
        System.out.println("Das Tier schläft");
    }

}
