package com.github.dreamhead.moco.cookie;

import io.netty.handler.codec.http.cookie.Cookie;

public final class SecureCookieAttribute extends ActualCookieAttribute {
    @Override
    public final void visit(final Cookie cookie) {
        cookie.setSecure(true);
    }
}
