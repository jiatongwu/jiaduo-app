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

import com.wt.jiaduo.dao.XiaomaiTiaoxiubingHouqiDao;
import com.wt.jiaduo.dto.jpa.XiaomaiTiaoxiubingHouqi;
import com.wt.jiaduo.service.XiaomaiTiaoxiubingHouqiService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiTiaoxiubingHouqiServiceImpl implements XiaomaiTiaoxiubingHouqiService {
	@Autowired
	private XiaomaiTiaoxiubingHouqiDao xiaomaiTiaoxiubingHouqiDao;

	@Override
	public Page<XiaomaiTiaoxiubingHouqi> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiTiaoxiubingHouqiDao.findAll(pageable);
	}

	@Override
	public XiaomaiTiaoxiubingHouqi saveOne(XiaomaiTiaoxiubingHouqi xiaomaiTiaoxiubingHouqi) {
		return xiaomaiTiaoxiubingHouqiDao.save(xiaomaiTiaoxiubingHouqi);
	}

	@Override
	public XiaomaiTiaoxiubingHouqi modify(XiaomaiTiaoxiubingHouqi xiaomaiTiaoxiubingHouqi) {
		XiaomaiTiaoxiubingHouqi xiaomaiTiaoxiubingHouqiDatabase = xiaomaiTiaoxiubingHouqiDao
				.getOne(xiaomaiTiaoxiubingHouqi.getId());
		if (xiaomaiTiaoxiubingHouqiDatabase != null) {
			BeanUtils.copyProperties(xiaomaiTiaoxiubingHouqi, xiaomaiTiaoxiubingHouqiDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiTiaoxiubingHouqi));
			return xiaomaiTiaoxiubingHouqiDao.save(xiaomaiTiaoxiubingHouqiDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiTiaoxiubingHouqiDao.delete(id);
	}

	@Override
	public XiaomaiTiaoxiubingHouqi getOne(Integer id) {
		return xiaomaiTiaoxiubingHouqiDao.findOne(id);
	}

}
