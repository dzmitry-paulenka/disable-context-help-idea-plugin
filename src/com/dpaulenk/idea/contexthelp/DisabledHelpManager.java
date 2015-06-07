package com.dpaulenk.idea.contexthelp;

import com.intellij.help.impl.HelpManagerImpl;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.Nullable;

public class DisabledHelpManager extends HelpManagerImpl {

    private static final Logger LOG = Logger.getInstance(DisabledHelpManager.class);

    @Override
    public void invokeHelp(@Nullable String id) {
        LOG.info("Help disabled by 'Disable context help' plugin.");
    }
}
