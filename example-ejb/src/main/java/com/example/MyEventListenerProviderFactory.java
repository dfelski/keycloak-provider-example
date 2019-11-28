package com.example;

import org.keycloak.Config;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class MyEventListenerProviderFactory implements EventListenerProviderFactory {

    @Override
    public EventListenerProvider create(KeycloakSession keycloakSession) {
        return new MyEventListenerProvider();
    }

    @Override
    public void init(Config.Scope scope) {
        // nothing to do
    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
        // nothing to do
    }

    @Override
    public void close() {
        // nothing to do
    }

    @Override
    public java.lang.String getId() {
        return "event-listener-example";
    }
}
