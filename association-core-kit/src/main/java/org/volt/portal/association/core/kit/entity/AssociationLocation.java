package org.volt.portal.association.core.kit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.UuidGenerator;
import org.volt.portal.association.core.kit.domain.AssociationLocationSummary;

import java.time.LocalDate;
import java.time.OffsetDateTime;


@Entity
@Table(name="association_locations")
@Getter
@ToString
@RequiredArgsConstructor
public class AssociationLocation {

    @Id
    @UuidGenerator
    @Column(name = "id", nullable = false, updatable = false, columnDefinition = "CHAR(36)")
    private String id;

    @Column(name = "association_id", nullable = false, updatable = false)
    private Long associationId;

    @Column(name = "active_since")
    private LocalDate activeSince;

    @Column(name = "active_until")
    private LocalDate activeUntil;

    @Column(name = "created_by", columnDefinition = "CHAR(36)")
    private String createdBy;
    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(name = "removed_by", columnDefinition = "CHAR(36)")
    private String removedBy;
    @Column(name = "removed_at")
    private OffsetDateTime removedAt;

    @Column(name = "line_1")
    private String line1;

    @Column(name = "line_2")
    private String line2;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country", columnDefinition = "CHAR(2)")
    private String country;

    public AssociationLocationSummary toSummary() {
        return new AssociationLocationSummary(
                getId(), getAssociationId(),
                getLine1(), getLine2(), getCity(),
                getPostalCode(), getCountry());
    }

}
