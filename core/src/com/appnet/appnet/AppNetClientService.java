package com.appnet.appnet;

import com.appnet.appnet.dto.*;
import com.appnet.appnet.exception.AppNetException;

import java.util.Collection;

public interface AppNetClientService {

    void registerActivitiy();

    Connector resolveActivity(String app_id, String username, Intent intent) throws AppNetException;

    void registerService();

    Connector resolveService(String app_id, String username, Intent intent) throws AppNetException;

    void registerWebService();

    Connector resolveWebService(String app_id, String username , ...) throws AppNetException;

    void registerBroadcastReciever(String app_id, String username, BroadcastReciever broadcastReciever) throws AppNetException;

    void sendBroadcast(String app_id, String username, Intent intent) throws AppNetException;

    AccessConfirmResponse confirmAccess(...); //between two apps //checks if 1. app is registered 2. has access for permisisons

    Collection<AccessResponse> requestAccess(String app_id, String username, String scope) throws AppNetException;

}

//How to make startActivityForResult? Redirect vagy client-sendmessage?
