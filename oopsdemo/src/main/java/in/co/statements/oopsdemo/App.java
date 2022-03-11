package in.co.statements.oopsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.co.statements.oopsdemo.controller.Controller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       Controller obj = (Controller)context.getBean("accController");
       System.out.println(obj.getAccountDetails("Sushma"));
    }
}
