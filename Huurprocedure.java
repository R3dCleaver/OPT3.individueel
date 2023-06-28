public interface Huurprocedure {
    double euro = 0;
    int dag = 0;
    public void berekenHuurprijsZonderVerzekering(int dag);
    public void berekenVerzekering(int dag);
    public void berekenHuurprijsMetVerzekering(int dag);
    public String showBeschrijving();
}
