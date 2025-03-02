package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpring {
    public static void main(String[] args) {
        // Correct class name: ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // You can now retrieve beans from the context (example)
        // MyBean myBean = context.getBean(MyBean.class);
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("res" + metier.calcul());
    }

}
