package org.springframework.social.fanapium;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.UserPostInfo;
import org.springframework.social.fanapium.config.boot.FanapiumProperties;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class OAuth2Template extends AbstractFanapiumApiTest {
    @Autowired
    FanapiumProperties properties;

    @Test
    public void testGetUserInfo() {
        mockRestServiceServer.expect(requestTo(properties.getSsoAddress()))
                .andExpect(method(GET))
                .andRespond(
                        withSuccess(jsonResource("user_info"), APPLICATION_JSON)
                );

        AbstractResponseDTO<UserPostInfo> userInfo = fanapiumTemplate.postOperations().getUserPostInfos("");


    }
}
