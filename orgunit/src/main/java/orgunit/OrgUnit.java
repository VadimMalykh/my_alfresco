package orgunit;

/**
 * Created by Vadim on 10/15/2015.
 */
public abstract class OrgUnit {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
