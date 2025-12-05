package org.volt.portal.association.core.kit.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.volt.portal.association.core.kit.domain.AssociationLocationSummary;
import org.volt.portal.association.core.kit.entity.AssociationLocation;
import org.volt.portal.association.core.kit.repository.AssociationLocationRepository;

import java.util.*;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AssociationLocationQueryServiceImpl implements AssociationLocationQueryService {

    private final AssociationLocationRepository locationRepository;

    @Override
    public Collection<AssociationLocationSummary> getCurrentLocationsByAssociationIds(Collection<Long> associationIds) {
        return locationRepository.findAllByAssociationIdInAndActiveUntilIsNull(associationIds).stream()
                .map(AssociationLocation::toSummary)
                .toList();
    }

}
