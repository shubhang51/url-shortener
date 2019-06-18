package org.egov.shorten.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

/**
 * ShortenURLRequest
 */
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2019-06-18T19:53:28.830+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShortenURLRequest   {
        @JsonProperty("url")
        private String url = null;

        @JsonProperty("duration")
        private Integer duration = null;

        @JsonProperty("retries")
        private Integer retries = null;

        @JsonProperty("fallbackURL")
        private String fallbackURL = null;


}

