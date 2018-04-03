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

import com.wt.jiaduo.dao.XiaomaiXijiangchongtaotuDao;
import com.wt.jiaduo.dto.jpa.XiaomaiXijiangchongtaotu;
import com.wt.jiaduo.service.XiaomaiXijiangchongtaotuService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiXijiangchongtaotuServiceImpl implements XiaomaiXijiangchongtaotuService {
	@Autowired
	private XiaomaiXijiangchongtaotuDao xiaomaiXijiangchongtaotuDao;

	@Override
	public Page<XiaomaiXijiangchongtaotu> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiXijiangchongtaotuDao.findAll(pageable);
	}

	@Override
	public XiaomaiXijiangchongtaotu saveOne(XiaomaiXijiangchongtaotu xiaomaiXijiangchongtaotu) {
		return xiaomaiXijiangchongtaotuDao.save(xiaomaiXijiangchongtaotu);
	}

	@Override
	public XiaomaiXijiangchongtaotu modify(XiaomaiXijiangchongtaotu xiaomaiXijiangchongtaotu) {
		XiaomaiXijiangchongtaotu xiaomaiXijiangchongtaotuDatabase = xiaomaiXijiangchongtaotuDao
				.getOne(xiaomaiXijiangchongtaotu.getId());
		if (xiaomaiXijiangchongtaotuDatabase != null) {
			BeanUtils.copyProperties(xiaomaiXijiangchongtaotu, xiaomaiXijiangchongtaotuDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiXijiangchongtaotu));
			return xiaomaiXijiangchongtaotuDao.save(xiaomaiXijiangchongtaotuDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiXijiangchongtaotuDao.delete(id);
	}

	@Override
	public XiaomaiXijiangchongtaotu getOne(Integer id) {
		return xiaomaiXijiangchongtaotuDao.findOne(id);
	}

}
