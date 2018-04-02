package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.XiaomaiTiaoxiubingHouqi;

public interface XiaomaiTiaoxiubingHouqiService {
	public Page<XiaomaiTiaoxiubingHouqi> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiTiaoxiubingHouqi saveOne(XiaomaiTiaoxiubingHouqi xiaomaiTiaoxiubingHouqi);
	public XiaomaiTiaoxiubingHouqi modify(XiaomaiTiaoxiubingHouqi xiaomaiTiaoxiubingHouqi);
	public void delete(Integer id);
	public XiaomaiTiaoxiubingHouqi getOne(Integer id);
}
