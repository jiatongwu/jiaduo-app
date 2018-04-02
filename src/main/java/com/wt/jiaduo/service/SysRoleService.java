package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.SysRole;

public interface SysRoleService {
	public Page<SysRole> findAll(Integer pageNum,Integer pageSize);
	public SysRole saveOne(SysRole sysRole);
	public SysRole modify(SysRole sysRole);
	public void delete(Integer id);
	public SysRole getOne(Integer id);
}
