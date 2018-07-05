package sam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Ex01 {

	public static void main(String[] args) {
		ApplicationContext bf = new FileSystemXmlApplicationContext("C:\\spring\\springSrc39\\sch01\\java\\sam03\\bean01.xml");
		

	}

}
