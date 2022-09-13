package java_study.GOF.Singleton;

public class ThreadSafe {
    private static ThreadSafe instance;

    private ThreadSafe() {}

//     public static synchronized ThreadSafe getInstance() {
//         if (instance==null) {
//             instance = new ThreadSafe();
//         }
//         return instance;
//     }
    
    //방법 1 -> 메서드 진입시마다 synchronized 로 부하를 주지 않고 null 인 경우에만 제약을 두어 singleton을 유지시킴.
    public static ThreadSafe getInstance1() {
        if (instance==null) {
            synchronized(ThreadSafe.class) {
                if (instance==null) {
                    instance = new ThreadSafe();
                }
            }
        }
        return instance;
    }
    
    //방법 2 -> Lazy Initialization 방식. 
    //static한 클래스 LazyHolder 를 작성함으로써 synchronized 를 사용하지 않고도 Singleton이 가능하며 성능도 보장하는 방법
    private static class LazyHolder {
        private static final ThreadSafe INSTANCE = new ThreadSafe();
    }
    
    public static ThreadSafe getInstance2() {
        return LazyHolder.INSTANCE;
    }
}
