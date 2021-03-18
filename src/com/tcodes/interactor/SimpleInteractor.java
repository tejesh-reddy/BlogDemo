package com.tcodes.interactor;

import com.tcodes.prompts.Prompt;

public abstract class SimpleInteractor {
    protected Prompt prompt;
    public SimpleInteractor(Prompt prompt)
    {
        this.prompt = prompt;
    }

    public abstract void showPrompt();
}
