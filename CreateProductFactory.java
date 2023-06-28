abstract class CreateProductFactory implements ProductFactory{

    @Override
    public Boormachine createBoormachine() {
        return new Boormachine("","","");
    }

    @Override
    public Personenauto createPersonenauto() {
        return new Personenauto("","","",0,0);
    }

    @Override
    public Vrachtwagen createVrachtwagen() {
        return new Vrachtwagen("","","",0,0);
    }
}
