package com.appnet.appnet.model;

import java.util.Collection;

public class AppManifest {
    String appId;

    String domain;
    String name;
    String version;

    String documentationLink;
    String description;

    String iconUrl;

    Collection<Permission> usedPermissions;
    Collection<Permission> permissionDefinitions;
    Collection<Permission> permissions;

    Collection<Activity> activities;
    Collection<Service> services;
    Collection<BroadcastReciever> recievers;
}
