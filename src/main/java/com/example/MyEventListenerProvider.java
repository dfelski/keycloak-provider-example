package com.example;

import org.keycloak.events.admin.AdminEvent;
import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;

public class MyEventListenerProvider implements EventListenerProvider {

    public MyEventListenerProvider() {}

    @Override
    public void onEvent(Event event) {
        StringBuilder stringBuilder = new StringBuilder()
                .append("eventType = '").append(event.getType())
                .append("', userId= '").append(event.getUserId())
                .append("', Username=  '").append(event.getDetails().get("username")).append("'");
        System.out.println(stringBuilder.toString());
    }

    @Override
    public void onEvent(AdminEvent event, boolean includeRepresentation) {
        // nothing to do
    }

    @Override
    public void close() {
    }

}