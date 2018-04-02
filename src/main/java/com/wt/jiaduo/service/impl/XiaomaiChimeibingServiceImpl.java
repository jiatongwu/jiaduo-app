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

import com.wt.jiaduo.dao.XiaomaiChimeibingDao;
import com.wt.jiaduo.dto.XiaomaiChimeibing;
import com.wt.jiaduo.service.XiaomaiChimeibingService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiChimeibingServiceImpl implements XiaomaiChimeibingService {
	@Autowired
	private XiaomaiChimeibingDao xiaomaiChimeibingDao;

	@Override
	public Page<XiaomaiChimeibing> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiChimeibingDao.findAll(pageable);
	}

	@Override
	public XiaomaiChimeibing saveOne(XiaomaiChimeibing xiaomaiChimeibing) {
		return xiaomaiChimeibingDao.save(xiaomaiChimeibing);
	}

	@Override
	public XiaomaiChimeibing modify(XiaomaiChimeibing xiaomaiChimeibing) {
		XiaomaiChimeibing xiaomaiChimeibingDatabase = xiaomaiChimeibingDao
				.getOne(xiaomaiChimeibing.getId());
		if (xiaomaiChimeibingDatabase != null) {
			BeanUtils.copyProperties(xiaomaiChimeibing, xiaomaiChimeibingDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiChimeibing));
			return xiaomaiChimeibingDao.save(xiaomaiChimeibingDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiChimeibingDao.delete(id);
	}

	@Override
	public XiaomaiChimeibing getOne(Integer id) {
		return xiaomaiChimeibingDao.findOne(id);
	}

}
