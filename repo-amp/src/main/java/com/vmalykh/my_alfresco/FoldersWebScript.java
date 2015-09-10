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
    private Repository repository;
    public void setRepository(Repository repository)
    {
        this.repository = repository;
    }
    protected Map<String, Object> executeImpl(
            WebScriptRequest req, Status status, Cache cache) {
//        Folders folders = new Folders();
        Map<String, Object> model = new HashMap<String, Object>();
//        model.put("folders", folders.getFolders());
//        NodeRef rootFolder = repository.getCompanyHome();
        model.put("folder", "rootFolder");
        model.put("folders", new ArrayList<String>());

        return model;
    }
}
