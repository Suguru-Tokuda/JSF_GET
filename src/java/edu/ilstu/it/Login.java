/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ilstu.it;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author admin
 * ref: http://stackoverflow.com/questions/10876430/how-to-get-request-parameter-form-jsp-page-in-facelets-page
 */
@ManagedBean
@RequestScoped
public class Login {

    /**
     * Creates a new instance of Login
     */
    public Login() {
    }
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void init() {
        // Do here your thing with those parameters.
        System.out.println(username + ", " + password);
    }
}
