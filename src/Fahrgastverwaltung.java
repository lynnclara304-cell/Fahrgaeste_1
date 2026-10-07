

public class Fahrgastverwaltung {
    public static void main(String[] args){
      Fahrgast alan = new Fahrgast("Alan Turing", 21);
      Fahrgast grace = new Fahrgast("Grace Murray Hopper", 27);

      alan.loeseTicket(3.0,3);
      alan.loeseTicket(3.0,3);
      grace.loeseTicket(3.0,3);

      System.out.println("Systemstatus");
      System.out.println("===");
      System.out.println("===");
      System.out.println("Fahrgäste im System: " + Fahrgast.gibAnzahlFahrgaeste());
      System.out.println("Verkaufte Tickets: " + Ticket.gibVerkaufteTicket());
    }
}
