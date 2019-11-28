package com.example;

import com.google.common.base.Joiner;
import org.keycloak.events.admin.AdminEvent;
import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;

public class MyEventListenerProvider implements EventListenerProvider {

    public MyEventListenerProvider() {}

    @Override
    public void onEvent(Event event) {
        Joiner joiner = Joiner.on(" ").skipNulls();
        System.out.println(joiner.join("eventType= ", event.getType(),"userId= ", event.getUserId(), "Username= ", event.getDetails().get("username")));
    }

    @Override
    public void onEvent(AdminEvent event, boolean includeRepresentation) {
        // nothing to do
    }

    @Override
    public void close() {
        // nothing to do
    }

}