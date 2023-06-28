class Boormachine extends Product implements Huurprocedure{

    public Boormachine(String merk, String type, String beschrijving) {
        super(merk, type, beschrijving);
    }
    @Override
    public void berekenHuurprijsZonderVerzekering(int dag) {
        double euro = 5 * dag;
    }

    @Override
    public void berekenVerzekering(int dag) {
        double euro = 1 * dag;
    }

    @Override
    public void berekenHuurprijsMetVerzekering(int dag) {
        double euro = (5 * dag) + dag;
    }

    @Override
    public String showBeschrijving() {
        return null;
    }
}
