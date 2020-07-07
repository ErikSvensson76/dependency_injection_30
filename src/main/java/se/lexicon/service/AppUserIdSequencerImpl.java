package se.lexicon.service;

import org.springframework.stereotype.Component;

@Component
public class AppUserIdSequencerImpl implements AppUserIdSequencer{

    private int number = 0;

    @Override
    public int nextId() {
        return ++number;
    }

    @Override
    public void clear() {
        number = 0;
    }
}
