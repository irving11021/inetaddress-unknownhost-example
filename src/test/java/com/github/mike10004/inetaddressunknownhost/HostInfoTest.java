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
    public void testDetectAddress() throws IOException {
        System.out.println("testDetectAddress");
        System.out.println("jvm.version=" + System.getProperty("jvm.version"));
        InetAddress address = new HostInfo().detectAddress();
        System.out.println(address);
        assertNotNull("address", address);
    }
    
}
