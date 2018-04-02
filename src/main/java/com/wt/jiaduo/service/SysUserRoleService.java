package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.SysUserRole;

public interface SysUserRoleService {
	public Page<SysUserRole> findAll(Integer pageNum,Integer pageSize);
	public SysUserRole saveOne(SysUserRole sysUserRole);
	public SysUserRole modify(SysUserRole sysUserRole);
	public void delete(Integer id);
	public SysUserRole getOne(Integer id);
}
