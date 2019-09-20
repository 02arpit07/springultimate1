package springjavaultimate;

public class Vodaphone implements Sim {
    @Override
    public void calling() {
        System.out.println("call by voda");
    }

    @Override
    public void data() {
        System.out.println("call by voda");
    }
}
