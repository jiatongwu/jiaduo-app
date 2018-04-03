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

import com.wt.jiaduo.dao.XiaomaiYexiubingDao;
import com.wt.jiaduo.dto.jpa.XiaomaiYexiubing;
import com.wt.jiaduo.service.XiaomaiYexiubingService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiYexiubingServiceImpl implements XiaomaiYexiubingService {
	@Autowired
	private XiaomaiYexiubingDao xiaomaiYexiubingDao;

	@Override
	public Page<XiaomaiYexiubing> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiYexiubingDao.findAll(pageable);
	}

	@Override
	public XiaomaiYexiubing saveOne(XiaomaiYexiubing xiaomaiYexiubing) {
		return xiaomaiYexiubingDao.save(xiaomaiYexiubing);
	}

	@Override
	public XiaomaiYexiubing modify(XiaomaiYexiubing xiaomaiYexiubing) {
		XiaomaiYexiubing xiaomaiYexiubingDatabase = xiaomaiYexiubingDao
				.getOne(xiaomaiYexiubing.getId());
		if (xiaomaiYexiubingDatabase != null) {
			BeanUtils.copyProperties(xiaomaiYexiubing, xiaomaiYexiubingDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiYexiubing));
			return xiaomaiYexiubingDao.save(xiaomaiYexiubingDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiYexiubingDao.delete(id);
	}

	@Override
	public XiaomaiYexiubing getOne(Integer id) {
		return xiaomaiYexiubingDao.findOne(id);
	}

}
