abstract class CreateProductFactory implements ProductFactory{

    @Override
    public Boormachine createBoormachine(String merk, String type, String beschrijving) {
        return new Boormachine(merk, type, beschrijving);
    }

    @Override
    public Personenauto createPersonenauto(String merk, String type, String beschrijving, double gewicht, double motorinhoud) {
        return new Personenauto(merk, type, beschrijving, gewicht, motorinhoud);
    }

    @Override
    public Vrachtwagen createVrachtwagen(String merk, String type, String beschrijving, double laadvermogen, double motorinhoud) {
        return new Vrachtwagen(merk, type, beschrijving, laadvermogen, motorinhoud);
    }
}
