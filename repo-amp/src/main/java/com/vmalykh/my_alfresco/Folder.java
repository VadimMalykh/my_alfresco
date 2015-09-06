package com.vmalykh.my_alfresco;

/**
 * Created by vadim on 06.09.15.
 */
public class Folder{
    private String name;
    public Folder(String name){this.name=name;}

    public void setName(String name){this.name=name;}
    public String getName(){return this.name;}
    public String toString(){return getName();}
}
