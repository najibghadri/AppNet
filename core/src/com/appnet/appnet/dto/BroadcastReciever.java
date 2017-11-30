package com.appnet.appnet.dto;

import com.appnet.appnet.model.IntentFilter;
import com.appnet.appnet.model.Permission;

import java.util.Collection;

public class BroadcastReciever {
    String url;
    String name;
    Collection<IntentFilter> intentFilters;
    Collection<Permission> usedPermissions;
}
