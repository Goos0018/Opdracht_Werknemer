package be.vdab;

public class Bediende extends Werknemer {

    static final int LOONFACTOR = 192;
    private double weddeBarema;

    public Bediende(String naam, Long rijksregisternummer, double weddeBarema) {
        super(naam, rijksregisternummer);
        this.weddeBarema = weddeBarema;
    }

    public double getLoon() {
        return UURLOON * LOONFACTOR * this.weddeBarema;
    }

    @Override
    public String toString() {
        return  "Naam: " + naam + '\n' +
                "Nummer: " + rijksregisternummer + '\n' +
                "Loon: " + getLoon() + '\n';
    }

}
