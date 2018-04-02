package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.MalingshuWanyibingzhongxibingzhuxt;

public interface MalingshuWanyibingzhongxibingzhuxtService {
	public Page<MalingshuWanyibingzhongxibingzhuxt> findAll(Integer pageNum,Integer pageSize);
	public MalingshuWanyibingzhongxibingzhuxt saveOne(MalingshuWanyibingzhongxibingzhuxt malingshuWanyibingzhongxibingzhuxt);
	public MalingshuWanyibingzhongxibingzhuxt modify(MalingshuWanyibingzhongxibingzhuxt malingshuWanyibingzhongxibingzhuxt);
	public void delete(Integer id);
	public MalingshuWanyibingzhongxibingzhuxt getOne(Integer id);
}
