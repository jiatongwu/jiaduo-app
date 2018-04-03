package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiTiaoxiubingYuexia;

public interface XiaomaiTiaoxiubingYuexiaService {
	public Page<XiaomaiTiaoxiubingYuexia> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiTiaoxiubingYuexia saveOne(XiaomaiTiaoxiubingYuexia xiaomaiTiaoxiubingYuexia);
	public XiaomaiTiaoxiubingYuexia modify(XiaomaiTiaoxiubingYuexia xiaomaiTiaoxiubingYuexia);
	public void delete(Integer id);
	public XiaomaiTiaoxiubingYuexia getOne(Integer id);
}
