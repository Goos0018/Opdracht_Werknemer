package be.vdab;

public abstract class Werknemer {

    // Atributen
    static final double UURLOON = 12.5;
    public String naam;
    public Long rijksregisternummer;

    // Constructor met 2 waarden
    public Werknemer(String naam, Long rijksregisternummer) {
        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;
    }

    // Get Loon method
    public abstract double getLoon();

    @Override
    public String toString() {
        return  "Naam: " + naam + '\n' +
                "Nummer: " + rijksregisternummer + '\n' +
                "Loon: " + getLoon() + '\n';
    }
}
