class Personenauto extends Product implements Huurprocedure{
    private double gewicht;
    private double motorinhoud;


    public Personenauto(String merk, String type, String beschrijving, double gewicht, double motorinhoud) {
        super(merk, type, beschrijving);
        this.gewicht = gewicht;
        this.motorinhoud = motorinhoud;
    }

    @Override
    public void berekenHuurprijsZonderVerzekering(int dag) {
        double euro = 50 * dag;
    }

    @Override
    public void berekenVerzekering(int dag) {
        double euro = (0.01 * motorinhoud) * dag;
    }

    @Override
    public void berekenHuurprijsMetVerzekering(int dag) {
        double euro = (50 * dag) + ((0.01 * motorinhoud) * dag);
    }

    @Override
    public String showBeschrijving() {
        return null;
    }
}
