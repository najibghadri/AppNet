package org.appnet;

import java.io.InputStream;
import java.util.Collection;

/**
 * Service for retrieving photos.
 */
public interface PhotoService {

  Collection<PhotoInfo> getPhotosForCurrentUser(String username);

  InputStream loadPhoto(String id);
}
