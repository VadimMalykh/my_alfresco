package orgunit;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Vadim on 10/15/2015.
 */
public class OrganizationTest {

    @Test
    public void CanInstantiateOrganization()
    {
        Organization org = new Organization();
    }

    @Test
    public void HasName()
    {
        Organization org = new Organization();
        org.setName("Org1");
        assertEquals(org.getName(), "Org1");
    }
}
