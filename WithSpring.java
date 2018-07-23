import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class WithSpring
{
	public static void main(String[] args)
	{
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:/workspace/HUBS_16_2_Dev_SVN/TestSpring/src/spring.xml");

		ClassA obj = (ClassA) context.getBean("classA");
		System.out.println(obj);
	}
}
