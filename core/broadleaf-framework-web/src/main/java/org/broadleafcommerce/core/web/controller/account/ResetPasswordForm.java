package org.broadleafcommerce.core.web.controller.account;

import java.io.Serializable;

/**
 * Created by bpolster.
 */
public class ResetPasswordForm implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String username;
    private String token;
    private String password;
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}