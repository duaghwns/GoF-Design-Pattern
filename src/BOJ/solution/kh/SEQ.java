package BOJ.solution.kh;

public class SEQ {

    int id;

    public SEQ(int id) {
        this.id = id;
    }

    public static int seq(SEQ seq){
        return seq.id++;
    }
}
