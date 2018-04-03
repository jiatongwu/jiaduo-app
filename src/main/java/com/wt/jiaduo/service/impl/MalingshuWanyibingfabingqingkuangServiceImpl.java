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

import com.wt.jiaduo.dao.MalingshuWanyibingfabingqingkuangDao;
import com.wt.jiaduo.dto.jpa.MalingshuWanyibingfabingqingkuang;
import com.wt.jiaduo.service.MalingshuWanyibingfabingqingkuangService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class MalingshuWanyibingfabingqingkuangServiceImpl implements MalingshuWanyibingfabingqingkuangService {
	@Autowired
	private MalingshuWanyibingfabingqingkuangDao malingshuWanyibingfabingqingkuangDao;

	@Override
	public Page<MalingshuWanyibingfabingqingkuang> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return malingshuWanyibingfabingqingkuangDao.findAll(pageable);
	}

	@Override
	public MalingshuWanyibingfabingqingkuang saveOne(MalingshuWanyibingfabingqingkuang malingshuWanyibingfabingqingkuang) {
		return malingshuWanyibingfabingqingkuangDao.save(malingshuWanyibingfabingqingkuang);
	}

	@Override
	public MalingshuWanyibingfabingqingkuang modify(MalingshuWanyibingfabingqingkuang malingshuWanyibingfabingqingkuang) {
		MalingshuWanyibingfabingqingkuang malingshuWanyibingfabingqingkuangDatabase = malingshuWanyibingfabingqingkuangDao
				.getOne(malingshuWanyibingfabingqingkuang.getId());
		if (malingshuWanyibingfabingqingkuangDatabase != null) {
			BeanUtils.copyProperties(malingshuWanyibingfabingqingkuang, malingshuWanyibingfabingqingkuangDatabase,
					BeanUtilsUtil.getNullPropertyNames(malingshuWanyibingfabingqingkuang));
			return malingshuWanyibingfabingqingkuangDao.save(malingshuWanyibingfabingqingkuangDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		malingshuWanyibingfabingqingkuangDao.delete(id);
	}

	@Override
	public MalingshuWanyibingfabingqingkuang getOne(Integer id) {
		return malingshuWanyibingfabingqingkuangDao.findOne(id);
	}

}
