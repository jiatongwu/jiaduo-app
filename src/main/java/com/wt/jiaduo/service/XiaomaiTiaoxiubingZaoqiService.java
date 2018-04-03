package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiTiaoxiubingZaoqi;

public interface XiaomaiTiaoxiubingZaoqiService {
	public Page<XiaomaiTiaoxiubingZaoqi> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiTiaoxiubingZaoqi saveOne(XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqi);
	public XiaomaiTiaoxiubingZaoqi modify(XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqi);
	public void delete(Integer id);
	public XiaomaiTiaoxiubingZaoqi getOne(Integer id);
}
