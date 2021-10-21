package GOF.Singleton;

public class Holder {
    private Holder() {}

    private static class SingleTonHolder {
        private static final Holder instance = new Holder();
    }

    public static Holder getInstance(){
        return SingleTonHolder.instance;
    }
}
