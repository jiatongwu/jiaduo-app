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

import com.wt.jiaduo.dao.XiaomaiCongaibingBingqingpuchaDao;
import com.wt.jiaduo.dto.XiaomaiCongaibingBingqingpucha;
import com.wt.jiaduo.service.XiaomaiCongaibingBingqingpuchaService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiCongaibingBingqingpuchaServiceImpl implements XiaomaiCongaibingBingqingpuchaService {
	@Autowired
	private XiaomaiCongaibingBingqingpuchaDao xiaomaiCongaibingBingqingpuchaDao;

	@Override
	public Page<XiaomaiCongaibingBingqingpucha> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiCongaibingBingqingpuchaDao.findAll(pageable);
	}

	@Override
	public XiaomaiCongaibingBingqingpucha saveOne(XiaomaiCongaibingBingqingpucha xiaomaiCongaibingBingqingpucha) {
		return xiaomaiCongaibingBingqingpuchaDao.save(xiaomaiCongaibingBingqingpucha);
	}

	@Override
	public XiaomaiCongaibingBingqingpucha modify(XiaomaiCongaibingBingqingpucha xiaomaiCongaibingBingqingpucha) {
		XiaomaiCongaibingBingqingpucha xiaomaiCongaibingBingqingpuchaDatabase = xiaomaiCongaibingBingqingpuchaDao
				.getOne(xiaomaiCongaibingBingqingpucha.getId());
		if (xiaomaiCongaibingBingqingpuchaDatabase != null) {
			BeanUtils.copyProperties(xiaomaiCongaibingBingqingpucha, xiaomaiCongaibingBingqingpuchaDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiCongaibingBingqingpucha));
			return xiaomaiCongaibingBingqingpuchaDao.save(xiaomaiCongaibingBingqingpuchaDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiCongaibingBingqingpuchaDao.delete(id);
	}

	@Override
	public XiaomaiCongaibingBingqingpucha getOne(Integer id) {
		return xiaomaiCongaibingBingqingpuchaDao.findOne(id);
	}

}
