package com.vmalykh.demoamp;

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
    public class Folder{
        public String name;
    }
    protected Map<String, Object> executeImpl(
            WebScriptRequest req, Status status, Cache cache) {
        Folder folder = new Folder();
        folder.name = "SuperPuperFolder";
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("folder", folder);
        return model;
    }
}
