package DependencyInjectionConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {
      /*  Student student=new Student(1,Arpit);
      student.display();
           */
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Student arpit = context.getBean("student", Student.class);
        arpit.displayStudentInfo();

    }
}
