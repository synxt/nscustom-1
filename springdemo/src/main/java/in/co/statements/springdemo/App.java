package in.co.statements.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		/*Employee emp = context.getBean(Employee.class);
		System.out.println(emp);*/
	}
}
