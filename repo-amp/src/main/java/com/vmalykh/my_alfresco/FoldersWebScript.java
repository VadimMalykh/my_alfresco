package com.vmalykh.my_alfresco;

import org.springframework.extensions.webscripts.Cache;
import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vadim on 05.09.15.
 */
public class FoldersWebScript extends DeclarativeWebScript{
    protected Map<String, Object> executeImpl(
            WebScriptRequest req, Status status, Cache cache) {
        Folders folders = new Folders();
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("folders", folders.getFolders());
        return model;
    }
}
