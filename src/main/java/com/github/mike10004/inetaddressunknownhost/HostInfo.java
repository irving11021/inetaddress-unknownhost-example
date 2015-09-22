/*
 * (c) 2015 IBG, A Novetta Solutions Company.
 */
package com.github.mike10004.inetaddressunknownhost;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author mchaberski
 */
public class HostInfo {

    public InetAddress detectAddress() throws IOException {
        InetAddress address = InetAddress.getLocalHost();
        return address;
    }
}
