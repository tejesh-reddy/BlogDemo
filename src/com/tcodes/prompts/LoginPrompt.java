package com.tcodes.prompts;

public class LoginPrompt implements Prompt{

    @Override
    public void showPrompt() {
        System.out.println("Enter user name: ");
    }

    public void passwordPrompt() {
        System.out.println("Enter password");
    }

}
