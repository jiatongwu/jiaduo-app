package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.XiaomaiSanheisuibing;

public interface XiaomaiSanheisuibingService {
	public Page<XiaomaiSanheisuibing> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiSanheisuibing saveOne(XiaomaiSanheisuibing xiaomaiSanheisuibing);
	public XiaomaiSanheisuibing modify(XiaomaiSanheisuibing xiaomaiSanheisuibing);
	public void delete(Integer id);
	public XiaomaiSanheisuibing getOne(Integer id);
}
