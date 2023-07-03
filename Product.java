public abstract class Product {
    String merk;
    String type;
    String beschrijving;

    Product(String merk, String type, String beschrijving) {
        this.merk = merk;
        this.type = type;
        this.beschrijving = beschrijving;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public abstract void displayDetails();
}
