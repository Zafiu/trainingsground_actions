package org.example;

public class VerifyServiceImpl implements VerifyService{

    private final String beginning;
    public VerifyServiceImpl(String beginning) {
        this.beginning = beginning;
    }

    @Override
    public boolean isValidBeginning(String input) {
        return input.startsWith(beginning);
    }
}
