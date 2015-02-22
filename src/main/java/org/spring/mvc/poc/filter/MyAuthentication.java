package org.spring.mvc.poc.filter;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author luis mora
 */
public class MyAuthentication extends AbstractAuthenticationToken {
    public MyAuthentication(Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
    }

    @Override
    public Object getCredentials() {
        return new Object();
    }

    @Override
    public Object getPrincipal() {
        return new Object();
    }
}
