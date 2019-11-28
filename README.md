# Keycloak Event Listener Example
Simple provider for Keycloak as an example how a simple custom event listener can be implemented.
To simulate a more complex implementation a dependency is included and the result is packed as an EAR.

Build the ear using `mvn package` and then deploy it from `example-ear/target/` to e.g. `/opt/jboss/keycloak/standalone/`. 
After server start/restart go to the Admin Console and navigate to Manage/Events/Config and add `event-listener-example` as Event Listener. Save it and watch your console ;) 
