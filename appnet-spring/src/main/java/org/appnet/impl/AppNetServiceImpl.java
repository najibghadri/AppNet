package org.appnet.impl;

import org.appnet.dto.AccessResponse;
import org.appnet.dto.BroadcastReciever;
import org.appnet.dto.Connector;
import org.appnet.dto.Intent;
import org.appnet.service.AppNetService;
import org.appnet.service.exception.AppNetException;
import java.util.Collection;

public class AppNetServiceImpl implements AppNetService {

    @Override
    public Connector resolveActivity(String app_id, String username, Intent intent) throws AppNetException {
        return null;
    }

    @Override
    public Connector resolveService(String app_id, String username, Intent intent) throws AppNetException {
        return null;
    }

    @Override
    public Connector resolveWebService(String app_id, String username, Intent intent) throws AppNetException {
        return null;
    }

    @Override
    public void sendBroadcast(String app_id, String username, Intent intent) throws AppNetException {

    }

    @Override
    public void registerBroadcastReciever(String app_id, String username, BroadcastReciever broadcastReciever) throws AppNetException {

    }

    @Override
    public Collection<AccessResponse> requestAccess(String app_id, String username, String scope) throws AppNetException {
        return null;
    }
}
