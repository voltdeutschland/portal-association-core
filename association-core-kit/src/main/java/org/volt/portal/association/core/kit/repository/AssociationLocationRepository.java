package org.volt.portal.association.core.kit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.volt.portal.association.core.kit.entity.AssociationLocation;

import java.util.Collection;


@Repository
public interface AssociationLocationRepository extends CrudRepository<AssociationLocation, String> {

    Collection<AssociationLocation> findAllByAssociationIdInAndActiveUntilIsNull(Collection<Long> associationIds);

}
