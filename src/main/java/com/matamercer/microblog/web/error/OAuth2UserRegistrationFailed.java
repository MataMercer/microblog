package com.matamercer.microblog.web.error;

public class OAuth2UserRegistrationFailed extends RuntimeException{
    private static final long serialVersionUID = 5861310537366287163L;

    public OAuth2UserRegistrationFailed() {
        super();
    }

    public OAuth2UserRegistrationFailed(final String message, final Throwable cause) {
        super(message, cause);
    }

    public OAuth2UserRegistrationFailed(final String message) {
        super(message);
    }

    public OAuth2UserRegistrationFailed(final Throwable cause) {
        super(cause);
    }
}
