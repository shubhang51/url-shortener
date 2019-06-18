package org.egov.shorten.web.controllers;


import org.egov.shorten.web.models.DeleteURLRequest;
import org.egov.shorten.web.models.ShortenURLRequest;
    import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.egov.shorten.web.models.StatsRequest;
import org.egov.shorten.web.models.StatsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.util.*;

    import javax.validation.constraints.*;
    import javax.validation.Valid;
    import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2019-06-18T19:53:28.830+05:30")

@Controller
@RequestMapping("/short")
public class ShortenApiController{

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public ShortenApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @RequestMapping(value="/shorten", method = RequestMethod.POST)
    public ResponseEntity<String> shortenPost(@ApiParam(value = ""  )  @Valid @RequestBody ShortenURLRequest shortenURLRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"https://short-host-name/short/lookup/hash-value\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value="/{hash}", method = RequestMethod.GET)
    public ResponseEntity<Void> hashGet(@ApiParam(value = "",required=true) @PathVariable("hash") String hash) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value="/delete", method = RequestMethod.POST)
    public ResponseEntity<Void> deletePost(@ApiParam(value = ""  )  @Valid @RequestBody DeleteURLRequest deleteURLRequest) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value="/stats", method = RequestMethod.POST)
    public ResponseEntity<StatsResponse> statsPost(@ApiParam(value = ""  )  @Valid @RequestBody StatsRequest getStatsRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<StatsResponse>(objectMapper.readValue("{  \"createdAt\" : 1559030045000,  \"fallbackURL\" : \"https://host-name.com/\",  \"actualURL\" : \"https://host-name.com/....LongURL....\",  \"shortURL\" : \"https://short-host-name.com/short/lookup/hash-value\",  \"usage\" : 10,  \"remainingRetries\" : -1}", StatsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                return new ResponseEntity<StatsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<StatsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
