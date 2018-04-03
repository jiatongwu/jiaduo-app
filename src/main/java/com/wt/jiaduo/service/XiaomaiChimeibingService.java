package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiChimeibing;

public interface XiaomaiChimeibingService {
	public Page<XiaomaiChimeibing> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiChimeibing saveOne(XiaomaiChimeibing xiaomaiChimeibing);
	public XiaomaiChimeibing modify(XiaomaiChimeibing xiaomaiChimeibing);
	public void delete(Integer id);
	public XiaomaiChimeibing getOne(Integer id);
}
