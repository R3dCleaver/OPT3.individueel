public interface Subject {

    public void registerObserver(Window window);

    public void removeObserver(Window window);
    public void notifyObserver(String newState);
}
