package be.vdab;

public class Arbeider extends Werknemer {

    static final int MAX_UREN_PER_WEEK = 38;
    private int aantalUren;

    public Arbeider(String naam, Long rijksregisternummer, int aantalUren) {
        super(naam, rijksregisternummer);
        this.aantalUren = aantalUren;
    }


    public double getLoon() {
        double weekloon;
        if (this.aantalUren <= MAX_UREN_PER_WEEK){
            weekloon = this.aantalUren * UURLOON;
        } else {
            weekloon = (MAX_UREN_PER_WEEK * UURLOON) + (((this.aantalUren - MAX_UREN_PER_WEEK) * UURLOON) * 1.5);
        }
        return weekloon;
    }

    @Override
    public String toString() {
        return "Arbeider{" +
                "aantalUren=" + aantalUren +
                '}';
    }
}
