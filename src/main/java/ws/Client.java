package ws;

import demo.ws.soap_spring_cxf.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kang
 * @create 2017-09-06 14:03
 */
public class Client {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");

        HelloService service = context.getBean("helloService", HelloService.class);
        String result = service.say("world");
        System.out.println(result);
    }

}
