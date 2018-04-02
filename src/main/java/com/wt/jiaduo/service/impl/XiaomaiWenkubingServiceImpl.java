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

import com.wt.jiaduo.dao.XiaomaiWenkubingDao;
import com.wt.jiaduo.dto.XiaomaiWenkubing;
import com.wt.jiaduo.service.XiaomaiWenkubingService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiWenkubingServiceImpl implements XiaomaiWenkubingService {
	@Autowired
	private XiaomaiWenkubingDao xiaomaiWenkubingDao;

	@Override
	public Page<XiaomaiWenkubing> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiWenkubingDao.findAll(pageable);
	}

	@Override
	public XiaomaiWenkubing saveOne(XiaomaiWenkubing xiaomaiWenkubing) {
		return xiaomaiWenkubingDao.save(xiaomaiWenkubing);
	}

	@Override
	public XiaomaiWenkubing modify(XiaomaiWenkubing xiaomaiWenkubing) {
		XiaomaiWenkubing xiaomaiWenkubingDatabase = xiaomaiWenkubingDao
				.getOne(xiaomaiWenkubing.getId());
		if (xiaomaiWenkubingDatabase != null) {
			BeanUtils.copyProperties(xiaomaiWenkubing, xiaomaiWenkubingDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiWenkubing));
			return xiaomaiWenkubingDao.save(xiaomaiWenkubingDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiWenkubingDao.delete(id);
	}

	@Override
	public XiaomaiWenkubing getOne(Integer id) {
		return xiaomaiWenkubingDao.findOne(id);
	}

}
