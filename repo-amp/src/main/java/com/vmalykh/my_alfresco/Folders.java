package com.vmalykh.my_alfresco;

import com.sun.xml.xsom.impl.scd.Iterators;
import org.alfresco.repo.model.Repository;
import org.alfresco.service.cmr.repository.NodeRef;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vadim on 06.09.15.
 */
public class Folders {

    private Repository repository;
    public void setRepository(Repository repository)
    {
        System.out.println("Repository injected: " + repository);
        this.repository = repository;
    }

    public List<Folder> getFolders()
    {
        List<Folder> folders = new ArrayList<>();

        NodeRef rootFolder = repository.getCompanyHome();


        folders.add(new Folder("SuperPuperFolder"));
        folders.add(new Folder("Another superPuperFolder"));
        folders.add(new Folder("Yet another superPuperFolder"));
        folders.add(new Folder(rootFolder.toString()));

        return folders;
    }
}
