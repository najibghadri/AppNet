package com.appnet.appnet;

import com.appnet.appnet.model.AppManifest;
import com.appnet.appnet.model.Permission;
import com.appnet.appnet.model.User;
import com.appnet.appnet.model.webservice.WebServiceManifest;

import java.util.Collection;

interface AppNetUserService {

  User me();

  Collection<AppManifest> listApps();

  Collection<WebServiceManifest> listWebservices();

  void registerApp();

  void unregisterApp();

  void registerWebService();

  void unregisterWebService();

  void grantPermission(AppManifest app);

  void revokePermission(AppManifest app);

  void grantPremission(WebServiceManifest webService);

  void revokePermission(WebServiceManifest webService);

  Collection<Permission> listPermissions(AppManifest app);

  Collection<Permission> listPermissions(WebServiceManifest webService);

}
