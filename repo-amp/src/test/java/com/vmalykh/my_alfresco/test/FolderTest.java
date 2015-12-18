import static org.junit.Assert.assertEquals;

import com.vmalykh.my_alfresco.Folder;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class FolderTest {
    @Test
    public void createFolderObject() {
        Folder folder = new Folder("test");
        assertEquals("test", folder.getName());
    }
}
