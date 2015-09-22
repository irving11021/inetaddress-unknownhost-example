/*
 * (c) 2015 IBG, A Novetta Solutions Company.
 */
package com.github.mike10004.inetaddressunknownhost;

import java.io.IOException;
import java.net.InetAddress;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mchaberski
 */
public class HostInfoTest {
    
    public HostInfoTest() {
    }

    @Test
    public void testSomeMethod() throws IOException {
        InetAddress address = new HostInfo().detectAddress();
        System.out.println(address);
    }
    
}
