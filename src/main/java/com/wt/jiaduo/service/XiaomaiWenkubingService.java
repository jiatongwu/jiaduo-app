package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiWenkubing;

public interface XiaomaiWenkubingService {
	public Page<XiaomaiWenkubing> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiWenkubing saveOne(XiaomaiWenkubing xiaomaiWenkubing);
	public XiaomaiWenkubing modify(XiaomaiWenkubing xiaomaiWenkubing);
	public void delete(Integer id);
	public XiaomaiWenkubing getOne(Integer id);
}
