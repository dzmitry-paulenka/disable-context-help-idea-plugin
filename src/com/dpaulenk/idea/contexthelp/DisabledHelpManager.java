package com.dpaulenk.idea.contexthelp;

import com.intellij.help.impl.HelpManagerImpl;
import org.jetbrains.annotations.Nullable;

public class DisabledHelpManager extends HelpManagerImpl {

    @Override
    public void invokeHelp(@Nullable String id) {
        //do nothing
    }
}
