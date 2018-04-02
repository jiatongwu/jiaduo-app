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

import com.wt.jiaduo.dao.XiaomaiCongaibingHuifeishizirandaidulvDao;
import com.wt.jiaduo.dto.XiaomaiCongaibingHuifeishizirandaidulv;
import com.wt.jiaduo.service.XiaomaiCongaibingHuifeishizirandaidulvService;
import com.wt.jiaduo.utils.BeanUtilsUtil;

@Service
@Transactional
public class XiaomaiCongaibingHuifeishizirandaidulvServiceImpl implements XiaomaiCongaibingHuifeishizirandaidulvService {
	@Autowired
	private XiaomaiCongaibingHuifeishizirandaidulvDao xiaomaiCongaibingHuifeishizirandaidulvDao;

	@Override
	public Page<XiaomaiCongaibingHuifeishizirandaidulv> findAll(Integer pageNum, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "id");
		Pageable pageable = new PageRequest(pageNum - 1, pageSize, sort);
		return xiaomaiCongaibingHuifeishizirandaidulvDao.findAll(pageable);
	}

	@Override
	public XiaomaiCongaibingHuifeishizirandaidulv saveOne(XiaomaiCongaibingHuifeishizirandaidulv xiaomaiCongaibingHuifeishizirandaidulv) {
		return xiaomaiCongaibingHuifeishizirandaidulvDao.save(xiaomaiCongaibingHuifeishizirandaidulv);
	}

	@Override
	public XiaomaiCongaibingHuifeishizirandaidulv modify(XiaomaiCongaibingHuifeishizirandaidulv xiaomaiCongaibingHuifeishizirandaidulv) {
		XiaomaiCongaibingHuifeishizirandaidulv xiaomaiCongaibingHuifeishizirandaidulvDatabase = xiaomaiCongaibingHuifeishizirandaidulvDao
				.getOne(xiaomaiCongaibingHuifeishizirandaidulv.getId());
		if (xiaomaiCongaibingHuifeishizirandaidulvDatabase != null) {
			BeanUtils.copyProperties(xiaomaiCongaibingHuifeishizirandaidulv, xiaomaiCongaibingHuifeishizirandaidulvDatabase,
					BeanUtilsUtil.getNullPropertyNames(xiaomaiCongaibingHuifeishizirandaidulv));
			return xiaomaiCongaibingHuifeishizirandaidulvDao.save(xiaomaiCongaibingHuifeishizirandaidulvDatabase);
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		xiaomaiCongaibingHuifeishizirandaidulvDao.delete(id);
	}

	@Override
	public XiaomaiCongaibingHuifeishizirandaidulv getOne(Integer id) {
		return xiaomaiCongaibingHuifeishizirandaidulvDao.findOne(id);
	}

}
