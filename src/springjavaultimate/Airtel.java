package springjavaultimate;

public class Airtel implements Sim {
        //this airtel constructor will only be called if we make an aitel object or sim futher calling airtel..
    public Airtel()
    {
        System.out.println("airtel constructor called");
    }
    @Override
    public void calling() {
     System.out.println("call by airtel");
    }

    @Override
    public void data() {
        System.out.println("browse by airtel");
    }
}
