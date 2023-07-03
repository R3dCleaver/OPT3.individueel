public interface ProductFactory {
    public Boormachine createBoormachine(String merk, String type, String beschrijvnig);

    public Personenauto createPersonenauto(String merk, String type, String beschrijving, double gewicht, double motorinhoud);
    public Vrachtwagen createVrachtwagen(String merk, String type, String beschrijving, double laadvermogen, double motorinhoud);
}
