package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.MalingshuWanyibingbingqingxitong;

public interface MalingshuWanyibingbingqingxitongService {
	public Page<MalingshuWanyibingbingqingxitong> findAll(Integer pageNum,Integer pageSize);
	public MalingshuWanyibingbingqingxitong saveOne(MalingshuWanyibingbingqingxitong malingshuWanyibingbingqingxitong);
	public MalingshuWanyibingbingqingxitong modify(MalingshuWanyibingbingqingxitong malingshuWanyibingbingqingxitong);
	public void delete(Integer id);
	public MalingshuWanyibingbingqingxitong getOne(Integer id);
}
