package de.alpharogroup.dating.system.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.alpharogroup.dating.system.daos.FavoriteMembersDao;
import de.alpharogroup.dating.system.domain.FavoriteMember;
import de.alpharogroup.dating.system.entities.FavoriteMembers;
import de.alpharogroup.dating.system.mapper.FavoriteMembersMapper;
import de.alpharogroup.dating.system.service.api.FavoriteMemberService;
import de.alpharogroup.service.domain.AbstractDomainService;

@Transactional
@Service("favoriteMemberDomainService")
public class FavoriteMemberDomainService
	extends
		AbstractDomainService<Integer, FavoriteMember, FavoriteMembers, FavoriteMembersDao, FavoriteMembersMapper>
	implements
		FavoriteMemberService
{

}
