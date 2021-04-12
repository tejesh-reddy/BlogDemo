package com.tcodes.actions;

import com.tcodes.user.Details;

public class DeleteAction implements FinalAction {

    @Override
    public void doit(Details d) {
        // Delete user
        System.out.println("@" + d.getUser().getName() + " has been deleted.");
    }
}
