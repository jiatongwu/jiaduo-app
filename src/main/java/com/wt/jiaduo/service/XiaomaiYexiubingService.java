package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiYexiubing;

public interface XiaomaiYexiubingService {
	public Page<XiaomaiYexiubing> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiYexiubing saveOne(XiaomaiYexiubing xiaomaiYexiubing);
	public XiaomaiYexiubing modify(XiaomaiYexiubing xiaomaiYexiubing);
	public void delete(Integer id);
	public XiaomaiYexiubing getOne(Integer id);
}
