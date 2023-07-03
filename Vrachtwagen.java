class Vrachtwagen extends Product implements Huurprocedure {
    double laadvermogen;
    double motorinhoud;

    public Vrachtwagen(String merk, String type, String beschrijving, double laadvermogen, double motorinhoud) {
        super(merk, type, beschrijving);
        this.laadvermogen = laadvermogen;
        this.motorinhoud = motorinhoud;
    }

    @Override
    public void berekenHuurprijsZonderVerzekering(int dag) {
        double euro = 0.10 * laadvermogen;
    }

    @Override
    public void berekenVerzekering(int dag) {
        double euro = 0.01 * motorinhoud * dag;
    }

    @Override
    public void berekenHuurprijsMetVerzekering(int dag) {
        double euro = (0.10 * laadvermogen) + (0.01 * motorinhoud * dag);
    }

    @Override
    public String showBeschrijving() {
        return null;
    }

    @Override
    public void displayDetails() {
        System.out.println("Merk: " + getMerk());
        System.out.println("Type: " + getType());
        System.out.println("Beschrijving: " + getBeschrijving());
        System.out.println("Laadvermogen: " + laadvermogen + "kg");
        System.out.println("Motorinhoud: " + motorinhoud + "cc");
        System.out.println("---------------------------");
    }
}
