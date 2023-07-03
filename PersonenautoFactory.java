class PersonenautoFactory extends CreateProductFactory {
    @Override
    public Personenauto createPersonenauto(String merk, String type, String beschrijving, double gewicht, double motorinhoud) {
        return super.createPersonenauto(merk, type, beschrijving, gewicht, motorinhoud);
    }
}
