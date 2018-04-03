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

import com.wt.jiaduo.dao.XiaomaiCongaibingYoucepufabinglvDao;
import com.wt.jiaduo.dto.jpa.XiaomaiCongaibingYoucepufabinglv;
import com.wt.jiaduo.service.XiaomaiCongaibingYoucepufabinglvService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiCongaibingYoucepufabinglvServiceImpl implements XiaomaiCongaibingYoucepufabinglvService {
	@Autowired
	private XiaomaiCongaibingYoucepufabinglvDao xiaomaiCongaibingYoucepufabinglvDao;

	@Override
	public Page<XiaomaiCongaibingYoucepufabinglv> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiCongaibingYoucepufabinglvDao.findAll(pageable);
	}

	@Override
	public XiaomaiCongaibingYoucepufabinglv saveOne(XiaomaiCongaibingYoucepufabinglv xiaomaiCongaibingYoucepufabinglv) {
		return xiaomaiCongaibingYoucepufabinglvDao.save(xiaomaiCongaibingYoucepufabinglv);
	}

	@Override
	public XiaomaiCongaibingYoucepufabinglv modify(XiaomaiCongaibingYoucepufabinglv xiaomaiCongaibingYoucepufabinglv) {
		XiaomaiCongaibingYoucepufabinglv xiaomaiCongaibingYoucepufabinglvDatabase = xiaomaiCongaibingYoucepufabinglvDao
				.getOne(xiaomaiCongaibingYoucepufabinglv.getId());
		if (xiaomaiCongaibingYoucepufabinglvDatabase != null) {
			BeanUtils.copyProperties(xiaomaiCongaibingYoucepufabinglv, xiaomaiCongaibingYoucepufabinglvDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiCongaibingYoucepufabinglv));
			return xiaomaiCongaibingYoucepufabinglvDao.save(xiaomaiCongaibingYoucepufabinglvDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiCongaibingYoucepufabinglvDao.delete(id);
	}

	@Override
	public XiaomaiCongaibingYoucepufabinglv getOne(Integer id) {
		return xiaomaiCongaibingYoucepufabinglvDao.findOne(id);
	}

}
