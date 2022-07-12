package BOJ.solution.kh;

public class Day1 {
    public static void main(String[] args) {
        사람 김경하 = new 사람(1,"김경하", 27);
        사람 염호준 = new 사람(2,"염호준", 27);
        사람 염호준2 = new 사람(2, "염호준", 27);
        사람 염호준3 = 염호준;

        if(염호준==염호준2){
            System.out.println("같다");
        } else{
            System.out.println("다르다");
        }

        사람.addAge(염호준);
    }
}