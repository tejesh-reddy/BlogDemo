package com.tcodes.prompts;

public class DetailsPrompt implements Prompt {
    @Override
    public void showPrompt() {
        System.out.println("The Action options are:");
    }

    @Override
    public void secondaryPrompt() {
        System.out.println("Select Action:");
    }
}
