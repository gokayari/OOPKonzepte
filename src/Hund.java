public class Hund {

    private String name;
    private String rasse;
    private int alter;

    public Hund(String name, String rasse, int alter){
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

}