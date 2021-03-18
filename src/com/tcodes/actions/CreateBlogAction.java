package com.tcodes.actions;

import com.tcodes.user.Details;

public class CreateBlogAction implements Action{

    @Override
    public void doit(Details d) {
        //TODO: code for new blog creation
        System.out.println("New Blog Created by "+d.getUser()+" successfully.");
    }
}
