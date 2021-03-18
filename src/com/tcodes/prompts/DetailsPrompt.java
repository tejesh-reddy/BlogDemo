package com.tcodes.prompts;

public class DetailsPrompt implements Prompt {
    @Override
    public void showPrompt() {
        System.out.println("The details are:");
    }

    @Override
    public void secondaryPrompt() {
        System.out.println("Select detail:");
    }
}
