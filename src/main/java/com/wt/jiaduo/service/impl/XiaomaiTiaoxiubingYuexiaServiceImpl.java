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

import com.wt.jiaduo.dao.XiaomaiTiaoxiubingYuexiaDao;
import com.wt.jiaduo.dto.XiaomaiTiaoxiubingYuexia;
import com.wt.jiaduo.service.XiaomaiTiaoxiubingYuexiaService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiTiaoxiubingYuexiaServiceImpl implements XiaomaiTiaoxiubingYuexiaService {
	@Autowired
	private XiaomaiTiaoxiubingYuexiaDao xiaomaiTiaoxiubingYuexiaDao;

	@Override
	public Page<XiaomaiTiaoxiubingYuexia> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiTiaoxiubingYuexiaDao.findAll(pageable);
	}

	@Override
	public XiaomaiTiaoxiubingYuexia saveOne(XiaomaiTiaoxiubingYuexia xiaomaiTiaoxiubingYuexia) {
		return xiaomaiTiaoxiubingYuexiaDao.save(xiaomaiTiaoxiubingYuexia);
	}

	@Override
	public XiaomaiTiaoxiubingYuexia modify(XiaomaiTiaoxiubingYuexia xiaomaiTiaoxiubingYuexia) {
		XiaomaiTiaoxiubingYuexia xiaomaiTiaoxiubingYuexiaDatabase = xiaomaiTiaoxiubingYuexiaDao
				.getOne(xiaomaiTiaoxiubingYuexia.getId());
		if (xiaomaiTiaoxiubingYuexiaDatabase != null) {
			BeanUtils.copyProperties(xiaomaiTiaoxiubingYuexia, xiaomaiTiaoxiubingYuexiaDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiTiaoxiubingYuexia));
			return xiaomaiTiaoxiubingYuexiaDao.save(xiaomaiTiaoxiubingYuexiaDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiTiaoxiubingYuexiaDao.delete(id);
	}

	@Override
	public XiaomaiTiaoxiubingYuexia getOne(Integer id) {
		return xiaomaiTiaoxiubingYuexiaDao.findOne(id);
	}

}
