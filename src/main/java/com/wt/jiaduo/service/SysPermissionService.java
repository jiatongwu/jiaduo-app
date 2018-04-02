package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.SysPermission;

public interface SysPermissionService {
	public Page<SysPermission> findAll(Integer pageNum,Integer pageSize);
	public SysPermission saveOne(SysPermission sysPermission);
	public SysPermission modify(SysPermission sysPermission);
	public void delete(Integer id);
	public SysPermission getOne(Integer id);
}
