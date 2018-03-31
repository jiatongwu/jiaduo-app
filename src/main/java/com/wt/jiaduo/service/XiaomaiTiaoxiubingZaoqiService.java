package com.wt.jiaduo.service;

import java.util.List;

import com.wt.jiaduo.dto.XiaomaiTiaoxiubingZaoqi;

public interface XiaomaiTiaoxiubingZaoqiService {
	public List<XiaomaiTiaoxiubingZaoqi> findAll();
	public void saveOne(XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqi);
	public void modify(XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqi);
	public void delete(Integer id);
}
