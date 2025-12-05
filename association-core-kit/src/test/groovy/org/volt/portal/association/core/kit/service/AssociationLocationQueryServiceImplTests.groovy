package org.volt.portal.association.core.kit.service

import org.volt.portal.association.core.kit.domain.AssociationLocationSummary
import org.volt.portal.association.core.kit.entity.AssociationLocation
import org.volt.portal.association.core.kit.repository.AssociationLocationRepository
import spock.lang.Specification

class AssociationLocationQueryServiceImplTests extends Specification {

    AssociationLocationRepository locationRepository = Mock()

    AssociationLocationQueryServiceImpl service = new AssociationLocationQueryServiceImpl(locationRepository)

    def "getCurrentLocationsByAssociationIds returns mapped summaries for active locations"() {
        given:
        def ids = [1L, 2L] as Set

        def locA = Mock(AssociationLocation)
        def locB = Mock(AssociationLocation)

        def sumA = Mock(AssociationLocationSummary)
        def sumB = Mock(AssociationLocationSummary)

        and:
        1 * locationRepository.findAllByAssociationIdInAndActiveUntilIsNull(ids) >> [locA, locB]
        1 * locA.toSummary() >> sumA
        1 * locB.toSummary() >> sumB

        when:
        def actual = service.getCurrentLocationsByAssociationIds(ids)

        then:
        noExceptionThrown()
        actual.size() == 2
        actual[0].is(sumA)
        actual[1].is(sumB)
    }
}
