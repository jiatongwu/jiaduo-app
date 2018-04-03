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

import com.wt.jiaduo.dao.XiaomaiBaifenbingDao;
import com.wt.jiaduo.dto.jpa.XiaomaiBaifenbing;
import com.wt.jiaduo.service.XiaomaiBaifenbingService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiBaifenbingServiceImpl implements XiaomaiBaifenbingService {
	@Autowired
	private XiaomaiBaifenbingDao xiaomaiBaifenbingDao;

	@Override
	public Page<XiaomaiBaifenbing> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiBaifenbingDao.findAll(pageable);
	}

	@Override
	public XiaomaiBaifenbing saveOne(XiaomaiBaifenbing xiaomaiBaifenbing) {
		return xiaomaiBaifenbingDao.save(xiaomaiBaifenbing);
	}

	@Override
	public XiaomaiBaifenbing modify(XiaomaiBaifenbing xiaomaiBaifenbing) {
		XiaomaiBaifenbing xiaomaiBaifenbingDatabase = xiaomaiBaifenbingDao
				.getOne(xiaomaiBaifenbing.getId());
		if (xiaomaiBaifenbingDatabase != null) {
			BeanUtils.copyProperties(xiaomaiBaifenbing, xiaomaiBaifenbingDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiBaifenbing));
			return xiaomaiBaifenbingDao.save(xiaomaiBaifenbingDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiBaifenbingDao.delete(id);
	}

	@Override
	public XiaomaiBaifenbing getOne(Integer id) {
		return xiaomaiBaifenbingDao.findOne(id);
	}

}
