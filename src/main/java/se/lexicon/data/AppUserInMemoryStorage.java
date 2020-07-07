package se.lexicon.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.model.AppUser;
import se.lexicon.service.AppUserIdSequencer;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppUserInMemoryStorage implements AppUserDAO {

    private List<AppUser> users = new ArrayList<>();
    private AppUserIdSequencer sequencer;


    @Autowired
    public void setSequencer(AppUserIdSequencer sequencer) {
        this.sequencer = sequencer;
    }

    @Override
    public AppUser createNewAppUser(String email, String password, String name) {
        AppUser user = new AppUser(sequencer.nextId(), email, password, name);
        if(!users.contains(user)){
            users.add(user);
        }
        return user;
    }
}
