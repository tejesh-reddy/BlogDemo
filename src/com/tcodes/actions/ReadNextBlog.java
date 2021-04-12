package com.tcodes.actions;

import com.tcodes.user.Details;

public class ReadNextBlog implements Action{

    private Action next;

    public ReadNextBlog()
    {
        this.next = new CreateBlogAction();
    }

    /* reads a new blog from the list */
    @Override
    public void doit(Details d) {
        //TODO: code for reading blog from the list
        System.out.println("New Blog Delivered to "+d.getUser()+" successfully.");
    }

    @Override
    public Action nextAction()
    {
        return next;
    }
}
