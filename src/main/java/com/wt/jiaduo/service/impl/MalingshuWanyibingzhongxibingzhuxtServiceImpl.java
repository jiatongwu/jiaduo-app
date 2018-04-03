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

import com.wt.jiaduo.dao.MalingshuWanyibingzhongxibingzhuxtDao;
import com.wt.jiaduo.dto.jpa.MalingshuWanyibingzhongxibingzhuxt;
import com.wt.jiaduo.service.MalingshuWanyibingzhongxibingzhuxtService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class MalingshuWanyibingzhongxibingzhuxtServiceImpl implements MalingshuWanyibingzhongxibingzhuxtService {
	@Autowired
	private MalingshuWanyibingzhongxibingzhuxtDao malingshuWanyibingzhongxibingzhuxtDao;

	@Override
	public Page<MalingshuWanyibingzhongxibingzhuxt> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return malingshuWanyibingzhongxibingzhuxtDao.findAll(pageable);
	}

	@Override
	public MalingshuWanyibingzhongxibingzhuxt saveOne(MalingshuWanyibingzhongxibingzhuxt malingshuWanyibingzhongxibingzhuxt) {
		return malingshuWanyibingzhongxibingzhuxtDao.save(malingshuWanyibingzhongxibingzhuxt);
	}

	@Override
	public MalingshuWanyibingzhongxibingzhuxt modify(MalingshuWanyibingzhongxibingzhuxt malingshuWanyibingzhongxibingzhuxt) {
		MalingshuWanyibingzhongxibingzhuxt malingshuWanyibingzhongxibingzhuxtDatabase = malingshuWanyibingzhongxibingzhuxtDao
				.getOne(malingshuWanyibingzhongxibingzhuxt.getId());
		if (malingshuWanyibingzhongxibingzhuxtDatabase != null) {
			BeanUtils.copyProperties(malingshuWanyibingzhongxibingzhuxt, malingshuWanyibingzhongxibingzhuxtDatabase,
					BeanUtilsUtil.getNullPropertyNames(malingshuWanyibingzhongxibingzhuxt));
			return malingshuWanyibingzhongxibingzhuxtDao.save(malingshuWanyibingzhongxibingzhuxtDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		malingshuWanyibingzhongxibingzhuxtDao.delete(id);
	}

	@Override
	public MalingshuWanyibingzhongxibingzhuxt getOne(Integer id) {
		return malingshuWanyibingzhongxibingzhuxtDao.findOne(id);
	}

}
