import GOF.Singleton.Holder;
import GOF.Singleton.StaticBlock;

public class Main {
    public static void main(String[] args) {

        Holder st = Holder.getInstance();
        Holder st1 = Holder.getInstance();

        System.out.println(st==st1);

    }
}
