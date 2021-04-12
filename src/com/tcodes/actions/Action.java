package com.tcodes.actions;

import com.tcodes.user.Details;

/* Actions to be performed for the user */

public interface Action extends FinalAction{
    Action nextAction();
}
