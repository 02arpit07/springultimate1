package springjavaultimate;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {
    public static void main(String[] args) {
    /*
        //making object of class airtel
        Airtel airtel=new Airtel();
        airtel.calling();
        airtel.data();
        //making object of vodaphone class to call vodaphone methods
        Vodaphone voda=new Vodaphone();
        voda.calling();
        voda.data();
        //now the better methods than the above ones is to make an object of interface
        Sim sim=new Airtel();
        sim.calling();
        sim.data();
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");
        /* //now this show we have successfully created the spring object called bean
        Airtel air=(Airtel) context.getBean("airtel");
        air.calling();
       air.data();*/
        Sim sim=context.getBean("sim",Sim.class);
        sim.calling();
        sim.data();
        //sim object would actually call the method which would be written in bean tag(id) in config file that is xml file.


    }

}
