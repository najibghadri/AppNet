package org.appnet.dto;

import org.appnet.model.IntentFilter;
import org.appnet.model.Scope;

import java.util.Collection;

public class BroadcastReciever {
    String url;
    String name;
    Collection<IntentFilter> intentFilters;
    Collection<Scope> usedScopes;
}
