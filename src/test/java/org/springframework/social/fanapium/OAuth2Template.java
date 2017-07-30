package org.springframework.social.fanapium;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.fanapium.api.impl.UserInfo;
import org.springframework.social.fanapium.config.boot.FanapiumProperties;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.assertj.core.api.Assertions.assertThat;

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

        UserInfo userInfo = fanapiumTemplate.userOperations().getUserInfo();

        assertThat(userInfo).isNotNull();
        assertThat(userInfo.getGivenName()).isEqualTo("");
        assertThat(userInfo.getFamilyName()).isEqualTo("");

    }
}
