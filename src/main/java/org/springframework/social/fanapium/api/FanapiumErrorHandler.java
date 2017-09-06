package org.springframework.social.fanapium.api;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.social.fanapium.api.error.FanapiumApiException;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/2/17.
 */
public class FanapiumErrorHandler extends DefaultResponseErrorHandler {


    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        Map<String, Object> errorDetails = extractErrorDetailsFromResponse(response);

        int code = Integer.valueOf(String.valueOf(errorDetails.get("code"))).intValue();
        String message = String.valueOf(errorDetails.get("message"));

        handleFanapiumError(code, message);

        throw new FanapiumApiException(code, message);
    }


    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        if (super.hasError(response)) {
            return true;
        }
        // only bother checking the body for errors if we get past the default error check
        String content = readFully(response.getBody());
        return content.contains("\"hasError\": true");
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> extractErrorDetailsFromResponse(ClientHttpResponse response) throws IOException {
        ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        System.out.println(response.getRawStatusCode());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusText());
        Map<String, Object> responseMap = mapper.<Map<String, Object>>readValue(response.getBody(), new TypeReference() {
        });
        if (responseMap.containsKey("code")) {
            Map<String, Object> meta = (Map<String, Object>) responseMap.get("code");
            if (Integer.valueOf(String.valueOf(meta.get("code"))).intValue() > 200) {
                return meta;
            }
        }
        return null;
    }

    private void handleFanapiumError(int code, String message) {

    }

    private String readFully(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            sb.append(reader.readLine());
        }
        return sb.toString();
    }
}
