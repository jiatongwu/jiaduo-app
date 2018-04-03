package com.wt.jiaduo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.wt.jiaduo.dao.XiaomaiTiaoxiubingZaoqiDao;
import com.wt.jiaduo.dto.jpa.XiaomaiTiaoxiubingZaoqi;
import com.wt.jiaduo.service.XiaomaiTiaoxiubingZaoqiService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiTiaoxiubingZaoqiServiceImpl implements XiaomaiTiaoxiubingZaoqiService {
	@Autowired
	private XiaomaiTiaoxiubingZaoqiDao xiaomaiTiaoxiubingZaoqiDao;

	@Override
	public Page<XiaomaiTiaoxiubingZaoqi> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiTiaoxiubingZaoqiDao.findAll(pageable);
	}

	@Override
	public XiaomaiTiaoxiubingZaoqi saveOne(XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqi) {
		return xiaomaiTiaoxiubingZaoqiDao.save(xiaomaiTiaoxiubingZaoqi);
	}

	@Override
	public XiaomaiTiaoxiubingZaoqi modify(XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqi) {
		XiaomaiTiaoxiubingZaoqi xiaomaiTiaoxiubingZaoqiDatabase = xiaomaiTiaoxiubingZaoqiDao
				.getOne(xiaomaiTiaoxiubingZaoqi.getId());
		if (xiaomaiTiaoxiubingZaoqiDatabase != null) {
			BeanUtils.copyProperties(xiaomaiTiaoxiubingZaoqi, xiaomaiTiaoxiubingZaoqiDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiTiaoxiubingZaoqi));
			return xiaomaiTiaoxiubingZaoqiDao.save(xiaomaiTiaoxiubingZaoqiDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiTiaoxiubingZaoqiDao.delete(id);
	}

	@Override
	public XiaomaiTiaoxiubingZaoqi getOne(Integer id) {
		return xiaomaiTiaoxiubingZaoqiDao.findOne(id);
	}

}
