package org.volt.portal.association.core.kit.service;

import org.volt.portal.association.core.kit.domain.AssociationLocationSummary;

import java.util.Collection;


public interface AssociationLocationQueryService {

    Collection<AssociationLocationSummary> getCurrentLocationsByAssociationIds(Collection<Long> associationIds);

}
