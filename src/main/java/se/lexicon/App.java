package se.lexicon;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.lexicon.data.AppUserDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        AppUserDAO dao = context.getBean(AppUserDAO.class);

        System.out.println(dao.createNewAppUser("test@test.com", "1234", "Testy"));

        context.close();
    }
}
