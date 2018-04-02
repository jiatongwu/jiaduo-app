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

import com.wt.jiaduo.dao.XiaomaiMaizhizhudatianDao;
import com.wt.jiaduo.dto.XiaomaiMaizhizhudatian;
import com.wt.jiaduo.service.XiaomaiMaizhizhudatianService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiMaizhizhudatianServiceImpl implements XiaomaiMaizhizhudatianService {
	@Autowired
	private XiaomaiMaizhizhudatianDao xiaomaiMaizhizhudatianDao;

	@Override
	public Page<XiaomaiMaizhizhudatian> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiMaizhizhudatianDao.findAll(pageable);
	}

	@Override
	public XiaomaiMaizhizhudatian saveOne(XiaomaiMaizhizhudatian xiaomaiMaizhizhudatian) {
		return xiaomaiMaizhizhudatianDao.save(xiaomaiMaizhizhudatian);
	}

	@Override
	public XiaomaiMaizhizhudatian modify(XiaomaiMaizhizhudatian xiaomaiMaizhizhudatian) {
		XiaomaiMaizhizhudatian xiaomaiMaizhizhudatianDatabase = xiaomaiMaizhizhudatianDao
				.getOne(xiaomaiMaizhizhudatian.getId());
		if (xiaomaiMaizhizhudatianDatabase != null) {
			BeanUtils.copyProperties(xiaomaiMaizhizhudatian, xiaomaiMaizhizhudatianDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiMaizhizhudatian));
			return xiaomaiMaizhizhudatianDao.save(xiaomaiMaizhizhudatianDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiMaizhizhudatianDao.delete(id);
	}

	@Override
	public XiaomaiMaizhizhudatian getOne(Integer id) {
		return xiaomaiMaizhizhudatianDao.findOne(id);
	}

}
