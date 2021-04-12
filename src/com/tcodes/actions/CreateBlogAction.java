package com.tcodes.actions;

import com.tcodes.user.Details;

public class CreateBlogAction implements Action{

    private Action nextAction;

    public CreateBlogAction()
    {
        this.nextAction = new ReadNextBlog();
    }

    @Override
    public void doit(Details d) {
        //TODO: code for new blog creation
        System.out.println("New Blog Created by "+d.getUser()+" successfully.");
    }

    @Override
    public Action nextAction() {
        return nextAction();
    }


}
