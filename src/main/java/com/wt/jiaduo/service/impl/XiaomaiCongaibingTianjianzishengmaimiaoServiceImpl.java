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

import com.wt.jiaduo.dao.XiaomaiCongaibingTianjianzishengmaimiaoDao;
import com.wt.jiaduo.dto.jpa.XiaomaiCongaibingTianjianzishengmaimiao;
import com.wt.jiaduo.service.XiaomaiCongaibingTianjianzishengmaimiaoService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiCongaibingTianjianzishengmaimiaoServiceImpl implements XiaomaiCongaibingTianjianzishengmaimiaoService {
	@Autowired
	private XiaomaiCongaibingTianjianzishengmaimiaoDao xiaomaiCongaibingTianjianzishengmaimiaoDao;

	@Override
	public Page<XiaomaiCongaibingTianjianzishengmaimiao> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiCongaibingTianjianzishengmaimiaoDao.findAll(pageable);
	}

	@Override
	public XiaomaiCongaibingTianjianzishengmaimiao saveOne(XiaomaiCongaibingTianjianzishengmaimiao xiaomaiCongaibingTianjianzishengmaimiao) {
		return xiaomaiCongaibingTianjianzishengmaimiaoDao.save(xiaomaiCongaibingTianjianzishengmaimiao);
	}

	@Override
	public XiaomaiCongaibingTianjianzishengmaimiao modify(XiaomaiCongaibingTianjianzishengmaimiao xiaomaiCongaibingTianjianzishengmaimiao) {
		XiaomaiCongaibingTianjianzishengmaimiao xiaomaiCongaibingTianjianzishengmaimiaoDatabase = xiaomaiCongaibingTianjianzishengmaimiaoDao
				.getOne(xiaomaiCongaibingTianjianzishengmaimiao.getId());
		if (xiaomaiCongaibingTianjianzishengmaimiaoDatabase != null) {
			BeanUtils.copyProperties(xiaomaiCongaibingTianjianzishengmaimiao, xiaomaiCongaibingTianjianzishengmaimiaoDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiCongaibingTianjianzishengmaimiao));
			return xiaomaiCongaibingTianjianzishengmaimiaoDao.save(xiaomaiCongaibingTianjianzishengmaimiaoDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiCongaibingTianjianzishengmaimiaoDao.delete(id);
	}

	@Override
	public XiaomaiCongaibingTianjianzishengmaimiao getOne(Integer id) {
		return xiaomaiCongaibingTianjianzishengmaimiaoDao.findOne(id);
	}

}
