package org.egov.shorten.web.controllers;

import org.egov.shorten.web.models.DeleteURLRequest;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.egov.shorten.TestConfiguration;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* API tests for DeleteApiController
*/
@Ignore
@RunWith(SpringRunner.class)
@WebMvcTest(DeleteApiController.class)
@Import(TestConfiguration.class)
public class DeleteApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void deletePostSuccess() throws Exception {
        mockMvc.perform(post("/short/delete").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void deletePostFailure() throws Exception {
        mockMvc.perform(post("/short/delete").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

}
