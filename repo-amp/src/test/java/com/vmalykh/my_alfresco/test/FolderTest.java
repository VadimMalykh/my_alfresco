import static org.junit.Assert.assertEquals;

import com.vmalykh.my_alfresco.Folder;
import org.junit.Test;

public class FolderTest {
    @Test
    public void createFolderObject() {
        Folder folder = new Folder("test");
        assertEquals("test", folder.getName());
    }
}
