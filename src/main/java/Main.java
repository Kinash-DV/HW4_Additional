
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        MyClass myClass = context.getBean(MyClass.class);
        System.out.println(myClass);
    }
}
