package com.wt.jiaduo.dao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wt.jiaduo.dao.controller.pojovalid.XiaomaiTiaoxiubingZaoqiAddValid;
import com.wt.jiaduo.dao.controller.pojovalid.XiaomaiTiaoxiubingZaoqiUpdateValid;
import com.wt.jiaduo.dto.XiaomaiTiaoxiubingZaoqi;
import com.wt.jiaduo.service.XiaomaiTiaoxiubingZaoqiService;

/**
 * 小麦条锈病早期
 * 
 * @author wu
 * 
 */
@RestController
public class XiaomaiTiaoxiubingZaoqiController {

	@Autowired
	private XiaomaiTiaoxiubingZaoqiService xiaomaiTiaoxiubingZaoqiService;

	@PostMapping("/xiaomaiTiaoxiubingZaoqi")
	public Map<String, Object> saveOne(@Valid XiaomaiTiaoxiubingZaoqiAddValid xiaomaiTiaoxiubingZaoqi,
			BindingResult bindingResult) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", 0);

		boolean hasErrors = bindingResult.hasErrors();
		if (hasErrors) {
			List<ObjectError> errors = bindingResult.getAllErrors();
			for (ObjectError error : errors) {
				if (error instanceof FieldError) {
					FieldError fieldError = (FieldError) error;
					message.add(fieldError.getField() + ":" + fieldError.getDefaultMessage());
				} else {
				}
			}
			result.put("code", 1);
		}

		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == 0) {
			XiaomaiTiaoxiubingZaoqi target = new XiaomaiTiaoxiubingZaoqi();
			BeanUtils.copyProperties(xiaomaiTiaoxiubingZaoqi, target);
			xiaomaiTiaoxiubingZaoqiService.saveOne(target);
		}

		return result;
	}

	@PutMapping("/xiaomaiTiaoxiubingZaoqi")
	public Map<String, Object> modify(@Valid XiaomaiTiaoxiubingZaoqiUpdateValid xiaomaiTiaoxiubingZaoqi,
			BindingResult bindingResult) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", 0);

		boolean hasErrors = bindingResult.hasErrors();
		if (hasErrors) {
			List<ObjectError> errors = bindingResult.getAllErrors();
			for (ObjectError error : errors) {
				if (error instanceof FieldError) {
					FieldError fieldError = (FieldError) error;
					message.add(fieldError.getField() + ":" + fieldError.getDefaultMessage());
				} else {
				}
			}
			result.put("code", 1);
		}

		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == 0) {
			XiaomaiTiaoxiubingZaoqi target = new XiaomaiTiaoxiubingZaoqi();
			BeanUtils.copyProperties(xiaomaiTiaoxiubingZaoqi, target);
			xiaomaiTiaoxiubingZaoqiService.modify(target);
		}
		return result;
	}

	@DeleteMapping("/xiaomaiTiaoxiubingZaoqi/{id}")
	public Map<String, Object> delete(@PathVariable("id") String id) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", 0);
		if (!StringUtils.isNumeric(id)) {
			result.put("code", 1);
			message.add("id必须是数字");
		}
		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == 0) {
			xiaomaiTiaoxiubingZaoqiService.delete(Integer.parseInt(id));
		}
		return result;
	}

	@GetMapping("/xiaomaiTiaoxiubingZaoqi")
	public Map<String, Object> selectAll() {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", 0);

		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == 0) {
			result.put("data", xiaomaiTiaoxiubingZaoqiService.findAll());
		}

		return result;
	}

}
