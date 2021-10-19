import GOF.Singletone.StaticBlock;

public class Main {
    public static void main(String[] args) {

        StaticBlock st = StaticBlock.getInstance();
        StaticBlock st1 = StaticBlock.getInstance();

        System.out.println(st==st1);

    }
}
