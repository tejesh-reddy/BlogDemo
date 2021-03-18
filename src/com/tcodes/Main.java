package com.tcodes;

import com.tcodes.actions.Action;
import com.tcodes.prompts.LoginPrompt;
import com.tcodes.interactor.Signer;
import com.tcodes.user.Details;

public class Main {

    public static void main(String[] args) throws  Exception{
        Signer signer = new Signer(new LoginPrompt());
        Details d = signer.run();
        Action a = d.getActionToDo();
        d.doAction(a);
     }
}
