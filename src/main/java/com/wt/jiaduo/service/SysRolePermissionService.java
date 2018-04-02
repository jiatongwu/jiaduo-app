package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.SysRolePermission;

public interface SysRolePermissionService {
	public Page<SysRolePermission> findAll(Integer pageNum,Integer pageSize);
	public SysRolePermission saveOne(SysRolePermission sysRolePermission);
	public SysRolePermission modify(SysRolePermission sysRolePermission);
	public void delete(Integer id);
	public SysRolePermission getOne(Integer id);
}
