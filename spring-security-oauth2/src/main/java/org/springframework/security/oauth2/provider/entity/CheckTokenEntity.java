package org.springframework.security.oauth2.provider.entity;

import lombok.Data;

/**
 * Created by keets on 2017/9/25.
 */
@Data
public class CheckTokenEntity {
    private String token;
    private String uri;
    private long affairId;
    private long roleId;
}
