package be.vdab;

public abstract class Werknemer {

    private final double UURLOON;
    private String naam;
    private Long rijksregisternummer;

    public Werknemer(String naam, Long rijksregisternummer) {
        this.naam = naam;
        this.rijksregisternummer = rijksregisternummer;
    }

    public double getLoon();

    @Override
    public String toString() {
        return "Werknemer{" +
                "UURLOON=" + UURLOON +
                ", naam='" + naam + '\'' +
                ", rijksregisternummer=" + rijksregisternummer +
                '}';
    }
}
