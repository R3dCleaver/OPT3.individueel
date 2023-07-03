class OverviewWindow extends Window{

    public void OverzichtWindow() {
        Voorraadstatus status = new Voorraadstatus();
        status.productenInVoorraad();
        status.showAlleProductenOpVoorraadMetBeschrijving();
    }

    @Override
    public void DetailsWindow() {
        super.DetailsWindow();
    }

    @Override
    public void update(String newState) {
        super.update(newState);
    }
}
