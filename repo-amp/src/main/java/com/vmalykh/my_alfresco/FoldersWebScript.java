package com.vmalykh.my_alfresco;

import org.alfresco.repo.model.Repository;
import org.alfresco.service.cmr.repository.NodeRef;
import org.springframework.extensions.webscripts.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vadim on 05.09.15.
 */
public class FoldersWebScript extends DeclarativeWebScript{

    private Folders folders;
    public void setFolders(Folders folders)
    {
        this.folders = folders;
        System.out.println("Folders injected!");
    }

    protected Map<String, Object> executeImpl(
            WebScriptRequest req, Status status, Cache cache) {

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("folders", folders.getFolders());

        return model;
    }
}
