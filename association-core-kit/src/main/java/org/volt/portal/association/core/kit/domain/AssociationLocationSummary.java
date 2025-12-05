package org.volt.portal.association.core.kit.domain;

import com.fasterxml.jackson.annotation.JsonProperty;


public record AssociationLocationSummary(
    @JsonProperty(required = true) String id,
    @JsonProperty(required = true) Long associationId,
    @JsonProperty(required = true) String line1,
    @JsonProperty String line2,
    @JsonProperty(required = true) String city,
    @JsonProperty(required = true) String postalCode,
    @JsonProperty(required = true) String country) {
}
