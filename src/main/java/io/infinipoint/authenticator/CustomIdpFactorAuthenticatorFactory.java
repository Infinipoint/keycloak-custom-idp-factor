package io.infinipoint.authenticator;

import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.authenticators.browser.IdentityProviderAuthenticatorFactory;
import org.keycloak.models.KeycloakSession;

public class CustomIdpFactorAuthenticatorFactory extends IdentityProviderAuthenticatorFactory {
    public static final CustomIdpFactorAuthenticator SINGLETON = new CustomIdpFactorAuthenticator();
    public static final String PROVIDER_ID = "custom-idp-factor-redirector";

    @Override
    public Authenticator create(KeycloakSession session) {
        return SINGLETON;
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public String getDisplayType() {
        return "Custom Idp Factor Redirector";
    }
}
