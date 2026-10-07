# Fahrgäste (ÖPNV-Simulation)

Dieses Projekt ist eine objektorientierte Java-Implementierung einer einfachen Fahrgast- und Ticketverwaltung im öffentlichen Personennahverkehr (ÖPNV). Es wurde im Rahmen des Moduls *Java – Eine pragmatische Einführung* (Sommersemester 2026) an der Bergischen Universität Wuppertal erstellt.

## 📌 Aufgabenstellung & Zielsetzung
Ziel der Aufgabe ist die Modellierung und Interaktion mehrerer Klassen in Java, die Nutzung von Objekt-Arrays sowie die Verwaltung gemeinsamer Klassenattribute (`static`).

### Kernfunktionalitäten:
- **`Ticket`**: Modellierung eines Fahrscheins mit Attributen für Preis, Gültigkeitsdauer und Entwertungsstatus (`boolean`). Beinhaltet ein statisches Klassenattribut `verkaufteTickets` zur globalen Erfassung der verkauften Tickets.
- **`Fahrgast`**: Modellierung eines Fahrgasts mit persönlichen Daten (Name, Alter) und einem Array zur Speicherung von bis zu 10 gelösten `Ticket`-Objekten. Implementierung von Methoden zum Kaufen (`loeseTicket`) und Entwerten (`entwerteTicket`) von Fahrkarten sowie ein statisches Klassenattribut `anzahlFahrgaeste`.
- **`Fahrgastverwaltung`**: Hauptklasse mit der `main`-Methode als Einstiegspunkt. Erzeugt Objekte der Klassen `Fahrgast` und `Ticket`, simuliert den Fahrkartenkauf und gibt den aktuellen Systemstatus auf der Konsole aus.

---

## 🛠 Struktur des Projekts

```text
src/
├── Ticket.java             # Modellklasse für einzelne Tickets
├── Fahrgast.java           # Modellklasse für Fahrgäste (mit Ticket-Array)
└── Fahrgastverwaltung.java  # Hauptklasse / Exekutive (main-Methode)