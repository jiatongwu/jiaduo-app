package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiXijiangchongtaotu;

public interface XiaomaiXijiangchongtaotuService {
	public Page<XiaomaiXijiangchongtaotu> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiXijiangchongtaotu saveOne(XiaomaiXijiangchongtaotu xiaomaiXijiangchongtaotu);
	public XiaomaiXijiangchongtaotu modify(XiaomaiXijiangchongtaotu xiaomaiXijiangchongtaotu);
	public void delete(Integer id);
	public XiaomaiXijiangchongtaotu getOne(Integer id);
}
