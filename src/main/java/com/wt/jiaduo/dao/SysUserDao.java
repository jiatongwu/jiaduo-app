package com.wt.jiaduo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wt.jiaduo.dto.jpa.SysUser;

public interface SysUserDao extends JpaRepository<SysUser, Integer> {

}
