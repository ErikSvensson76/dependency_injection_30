package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.data.AppUserDAO;
import se.lexicon.data.AppUserInMemoryStorage;
import se.lexicon.service.AppUserIdSequencer;
import se.lexicon.service.AppUserIdSequencerImpl;

@Configuration
public class AppConfig {

    @Bean
    public AppUserIdSequencer appUserIdSequencerImpl(){
        return new AppUserIdSequencerImpl();
    }

    @Bean
    public AppUserDAO appUserInMemoryStorage(){
        AppUserInMemoryStorage bean = new AppUserInMemoryStorage();
        bean.setSequencer(appUserIdSequencerImpl());
        return bean;
    }

}
