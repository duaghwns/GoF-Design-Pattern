package GOF.Singletone;

// 가장 기본적인 형태의 싱글톤
public class StaticBlock {

    private StaticBlock() {}

    private static StaticBlock instance;

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Create instance fail. error msg = "+e.getMessage());
        }
    }


    public static StaticBlock getInstance() {
        return instance;
    }



}
