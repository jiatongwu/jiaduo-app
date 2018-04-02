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

import com.wt.jiaduo.dao.XiaomaiYachongDatianDao;
import com.wt.jiaduo.dto.XiaomaiYachongDatian;
import com.wt.jiaduo.service.XiaomaiYachongDatianService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiYachongDatianServiceImpl implements XiaomaiYachongDatianService {
	@Autowired
	private XiaomaiYachongDatianDao xiaomaiYachongDatianDao;

	@Override
	public Page<XiaomaiYachongDatian> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiYachongDatianDao.findAll(pageable);
	}

	@Override
	public XiaomaiYachongDatian saveOne(XiaomaiYachongDatian xiaomaiYachongDatian) {
		return xiaomaiYachongDatianDao.save(xiaomaiYachongDatian);
	}

	@Override
	public XiaomaiYachongDatian modify(XiaomaiYachongDatian xiaomaiYachongDatian) {
		XiaomaiYachongDatian xiaomaiYachongDatianDatabase = xiaomaiYachongDatianDao
				.getOne(xiaomaiYachongDatian.getId());
		if (xiaomaiYachongDatianDatabase != null) {
			BeanUtils.copyProperties(xiaomaiYachongDatian, xiaomaiYachongDatianDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiYachongDatian));
			return xiaomaiYachongDatianDao.save(xiaomaiYachongDatianDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiYachongDatianDao.delete(id);
	}

	@Override
	public XiaomaiYachongDatian getOne(Integer id) {
		return xiaomaiYachongDatianDao.findOne(id);
	}

}
