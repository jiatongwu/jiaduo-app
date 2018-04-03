package com.wt.jiaduo.service.impl;

import java.io.UnsupportedEncodingException;

import javax.transaction.Transactional;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wt.jiaduo.dao.SysUserDao;
import com.wt.jiaduo.dto.jpa.SysUser;
import com.wt.jiaduo.service.SysUserService;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserDao sysUserDao;

	@Override
	public Page<SysUser> findAll(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUser saveOne(SysUser sysUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUser modify(SysUser sysUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public SysUser getOne(Integer id) {
		return sysUserDao.findOne(id);
	}

	@Override
	public SysUser login(String username, String password) {
		SysUser example = new SysUser();
		example.setUsername(username);
		if (StringUtils.isEmpty(password) || StringUtils.isEmpty(username)) {
			return null;
		}
		String md5 = DigestUtils.md5Hex(password);
		example.setPassword(md5);
		return sysUserDao.findOne(Example.of(example));
	}

}
