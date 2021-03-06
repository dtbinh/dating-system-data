package de.alpharogroup.dating.system.service.api;

import java.util.List;

import de.alpharogroup.dating.system.entities.FriendshipRequests;
import de.alpharogroup.dating.system.enums.FriendshipRequestsState;
import de.alpharogroup.db.service.jpa.BusinessService;
import de.alpharogroup.user.management.entities.Users;

/**
 * The Interface FriendshipRequestsService.
 */
public interface FriendshipRequestsService extends
		BusinessService<FriendshipRequests, Integer> {

	/**
	 * Gets a FriendshipRequests object from the given parameters. If no result
	 * is found null will be returned.
	 * 
	 * @param requestor
	 *            the requestor
	 * @param requestedUser
	 *            the requested user
	 * @return the friendship requests
	 */
	FriendshipRequests find(Users requestor, Users requestedUser);

	/**
	 * Gets a FriendshipRequests object from the given parameters that can be
	 * null if they shell be ignored in the query. If no result is found null
	 * will be returned.
	 * 
	 * @param requestor
	 *            the requestor
	 * @param requestedUser
	 *            the requested user
	 * @param state
	 *            the state
	 * @return the friendship requests
	 */
	FriendshipRequests find(Users requestor, Users requestedUser,
			FriendshipRequestsState state);

	/**
	 * Gets a List from FriendshipRequests with the given parameters that can be
	 * null if they shell be ignored in the query.
	 * 
	 * @param requestor
	 *            the requestor
	 * @param requestedUser
	 *            the requested user
	 * @param state
	 *            the state
	 * @return the list
	 */
	List<FriendshipRequests> findAll(Users requestor, Users requestedUser,
			FriendshipRequestsState state);
}