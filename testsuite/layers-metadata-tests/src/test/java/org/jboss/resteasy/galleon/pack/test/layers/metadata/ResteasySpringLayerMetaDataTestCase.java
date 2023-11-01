package org.jboss.resteasy.galleon.pack.test.layers.metadata;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.resteasy.spi.HttpResponseCodes;
import org.jboss.resteasy.utils.PortProviderUtil;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@RunAsClient
public class ResteasySpringLayerMetaDataTestCase extends AbstractLayerMetaDataTestCase {
    private static Archive<?> web;

    //    @BeforeClass
    @Deployment
    public static Archive<?> createArchives() {
        web = createWebArchive("web.war", "web.xml", ResteasySpringLayerMetaDataTestCase.class.getResource("/web.xml"));
        return web;
    }

    @Test
    public void testLayer() throws Exception {
        checkLayersForArchive("web.war", web, "resteasy-spring");

    }

    @Test
    public void testResource() throws Exception {
        Client client = ClientBuilder.newClient();
        try {
            WebTarget target = client.target(PortProviderUtil.generateURL("/resteasy", "web"));
            Response response = target.request().get();
            Assert.assertEquals(HttpResponseCodes.SC_OK, response.getStatus());
            String str = response.readEntity(String.class);
            Assert.assertEquals("hello", str);
        } finally {
            client.close();
        }


    }
}
