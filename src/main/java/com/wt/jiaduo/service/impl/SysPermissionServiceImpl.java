package com.wt.jiaduo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wt.jiaduo.dao.SysPermissionDao;
import com.wt.jiaduo.dto.jpa.SysPermission;
import com.wt.jiaduo.service.SysPermissionService;
@Service
@Transactional
public class SysPermissionServiceImpl implements SysPermissionService{
	
	@Autowired
	private SysPermissionDao SysPermissionDao;
	

	@Override
	public Page<SysPermission> findAll(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysPermission saveOne(SysPermission SysPermission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysPermission modify(SysPermission SysPermission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public SysPermission getOne(Integer id) {
		return SysPermissionDao.findOne(id);
	}

}
