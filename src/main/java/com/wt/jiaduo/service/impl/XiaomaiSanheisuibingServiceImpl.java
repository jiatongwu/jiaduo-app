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

import com.wt.jiaduo.dao.XiaomaiSanheisuibingDao;
import com.wt.jiaduo.dto.XiaomaiSanheisuibing;
import com.wt.jiaduo.service.XiaomaiSanheisuibingService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiSanheisuibingServiceImpl implements XiaomaiSanheisuibingService {
	@Autowired
	private XiaomaiSanheisuibingDao xiaomaiSanheisuibingDao;

	@Override
	public Page<XiaomaiSanheisuibing> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiSanheisuibingDao.findAll(pageable);
	}

	@Override
	public XiaomaiSanheisuibing saveOne(XiaomaiSanheisuibing xiaomaiSanheisuibing) {
		return xiaomaiSanheisuibingDao.save(xiaomaiSanheisuibing);
	}

	@Override
	public XiaomaiSanheisuibing modify(XiaomaiSanheisuibing xiaomaiSanheisuibing) {
		XiaomaiSanheisuibing xiaomaiSanheisuibingDatabase = xiaomaiSanheisuibingDao
				.getOne(xiaomaiSanheisuibing.getId());
		if (xiaomaiSanheisuibingDatabase != null) {
			BeanUtils.copyProperties(xiaomaiSanheisuibing, xiaomaiSanheisuibingDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiSanheisuibing));
			return xiaomaiSanheisuibingDao.save(xiaomaiSanheisuibingDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiSanheisuibingDao.delete(id);
	}

	@Override
	public XiaomaiSanheisuibing getOne(Integer id) {
		return xiaomaiSanheisuibingDao.findOne(id);
	}

}
