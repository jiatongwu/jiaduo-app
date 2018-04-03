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

import com.wt.jiaduo.dao.MalingshuWanyibingbingqingxitongDao;
import com.wt.jiaduo.dto.jpa.MalingshuWanyibingbingqingxitong;
import com.wt.jiaduo.service.MalingshuWanyibingbingqingxitongService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class MalingshuWanyibingbingqingxitongServiceImpl implements MalingshuWanyibingbingqingxitongService {
	@Autowired
	private MalingshuWanyibingbingqingxitongDao malingshuWanyibingbingqingxitongDao;

	@Override
	public Page<MalingshuWanyibingbingqingxitong> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return malingshuWanyibingbingqingxitongDao.findAll(pageable);
	}

	@Override
	public MalingshuWanyibingbingqingxitong saveOne(MalingshuWanyibingbingqingxitong malingshuWanyibingbingqingxitong) {
		return malingshuWanyibingbingqingxitongDao.save(malingshuWanyibingbingqingxitong);
	}

	@Override
	public MalingshuWanyibingbingqingxitong modify(MalingshuWanyibingbingqingxitong malingshuWanyibingbingqingxitong) {
		MalingshuWanyibingbingqingxitong malingshuWanyibingbingqingxitongDatabase = malingshuWanyibingbingqingxitongDao
				.getOne(malingshuWanyibingbingqingxitong.getId());
		if (malingshuWanyibingbingqingxitongDatabase != null) {
			BeanUtils.copyProperties(malingshuWanyibingbingqingxitong, malingshuWanyibingbingqingxitongDatabase,
					BeanUtilsUtil.getNullPropertyNames(malingshuWanyibingbingqingxitong));
			return malingshuWanyibingbingqingxitongDao.save(malingshuWanyibingbingqingxitongDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		malingshuWanyibingbingqingxitongDao.delete(id);
	}

	@Override
	public MalingshuWanyibingbingqingxitong getOne(Integer id) {
		return malingshuWanyibingbingqingxitongDao.findOne(id);
	}

}
