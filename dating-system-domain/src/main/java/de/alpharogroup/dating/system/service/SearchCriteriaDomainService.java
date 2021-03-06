package de.alpharogroup.dating.system.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.SearchCriteriasDao;
import de.alpharogroup.dating.system.domain.SearchCriteria;
import de.alpharogroup.dating.system.entities.SearchCriterias;
import de.alpharogroup.dating.system.mapper.SearchCriteriasMapper;
import de.alpharogroup.dating.system.service.api.SearchCriteriaService;
import de.alpharogroup.service.domain.AbstractDomainService;

@Transactional
@Service("searchCriteriaDomainService")
public class SearchCriteriaDomainService
	extends
		AbstractDomainService<Integer, SearchCriteria, SearchCriterias, SearchCriteriasDao, SearchCriteriasMapper>
	implements
		SearchCriteriaService
{

}
