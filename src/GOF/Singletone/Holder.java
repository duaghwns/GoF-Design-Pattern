package GOF.Singletone;

public class Holder {
    private Holder() {}

    private static Class InnerInstanceClass() {
        private static final Holder instance = new Holder();
    }

    public static Holder getInstance() {
        return InnerInstanceClass.instance;
    }

}
