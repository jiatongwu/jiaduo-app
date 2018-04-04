package com.wt.jiaduo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wt.jiaduo.dao.MalingshuShengyuqiDao;
import com.wt.jiaduo.utils.Constants;

/**
马铃薯生育期
 * 
 * @author wu
 * 
 */
@RestController
public class MalingshuShengyuqiController {

	@Autowired
	private MalingshuShengyuqiDao malingshuShengyuqiDao;

	

	@GetMapping("/malingshuShengyuqi")
	public Map<String, Object> selectAll() {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

		
		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == Constants.ReturnCode.成功.getCode()) {
			result.put("data",
					malingshuShengyuqiDao.findAll());
		}

		return result;
	}

}
