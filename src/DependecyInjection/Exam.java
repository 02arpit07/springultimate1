package DependecyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args)
    {
      /*  Student student=new Student();
        student.setStudentName("Arpit Vashisht");
        student.displayStudentInfo();*/
        ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
        Student arpit=context.getBean("student",Student.class);
        arpit.displayStudentInfo();
        Student vash=context.getBean("id",Student.class);
        vash.displayStudentInfo();
    }
}
