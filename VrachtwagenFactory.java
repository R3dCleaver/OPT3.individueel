class VrachtwagenFactory extends CreateProductFactory {

    public Vrachtwagen createVrachtwagen(String merk, String type, String beschrijving, double laadvermogen, double motorinhoud) {
        return super.createVrachtwagen(merk, type, beschrijving, laadvermogen, motorinhoud);
    }
}
