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

package com.liferay.opensocial.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.opensocial.model.Gadget;
import com.liferay.opensocial.service.GadgetLocalService;
import com.liferay.opensocial.service.persistence.GadgetPersistence;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the gadget local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.opensocial.service.impl.GadgetLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.liferay.opensocial.service.GadgetLocalServiceUtil} to access the gadget local service.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.opensocial.service.impl.GadgetLocalServiceImpl
 * @see com.liferay.opensocial.service.GadgetLocalServiceUtil
 * @generated
 */
public abstract class GadgetLocalServiceBaseImpl implements GadgetLocalService {
	/**
	 * Adds the gadget to the database. Also notifies the appropriate model listeners.
	 *
	 * @param gadget the gadget to add
	 * @return the gadget that was added
	 * @throws SystemException if a system exception occurred
	 */
	public Gadget addGadget(Gadget gadget) throws SystemException {
		gadget.setNew(true);

		return gadgetPersistence.update(gadget, false);
	}

	/**
	 * Creates a new gadget with the primary key. Does not add the gadget to the database.
	 *
	 * @param gadgetId the primary key for the new gadget
	 * @return the new gadget
	 */
	public Gadget createGadget(long gadgetId) {
		return gadgetPersistence.create(gadgetId);
	}

	/**
	 * Deletes the gadget with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gadgetId the primary key of the gadget to delete
	 * @throws PortalException if a gadget with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteGadget(long gadgetId)
		throws PortalException, SystemException {
		gadgetPersistence.remove(gadgetId);
	}

	/**
	 * Deletes the gadget from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gadget the gadget to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteGadget(Gadget gadget)
		throws PortalException, SystemException {
		gadgetPersistence.remove(gadget);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("unchecked")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return gadgetPersistence.findWithDynamicQuery(dynamicQuery);
	}

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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return gadgetPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return gadgetPersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return gadgetPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the gadget with the primary key.
	 *
	 * @param gadgetId the primary key of the gadget to get
	 * @return the gadget
	 * @throws PortalException if a gadget with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Gadget getGadget(long gadgetId)
		throws PortalException, SystemException {
		return gadgetPersistence.findByPrimaryKey(gadgetId);
	}

	/**
	 * Gets a range of all the gadgets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of gadgets to return
	 * @param end the upper bound of the range of gadgets to return (not inclusive)
	 * @return the range of gadgets
	 * @throws SystemException if a system exception occurred
	 */
	public List<Gadget> getGadgets(int start, int end)
		throws SystemException {
		return gadgetPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of gadgets.
	 *
	 * @return the number of gadgets
	 * @throws SystemException if a system exception occurred
	 */
	public int getGadgetsCount() throws SystemException {
		return gadgetPersistence.countAll();
	}

	/**
	 * Updates the gadget in the database. Also notifies the appropriate model listeners.
	 *
	 * @param gadget the gadget to update
	 * @return the gadget that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public Gadget updateGadget(Gadget gadget) throws SystemException {
		gadget.setNew(false);

		return gadgetPersistence.update(gadget, true);
	}

	/**
	 * Updates the gadget in the database. Also notifies the appropriate model listeners.
	 *
	 * @param gadget the gadget to update
	 * @param merge whether to merge the gadget with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the gadget that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public Gadget updateGadget(Gadget gadget, boolean merge)
		throws SystemException {
		gadget.setNew(false);

		return gadgetPersistence.update(gadget, merge);
	}

	/**
	 * Gets the gadget local service.
	 *
	 * @return the gadget local service
	 */
	public GadgetLocalService getGadgetLocalService() {
		return gadgetLocalService;
	}

	/**
	 * Sets the gadget local service.
	 *
	 * @param gadgetLocalService the gadget local service
	 */
	public void setGadgetLocalService(GadgetLocalService gadgetLocalService) {
		this.gadgetLocalService = gadgetLocalService;
	}

	/**
	 * Gets the gadget persistence.
	 *
	 * @return the gadget persistence
	 */
	public GadgetPersistence getGadgetPersistence() {
		return gadgetPersistence;
	}

	/**
	 * Sets the gadget persistence.
	 *
	 * @param gadgetPersistence the gadget persistence
	 */
	public void setGadgetPersistence(GadgetPersistence gadgetPersistence) {
		this.gadgetPersistence = gadgetPersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = gadgetPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = GadgetLocalService.class)
	protected GadgetLocalService gadgetLocalService;
	@BeanReference(type = GadgetPersistence.class)
	protected GadgetPersistence gadgetPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}