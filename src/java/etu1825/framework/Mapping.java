/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1825.framework;

/**
 *
 * @author nante
 */
public class Mapping {
    String className;
    String Method;

    public Mapping(String className, String method) {
        this.setClassName(className);
        this.setMethod(method);
    }

    public Mapping() {
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getMethod() {
        return Method;
    }
    public void setMethod(String method) {
        Method = method;
    }

    
}
