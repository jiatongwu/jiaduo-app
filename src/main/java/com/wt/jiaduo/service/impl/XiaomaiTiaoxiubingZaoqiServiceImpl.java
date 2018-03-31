package com.wt.jiaduo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wt.jiaduo.dao.XiaomaiTiaoxiubingZaoqiDao;
import com.wt.jiaduo.dto.XiaomaiTiaoxiubingZaoqi;
import com.wt.jiaduo.service.XiaomaiTiaoxiubingZaoqiService;
@Service
@Transactional
public class XiaomaiTiaoxiubingZaoqiServiceImpl implements XiaomaiTiaoxiubingZaoqiService{
	@Autowired
	private XiaomaiTiaoxiubingZaoqiDao xiaomaiTiaoxiubingZaoqiDao;

	@Override
	public List<XiaomaiTiaoxiubingZaoqi> findAll() {
		return xiaomaiTiaoxiubingZaoqiDao.findAll();
	}

	@Override
	public void saveOne(XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqi) {
		xiaomaiTiaoxiubingZaoqiDao.save(xiaomaiTiaoxiubingZaoqi);
	}

	@Override
	public void modify(XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqi) {
		xiaomaiTiaoxiubingZaoqiDao.save(xiaomaiTiaoxiubingZaoqi);
	}

	@Override
	public void delete(Integer id) {
		xiaomaiTiaoxiubingZaoqiDao.delete(id);
	}

}
