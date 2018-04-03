package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiBaifenbing;

public interface XiaomaiBaifenbingService {
	public Page<XiaomaiBaifenbing> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiBaifenbing saveOne(XiaomaiBaifenbing xiaomaiBaifenbing);
	public XiaomaiBaifenbing modify(XiaomaiBaifenbing xiaomaiBaifenbing);
	public void delete(Integer id);
	public XiaomaiBaifenbing getOne(Integer id);
}
