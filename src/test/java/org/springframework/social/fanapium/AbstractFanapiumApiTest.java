package org.springframework.social.fanapium;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.social.fanapium.api.impl.FanapiumTemplate;
import org.springframework.test.web.client.MockRestServiceServer;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public abstract class AbstractFanapiumApiTest {

    protected FanapiumTemplate fanapiumTemplate;
    protected MockRestServiceServer mockRestServiceServer;

    @Before
    public void setupTest() {
        fanapiumTemplate = new FanapiumTemplate("JWT_TOKEN");
        mockRestServiceServer = MockRestServiceServer.createServer(fanapiumTemplate.getRestTemplate());
    }

    protected Resource jsonResource(final String filename) {
        return new ClassPathResource(filename + ".json", getClass());
    }

    protected String encodeUTF8(final String textToEncode) throws UnsupportedEncodingException {
        return URLEncoder.encode(textToEncode, "UTF-8");
    }
}
