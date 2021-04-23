package uk.gov.di.views;

import io.dropwizard.views.View;

public class ConfirmRegistration extends View {

    private String authRequest;
    private String email;

    public ConfirmRegistration(String authRequest, String email) {
        super("confirm-registration.mustache");
        this.authRequest = authRequest;
        this.email = email;
    }

    public String getAuthRequest() {
        return authRequest;
    }

    public String getEmail() {
        return email;
    }
}
