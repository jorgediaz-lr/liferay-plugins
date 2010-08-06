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

package com.liferay.so.service;

/**
 * <p>
 * This class is a wrapper for {@link ProjectsEntryLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ProjectsEntryLocalService
 * @generated
 */
public class ProjectsEntryLocalServiceWrapper
	implements ProjectsEntryLocalService {
	public ProjectsEntryLocalServiceWrapper(
		ProjectsEntryLocalService projectsEntryLocalService) {
		_projectsEntryLocalService = projectsEntryLocalService;
	}

	/**
	* Adds the projects entry to the database. Also notifies the appropriate model listeners.
	*
	* @param projectsEntry the projects entry to add
	* @return the projects entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.so.model.ProjectsEntry addProjectsEntry(
		com.liferay.so.model.ProjectsEntry projectsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.addProjectsEntry(projectsEntry);
	}

	/**
	* Creates a new projects entry with the primary key. Does not add the projects entry to the database.
	*
	* @param projectsEntryId the primary key for the new projects entry
	* @return the new projects entry
	*/
	public com.liferay.so.model.ProjectsEntry createProjectsEntry(
		long projectsEntryId) {
		return _projectsEntryLocalService.createProjectsEntry(projectsEntryId);
	}

	/**
	* Deletes the projects entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectsEntryId the primary key of the projects entry to delete
	* @throws PortalException if a projects entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteProjectsEntry(long projectsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_projectsEntryLocalService.deleteProjectsEntry(projectsEntryId);
	}

	/**
	* Deletes the projects entry from the database. Also notifies the appropriate model listeners.
	*
	* @param projectsEntry the projects entry to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteProjectsEntry(
		com.liferay.so.model.ProjectsEntry projectsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		_projectsEntryLocalService.deleteProjectsEntry(projectsEntry);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the projects entry with the primary key.
	*
	* @param projectsEntryId the primary key of the projects entry to get
	* @return the projects entry
	* @throws PortalException if a projects entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.so.model.ProjectsEntry getProjectsEntry(
		long projectsEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.getProjectsEntry(projectsEntryId);
	}

	/**
	* Gets a range of all the projects entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of projects entries to return
	* @param end the upper bound of the range of projects entries to return (not inclusive)
	* @return the range of projects entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.so.model.ProjectsEntry> getProjectsEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.getProjectsEntries(start, end);
	}

	/**
	* Gets the number of projects entries.
	*
	* @return the number of projects entries
	* @throws SystemException if a system exception occurred
	*/
	public int getProjectsEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.getProjectsEntriesCount();
	}

	/**
	* Updates the projects entry in the database. Also notifies the appropriate model listeners.
	*
	* @param projectsEntry the projects entry to update
	* @return the projects entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.so.model.ProjectsEntry updateProjectsEntry(
		com.liferay.so.model.ProjectsEntry projectsEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.updateProjectsEntry(projectsEntry);
	}

	/**
	* Updates the projects entry in the database. Also notifies the appropriate model listeners.
	*
	* @param projectsEntry the projects entry to update
	* @param merge whether to merge the projects entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the projects entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.so.model.ProjectsEntry updateProjectsEntry(
		com.liferay.so.model.ProjectsEntry projectsEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.updateProjectsEntry(projectsEntry,
			merge);
	}

	public com.liferay.so.model.ProjectsEntry addProjectsEntry(long userId,
		java.lang.String title, java.lang.String description,
		int startDateMonth, int startDateDay, int startDateYear,
		int endDateMonth, int endDateDay, int endDateYear, boolean current,
		java.lang.String data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.addProjectsEntry(userId, title,
			description, startDateMonth, startDateDay, startDateYear,
			endDateMonth, endDateDay, endDateYear, current, data);
	}

	public java.util.List<com.liferay.so.model.ProjectsEntry> getUserProjectsEntries(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.getUserProjectsEntries(userId);
	}

	public int getUserProjectsEntriesCount(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.getUserProjectsEntriesCount(userId);
	}

	public com.liferay.so.model.ProjectsEntry updateProjectsEntry(
		long projectsEntryId, java.lang.String title,
		java.lang.String description, int startDateMonth, int startDateDay,
		int startDateYear, int endDateMonth, int endDateDay, int endDateYear,
		boolean current, java.lang.String data)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectsEntryLocalService.updateProjectsEntry(projectsEntryId,
			title, description, startDateMonth, startDateDay, startDateYear,
			endDateMonth, endDateDay, endDateYear, current, data);
	}

	public ProjectsEntryLocalService getWrappedProjectsEntryLocalService() {
		return _projectsEntryLocalService;
	}

	private ProjectsEntryLocalService _projectsEntryLocalService;
}