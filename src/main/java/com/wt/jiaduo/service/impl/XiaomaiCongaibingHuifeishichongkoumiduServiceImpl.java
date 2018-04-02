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

import com.wt.jiaduo.dao.XiaomaiCongaibingHuifeishichongkoumiduDao;
import com.wt.jiaduo.dto.XiaomaiCongaibingHuifeishichongkoumidu;
import com.wt.jiaduo.service.XiaomaiCongaibingHuifeishichongkoumiduService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiCongaibingHuifeishichongkoumiduServiceImpl implements XiaomaiCongaibingHuifeishichongkoumiduService {
	@Autowired
	private XiaomaiCongaibingHuifeishichongkoumiduDao xiaomaiCongaibingHuifeishichongkoumiduDao;

	@Override
	public Page<XiaomaiCongaibingHuifeishichongkoumidu> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiCongaibingHuifeishichongkoumiduDao.findAll(pageable);
	}

	@Override
	public XiaomaiCongaibingHuifeishichongkoumidu saveOne(XiaomaiCongaibingHuifeishichongkoumidu xiaomaiCongaibingHuifeishichongkoumidu) {
		return xiaomaiCongaibingHuifeishichongkoumiduDao.save(xiaomaiCongaibingHuifeishichongkoumidu);
	}

	@Override
	public XiaomaiCongaibingHuifeishichongkoumidu modify(XiaomaiCongaibingHuifeishichongkoumidu xiaomaiCongaibingHuifeishichongkoumidu) {
		XiaomaiCongaibingHuifeishichongkoumidu xiaomaiCongaibingHuifeishichongkoumiduDatabase = xiaomaiCongaibingHuifeishichongkoumiduDao
				.getOne(xiaomaiCongaibingHuifeishichongkoumidu.getId());
		if (xiaomaiCongaibingHuifeishichongkoumiduDatabase != null) {
			BeanUtils.copyProperties(xiaomaiCongaibingHuifeishichongkoumidu, xiaomaiCongaibingHuifeishichongkoumiduDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiCongaibingHuifeishichongkoumidu));
			return xiaomaiCongaibingHuifeishichongkoumiduDao.save(xiaomaiCongaibingHuifeishichongkoumiduDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiCongaibingHuifeishichongkoumiduDao.delete(id);
	}

	@Override
	public XiaomaiCongaibingHuifeishichongkoumidu getOne(Integer id) {
		return xiaomaiCongaibingHuifeishichongkoumiduDao.findOne(id);
	}

}
