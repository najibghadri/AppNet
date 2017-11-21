package org.appnet.service;

import org.appnet.dto.AccessResponse;
import org.appnet.dto.BroadcastReciever;
import org.appnet.dto.Connector;
import org.appnet.dto.Intent;
import org.appnet.service.exception.AppNetException;

import java.util.Collection;

public interface AppNetService {

    Connector resolveActivity(String app_id, String username, Intent intent) throws AppNetException;

    Connector resolveService(String app_id, String username, Intent intent) throws AppNetException;

    Connector resolveWebService(String app_id, String username, Intent intent) throws AppNetException;

    void sendBroadcast(String app_id, String username, Intent intent) throws AppNetException;

    void registerBroadcastReciever(String app_id, String username, BroadcastReciever broadcastReciever) throws AppNetException;

    Collection<AccessResponse> requestAccess(String app_id, String username, String scope) throws AppNetException;

}

//How to make startActivityForResult? Redirect vagy client-sendmessage?
