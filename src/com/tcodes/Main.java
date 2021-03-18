package com.tcodes;

import com.tcodes.actions.Action;
import com.tcodes.prompts.LoginPrompt;
import com.tcodes.signer.Signer;
import com.tcodes.user.Details;

public class Main {

    public static void main(String[] args) {
        Details d = Signer.run(new LoginPrompt());
        Action a = d.getActionToDo();
        d.doAction(a);
     }
}
