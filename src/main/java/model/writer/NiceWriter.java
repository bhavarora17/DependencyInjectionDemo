package model.writer;

import org.springframework.stereotype.Service;

/**
 * Created by barora on 12/10/2017.
 */
@Service
public class NiceWriter implements IWriter{
	
	public void writer(String s) {
		System.out.println("The string is " + s);
	}
}
