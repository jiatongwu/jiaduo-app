package com.wt.jiaduo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wt.jiaduo.dao.SysRoleDao;
import com.wt.jiaduo.dto.jpa.SysRole;
import com.wt.jiaduo.service.SysRoleService;
@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {
	@Autowired
	private SysRoleDao SysRoleDao;
	

	@Override
	public Page<SysRole> findAll(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysRole saveOne(SysRole SysRole) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysRole modify(SysRole SysRole) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public SysRole getOne(Integer id) {
		return SysRoleDao.findOne(id);
	}

}
