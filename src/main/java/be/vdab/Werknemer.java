package be.vdab;

public abstract class Werknemer {

    // Atributen
    static final double UURLOON = 12.5;
    private String naam;
    private Long rijksregisternummer;

    // Constructor met 2 waarden
    public Werknemer(String naam, Long rijksregisternummer) {
        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;
    }

    // Get Loon method
    public abstract double getLoon();

    @Override
    public String toString() {
        return "Werknemer{" +
                "naam='" + naam + '\'' +
                ", rijksregisternummer=" + rijksregisternummer +
                '}';
    }
}
