public class Fahrgast {
    //Attribute
    private String name;
    private int AnzahlTicket ;
    private int alter;

    private Ticket[] tickets ;

    private static int anzahlFahrgaeste =0;



    //Konstuktor
    public Fahrgast(String name, int alter){
        this.name= name;
        this.AnzahlTicket = 0;
        this.alter= alter;
        tickets = new Ticket[10];

        anzahlFahrgaeste++;

    }

    //Attributwerte zurückgeben
    public String gibName(){

        return this.name;
    }
    public int gibAnzahlTicket(){

        return this.AnzahlTicket;
    }
    public int gibAlter(){

        return this.alter;
    }

    //private Ticket entwert;
    public Ticket gibTicket( int i){

        if(i>=0 && i<this.AnzahlTicket){
            return this.tickets[i];
        }
        return null;
    }



    //Ticket kaufen
    public void loeseTicket(double preis,int  gueltigkeitBis ){
        if (this.AnzahlTicket<10){
            Ticket neuesTicket = new Ticket( preis, gueltigkeitBis);
            // Neues ticket-Objekt erzeugen
            this.tickets[this.AnzahlTicket]= neuesTicket ;
            AnzahlTicket++;
        }

    }

    //entwertende Ticket-Objekt übergeben
    public void entwerteTicket(Ticket ticket){
        if(ticket!=null){
            ticket.setzeEntwertet(true);
        }
    }
    public static int gibAnzahlFahrgaeste(){
        return anzahlFahrgaeste;
    }


}
