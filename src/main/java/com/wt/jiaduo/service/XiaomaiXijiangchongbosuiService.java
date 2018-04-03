package com.wt.jiaduo.service;

import org.springframework.data.domain.Page;

import com.wt.jiaduo.dto.jpa.XiaomaiXijiangchongbosui;

public interface XiaomaiXijiangchongbosuiService {
	public Page<XiaomaiXijiangchongbosui> findAll(Integer pageNum,Integer pageSize);
	public XiaomaiXijiangchongbosui saveOne(XiaomaiXijiangchongbosui xiaomaiXijiangchongbosui);
	public XiaomaiXijiangchongbosui modify(XiaomaiXijiangchongbosui xiaomaiXijiangchongbosui);
	public void delete(Integer id);
	public XiaomaiXijiangchongbosui getOne(Integer id);
}
