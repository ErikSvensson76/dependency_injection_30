package se.lexicon.data;

import se.lexicon.model.AppUser;

public interface AppUserDAO {
    AppUser createNewAppUser(String email, String password, String name);
}
