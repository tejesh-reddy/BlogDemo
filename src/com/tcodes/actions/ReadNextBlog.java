package com.tcodes.actions;

import com.tcodes.user.Details;

public class ReadNextBlog implements Action{
    /* reads a new blog from the list */
    @Override
    public void doit(Details d) {
        //TODO: code for reading blog from the list
        System.out.println("New Blog Delivered to "+d.getUser()+" successfully.");
    }
}
