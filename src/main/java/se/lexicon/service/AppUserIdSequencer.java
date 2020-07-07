package se.lexicon.service;

public interface AppUserIdSequencer {
    int nextId();
    void clear();
}
