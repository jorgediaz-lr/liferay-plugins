/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.ams.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the type local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TypeLocalServiceUtil} to access the type local service. Add custom service methods to {@link com.liferay.ams.service.impl.TypeLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TypeLocalServiceUtil
 * @see com.liferay.ams.service.base.TypeLocalServiceBaseImpl
 * @see com.liferay.ams.service.impl.TypeLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TypeLocalService {
	/**
	* Adds the type to the database. Also notifies the appropriate model listeners.
	*
	* @param type the type to add
	* @return the type that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.ams.model.Type addType(com.liferay.ams.model.Type type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new type with the primary key. Does not add the type to the database.
	*
	* @param typeId the primary key for the new type
	* @return the new type
	*/
	public com.liferay.ams.model.Type createType(long typeId);

	/**
	* Deletes the type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the type to delete
	* @throws PortalException if a type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the type from the database. Also notifies the appropriate model listeners.
	*
	* @param type the type to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteType(com.liferay.ams.model.Type type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("unchecked")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("unchecked")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("unchecked")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the type with the primary key.
	*
	* @param typeId the primary key of the type to get
	* @return the type
	* @throws PortalException if a type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.ams.model.Type getType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of types to return
	* @param end the upper bound of the range of types to return (not inclusive)
	* @return the range of types
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.ams.model.Type> getTypes(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of types.
	*
	* @return the number of types
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the type in the database. Also notifies the appropriate model listeners.
	*
	* @param type the type to update
	* @return the type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.ams.model.Type updateType(
		com.liferay.ams.model.Type type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the type in the database. Also notifies the appropriate model listeners.
	*
	* @param type the type to update
	* @param merge whether to merge the type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.ams.model.Type updateType(
		com.liferay.ams.model.Type type, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;
}