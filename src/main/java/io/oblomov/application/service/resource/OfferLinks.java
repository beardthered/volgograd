package io.oblomov.application.service.resource;

import com.fasterxml.jackson.annotation.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "self",
        "next",
        "previous",
        "learnMore"
})
@Data
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType
public class OfferLinks {

    @JsonProperty("self")
    private ResourceLink self;

    @JsonProperty("next")
    private ResourceLink next;

    @JsonProperty("previous")
    private ResourceLink previous;

    @JsonProperty("learnMore")
    private ResourceLink learnMore;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Builder
    public OfferLinks(ResourceLink self, ResourceLink next, ResourceLink previous, ResourceLink learnMore, Map<String, Object> additionalProperties) {
        this.self = self;
        this.next = next;
        this.previous = previous;
        this.learnMore = learnMore;
        this.additionalProperties = additionalProperties;
    }
}
