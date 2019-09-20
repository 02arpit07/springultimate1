package injectObjectvalues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

public class Client {
    public  static void main(String[] args)
    {
      /* these all steps would be done by spring
       Student student=new Student();
        MathCheat cheat=new MathCheat();
        student.setMathCheat(cheat);*/
        ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
        System.out.println("beans3.xml file loaded");//this shows that object has been made
        Student student=context.getBean("stu",Student.class);//this will inject both id and object
        student.cheating();

        AnotherStudent an=context.getBean("AnotherStudent",AnotherStudent.class);
        an.startcheating();
    }
}
