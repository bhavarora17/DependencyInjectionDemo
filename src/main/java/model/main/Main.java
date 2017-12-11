package model.main;

/**
 * Created by barora on 12/10/2017.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.testbean.MySpringBeanWithDepenency;

public class Main {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanDefinition.xml");
		BeanFactory factory = context;
		MySpringBeanWithDepenency test = (MySpringBeanWithDepenency) factory.getBean("MySpringBeanWithDepenency.class");
		test.run();
	}
}
