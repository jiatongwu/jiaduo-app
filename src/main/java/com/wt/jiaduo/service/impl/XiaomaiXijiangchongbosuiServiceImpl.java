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

import com.wt.jiaduo.dao.XiaomaiXijiangchongbosuiDao;
import com.wt.jiaduo.dto.XiaomaiXijiangchongbosui;
import com.wt.jiaduo.service.XiaomaiXijiangchongbosuiService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiXijiangchongbosuiServiceImpl implements XiaomaiXijiangchongbosuiService {
	@Autowired
	private XiaomaiXijiangchongbosuiDao xiaomaiXijiangchongbosuiDao;

	@Override
	public Page<XiaomaiXijiangchongbosui> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiXijiangchongbosuiDao.findAll(pageable);
	}

	@Override
	public XiaomaiXijiangchongbosui saveOne(XiaomaiXijiangchongbosui xiaomaiXijiangchongbosui) {
		return xiaomaiXijiangchongbosuiDao.save(xiaomaiXijiangchongbosui);
	}

	@Override
	public XiaomaiXijiangchongbosui modify(XiaomaiXijiangchongbosui xiaomaiXijiangchongbosui) {
		XiaomaiXijiangchongbosui xiaomaiXijiangchongbosuiDatabase = xiaomaiXijiangchongbosuiDao
				.getOne(xiaomaiXijiangchongbosui.getId());
		if (xiaomaiXijiangchongbosuiDatabase != null) {
			BeanUtils.copyProperties(xiaomaiXijiangchongbosui, xiaomaiXijiangchongbosuiDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiXijiangchongbosui));
			return xiaomaiXijiangchongbosuiDao.save(xiaomaiXijiangchongbosuiDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiXijiangchongbosuiDao.delete(id);
	}

	@Override
	public XiaomaiXijiangchongbosui getOne(Integer id) {
		return xiaomaiXijiangchongbosuiDao.findOne(id);
	}

}
