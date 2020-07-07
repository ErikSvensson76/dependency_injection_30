package se.lexicon.data;

import se.lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserInMemoryStorage implements AppUserDAO {

    private List<AppUser> users = new ArrayList<>();

    @Override
    public AppUser createNewAppUser(String email, String password, String name) {
        AppUser user = new AppUser(0, email, password, name);
        if(!users.contains(user)){
            users.add(user);
        }
        return user;
    }
}
