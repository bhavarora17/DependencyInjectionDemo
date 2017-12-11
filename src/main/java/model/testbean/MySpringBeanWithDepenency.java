package model.testbean;

/**
 * Created by barora on 12/10/2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import model.writer.IWriter;
import org.springframework.stereotype.Service;


@Service
public class MySpringBeanWithDepenency {
	
	private IWriter writer;
	
	@Autowired
	public void setWriter(IWriter writer){
		this.writer = writer;
	}
	
	public void run(){
		String s = "This is my test";
		writer.writer(s);
	}
}
