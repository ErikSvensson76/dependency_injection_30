package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.AppConfig;
import se.lexicon.data.AppUserDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AppUserDAO appUserDAO = context.getBean(AppUserDAO.class);

        System.out.println(appUserDAO.createNewAppUser("test@test.com","1234","Testy"));

        context.close();
    }
}
