package com.tcodes.signer;

import com.tcodes.prompts.Prompt;
import com.tcodes.user.Details;
import com.tcodes.user.Password;
import com.tcodes.user.Username;

import java.util.Scanner;

public class Signer {
    private Prompt prompt;
    private Details deets;

    Signer(Prompt p)
    {
        this.prompt = p;
        deets = new Details();
    }
    public Details run()
    {
        Scanner s = new Scanner(System.in);
        Username uname;
        Password password;

       // get details from user
        uname = getUsername(s);
        password = deets.getPassword(s);

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
        prompt.passwordPrompt();
        return new Password(s.next());
    }
}
