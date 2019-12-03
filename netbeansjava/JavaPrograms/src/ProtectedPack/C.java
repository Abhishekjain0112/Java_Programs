/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectedPack;

/**
 *
 * @author Abhishek
 */
public class C {
    
    private String name_private;
    protected String name_Protected;
    String name_default;

    public String getName_private() {
        return name_private;
    }

    public void setName_private(String name_private) {
        this.name_private = name_private;
    }

    protected String getName_Protected() {
        return name_Protected;
    }

    protected void setName_Protected(String name_Protected) {
        this.name_Protected = name_Protected;
    }

    public String getName_default() {
        return name_default;
    }

    public void setName_default(String name_default) {
        this.name_default = name_default;
    }
    
    
}
