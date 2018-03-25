package singleton;

public class SingTon {
    private static SingTon sington = new SingTon();
    private SingTon(){};

    public static SingTon getInstance(){
        return sington;
    }
    public void doWork(){
        System.out.println("Time to get work done");
    }


}
