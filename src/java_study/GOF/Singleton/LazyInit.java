package java_study.GOF.Singleton;
// static 방법을 개선해서 클래스 로딩 시점이 아닌 인스턴스 요청할 때 생성되는 형태
// 단점 : 멀티 쓰레드 환경에서 취약
// 특적 쓰레드가 동시에 getInstance() 메서드를 호출하게 되면 인스탄스가 두 번 생성되는 문제가 발생
public class LazyInit {
    public LazyInit() {}

    private static LazyInit instance;

    public static LazyInit getInstance() {
        if(instance == null) {
            instance = new LazyInit();
        }
        return instance;
    }
}
