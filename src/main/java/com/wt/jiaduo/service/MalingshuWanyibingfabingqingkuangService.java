package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.MalingshuWanyibingfabingqingkuang;

public interface MalingshuWanyibingfabingqingkuangService {
	public Page<MalingshuWanyibingfabingqingkuang> findAll(Integer pageNum,Integer pageSize);
	public MalingshuWanyibingfabingqingkuang saveOne(MalingshuWanyibingfabingqingkuang malingshuWanyibingfabingqingkuang);
	public MalingshuWanyibingfabingqingkuang modify(MalingshuWanyibingfabingqingkuang malingshuWanyibingfabingqingkuang);
	public void delete(Integer id);
	public MalingshuWanyibingfabingqingkuang getOne(Integer id);
}
