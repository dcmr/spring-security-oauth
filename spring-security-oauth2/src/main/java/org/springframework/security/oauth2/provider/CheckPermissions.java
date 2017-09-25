package org.springframework.security.oauth2.provider;

import org.springframework.security.oauth2.provider.entity.CheckTokenEntity;

/**
 * custom check interface
 * <p>
 * Created by keets on 2017/9/25.
 */
public interface CheckPermissions {
    /**
     * @param checkTokenEntity
     *
     * @return boolean
     */
    boolean checkPermission(CheckTokenEntity checkTokenEntity);
}
