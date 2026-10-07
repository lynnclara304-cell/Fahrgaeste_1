public class Ticket {
    private boolean entwert;
    private int gueltigkeitBis ;
    private double preis;

    private static int verkaufteTicket=0;


    public Ticket( double preis, int gueltigkeitBis){

        this.entwert = false;
        this.preis= preis;
        this.gueltigkeitBis= gueltigkeitBis;

        verkaufteTicket++;
    }

    public boolean gibtEntwert(){

        return this.entwert;
    }
    public int gibtGueltigkeitBis(){

        return this.gueltigkeitBis;
    }
    public double gibPreis(){

        return this.preis;
    }
    public void setzeEntwertet(boolean e){

        this.entwert= e;
    }
    public void stetzeGueltigkeitBis(int g){

        this.gueltigkeitBis= g;
    }
    public void setzePreis(double p){

        this.preis= p;
    }
    public static int gibVerkaufteTicket(){

        return verkaufteTicket;
    }


}
