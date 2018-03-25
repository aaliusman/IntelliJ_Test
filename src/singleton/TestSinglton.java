package singleton;

public class TestSinglton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doWork();

        SingTon sington = SingTon.getInstance();
        sington.doWork();
    }
}
