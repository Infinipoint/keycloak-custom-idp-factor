package io.infinipoint.authenticator;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.authenticators.browser.IdentityProviderAuthenticator;
import org.keycloak.protocol.oidc.OIDCLoginProtocol;

public class CustomIdpFactorAuthenticator extends IdentityProviderAuthenticator {
    @Override
    public void authenticate(AuthenticationFlowContext context) {
        context.getAuthenticationSession().setClientNote(OIDCLoginProtocol.LOGIN_HINT_PARAM, context.getUser().getUsername());
        super.authenticate(context);
    }

    @Override
    public boolean requiresUser() {
        return true;
    }
}
