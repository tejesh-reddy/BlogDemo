package com.tcodes.user;

import com.tcodes.actions.Action;
import com.tcodes.actions.CreateBlogAction;
import com.tcodes.actions.ReadNextBlog;
import com.tcodes.interactor.SimpleInteractor;
import com.tcodes.prompts.DetailsPrompt;
import com.tcodes.prompts.Prompt;

import java.util.ArrayList;
import java.util.Scanner;

// Details for storing user info
public class Details {
    private Username username;
    private Password password;
    private ActionInteractor actionInterface;


    public void setUser(Username username) {
        this.username = username;
        actionInterface = new ActionInteractor(new DetailsPrompt());
    }

    public Username getUser(){
        return this.username;
    }

    public void setPassword(Password password){
        this.password = password;
    }

    public Password getPassword(){
        return this.password;
    }

    public Action getActionToDo() throws Exception {
        return actionInterface.getAction();
    }

    public void doAction(Action a) {
        a.doit(this);
    }
}


//Action support
class ActionSupport
{
    private static Action action;
    private enum ActionOpt {CREATE, READ};


    public static void setAction(ActionOpt opt)
    {
        switch (opt){
            case CREATE:
                action = new CreateBlogAction();
                break;
            case READ:
                action = new ReadNextBlog();
                break;
        }
    }

    public static Action getAction()
    {
        return action;
    }

    public static void showOptions()
    {
        int i = 0;
        for(ActionOpt op : ActionOpt.values()){
            i++;
            System.out.println(i+": "+op);
        }
    }

    public static ActionOpt selectedOpt(int selection) throws Exception{
        int i = 1;
        for(ActionOpt op: ActionOpt.values()){
            if(i == selection)
                return op;
            i++;
        }

        throw new Exception("Invalid Option for Action -- ActionOpt (Details)");
    }
}

// Interacting with user for details
class ActionInteractor extends SimpleInteractor {

    public ActionInteractor(Prompt prompt) {
        super(prompt);
    }

    @Override
    public void showPrompt() {
        prompt.showPrompt();
        ActionSupport.showOptions();
    }

    public Action getAction() throws Exception{
        Scanner s = new Scanner(System.in);
        showPrompt();
        prompt.secondaryPrompt();
        ActionSupport.setAction(ActionSupport.selectedOpt(s.nextInt()));
        return ActionSupport.getAction();
    }
}