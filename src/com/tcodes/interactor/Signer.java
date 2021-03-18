package com.tcodes.interactor;

import com.tcodes.prompts.Prompt;
import com.tcodes.user.Details;
import com.tcodes.user.Password;
import com.tcodes.user.Username;

import java.util.Scanner;

public class Signer extends SimpleInteractor{
    private final Details deets;

    public Signer(Prompt p)
    {
        super(p);
        deets = new Details();
    }
    public Details run()
    {
        Scanner s = new Scanner(System.in);
        Username uname;
        Password password;

       // get details from user
        showPrompt();
        uname = getUsername(s);
        password = getPassword(s);

        // package the details
        deets.setPassword(password);
        deets.setUser(uname);
        return deets;
    }

    private Username getUsername(Scanner s)
    {
        prompt.showPrompt();
        return new Username(s.next());
    }

    private Password getPassword(Scanner s)
    {
        prompt.secondaryPrompt();
        return new Password(s.next());
    }

    @Override
    public void showPrompt() {
        System.out.println("Hello! Welcome to SignIn prompt");
    }
}
