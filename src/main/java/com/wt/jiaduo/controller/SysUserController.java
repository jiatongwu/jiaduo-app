package com.wt.jiaduo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wt.jiaduo.dto.jpa.SysUser;
import com.wt.jiaduo.service.SysUserService;
import com.wt.jiaduo.utils.Constants;

@RestController
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;

	@GetMapping("/login")
	public Map<String, Object> login(String username, String password) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == Constants.ReturnCode.成功.getCode()) {
			SysUser sysUser = sysUserService.login(username, password);
			if (sysUser != null) {
				result.put("data", sysUser);
			} else {
				result.put("code", Constants.ReturnCode.未认证.getCode());
			}
		}
		return result;
	}

}
