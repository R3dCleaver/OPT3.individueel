class Vrachtwagen extends Product implements Huurprocedure {
    private String merk;
    private String type;
    private String beschrijving;
    private double laadvermohen;
    private double motorinhoud;

    public Vrachtwagen(String merk, String type, String beschrijving, double laadvermohen, double motorinhoud) {
        super(merk, type, beschrijving);
        this.laadvermohen = laadvermohen;
        this.motorinhoud = motorinhoud;
    }

    @Override
    public void berekenHuurprijsZonderVerzekering(int dag) {
        double euro = 0.10 * laadvermohen;
    }

    @Override
    public void berekenVerzekering(int dag) {
        double euro = 0.01 * motorinhoud * dag;
    }

    @Override
    public void berekenHuurprijsMetVerzekering(int dag) {
        double euro = (0.10 * laadvermohen) + (0.01 * motorinhoud * dag);
    }

    @Override
    public String showBeschrijving() {
        return null;
    }
}
