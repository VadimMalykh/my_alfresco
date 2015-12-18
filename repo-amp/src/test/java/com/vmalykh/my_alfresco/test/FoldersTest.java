package com.vmalykh.my_alfresco.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.vmalykh.my_alfresco.Folders;
import org.alfresco.repo.model.Repository;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Ignore
public class FoldersTest {

    @Autowired
    @Qualifier("RepositoryHelper")
    private Repository repository;

    @Autowired
    private Folders folders;

    @Test
    public void testWiring() {
        assertNotNull(folders);
    }
}
