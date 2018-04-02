package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.SysUser;

public interface SysUserService {
	public Page<SysUser> findAll(Integer pageNum,Integer pageSize);
	public SysUser saveOne(SysUser sysUser);
	public SysUser modify(SysUser sysUser);
	public void delete(Integer id);
	public SysUser getOne(Integer id);
}
