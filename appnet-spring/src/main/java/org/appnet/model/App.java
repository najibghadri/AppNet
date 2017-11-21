package org.appnet.model;

import java.util.Collection;

public class App {

    String appId;

    String domain;
    String documentationLink;
    String description;

    String iconUrl;
    String name;

    Collection<Scope> usedScopes;
    Collection<Scope> scopeDefinitions;

    Collection<AppActivity> activities;
    Collection<AppService> services;
    Collection<AppReciever> recievers;
    Collection<AppWebService> webServices;
}
