package com.wt.jiaduo.controller;

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

import com.wt.jiaduo.controller.pojovalid.XiaomaiTiaoxiubingYuexiaAddValid;
import com.wt.jiaduo.controller.pojovalid.XiaomaiTiaoxiubingYuexiaUpdateValid;
import com.wt.jiaduo.dto.jpa.XiaomaiTiaoxiubingYuexia;
import com.wt.jiaduo.service.XiaomaiTiaoxiubingYuexiaService;
import com.wt.jiaduo.utils.Constants;

/**
 * 小麦条锈病早期
 * 
 * @author wu
 * 
 */
@RestController
public class XiaomaiTiaoxiubingYuexiaController {

	@Autowired
	private XiaomaiTiaoxiubingYuexiaService xiaomaiTiaoxiubingYuexiaService;

	@PostMapping("/xiaomaiTiaoxiubingYuexia")
	public Map<String, Object> saveOne(@Valid XiaomaiTiaoxiubingYuexiaAddValid xiaomaiTiaoxiubingYuexia,
			BindingResult bindingResult) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

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
			result.put("code", Constants.ReturnCode.参数错误.getCode());
		}

		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == Constants.ReturnCode.成功.getCode()) {
			XiaomaiTiaoxiubingYuexia target = new XiaomaiTiaoxiubingYuexia();
			BeanUtils.copyProperties(xiaomaiTiaoxiubingYuexia, target);
			XiaomaiTiaoxiubingYuexia databaseXiaomaiTiaoxiubingYuexia = xiaomaiTiaoxiubingYuexiaService.saveOne(target);
			if (!(databaseXiaomaiTiaoxiubingYuexia != null && databaseXiaomaiTiaoxiubingYuexia.getId() != null)) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add(Constants.ReturnCode.服务器内部错误.getMessage());
			} else {
				result.put("data", databaseXiaomaiTiaoxiubingYuexia.getId());
			}
		}
		return result;
	}

	@PutMapping("/xiaomaiTiaoxiubingYuexia")
	public Map<String, Object> modify(@Valid XiaomaiTiaoxiubingYuexiaUpdateValid xiaomaiTiaoxiubingYuexia,
			BindingResult bindingResult) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

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
			result.put("code", Constants.ReturnCode.参数错误.getCode());
		}

		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == Constants.ReturnCode.成功.getCode()) {
			XiaomaiTiaoxiubingYuexia target = new XiaomaiTiaoxiubingYuexia();
			BeanUtils.copyProperties(xiaomaiTiaoxiubingYuexia, target);
			XiaomaiTiaoxiubingYuexia databaseXiaomaiTiaoxiubingYuexia = xiaomaiTiaoxiubingYuexiaService.modify(target);
			if (!(databaseXiaomaiTiaoxiubingYuexia != null && databaseXiaomaiTiaoxiubingYuexia.getId() != null)) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add(Constants.ReturnCode.服务器内部错误.getMessage());
			} else {
				result.put("data", databaseXiaomaiTiaoxiubingYuexia.getId());
			}
		}
		return result;
	}

	@DeleteMapping("/xiaomaiTiaoxiubingYuexia/{id}")
	public Map<String, Object> delete(@PathVariable("id") String id) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		if (!StringUtils.isNumeric(id)) {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("id必须是数字");
		}
		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == Constants.ReturnCode.成功.getCode()) {
			xiaomaiTiaoxiubingYuexiaService.delete(Integer.parseInt(id));
		}
		return result;
	}

	@GetMapping("/xiaomaiTiaoxiubingYuexia/{id}")
	public Map<String, Object> getOne(@PathVariable("id") String id) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		if (!StringUtils.isNumeric(id)) {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("id必须是数字");
		}
		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == Constants.ReturnCode.成功.getCode()) {
			result.put("data", xiaomaiTiaoxiubingYuexiaService.getOne(Integer.parseInt(id)));
		}
		return result;
	}

	@GetMapping("/xiaomaiTiaoxiubingYuexia")
	public Map<String, Object> selectAll(String pageNum, String pageSize) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

		if ((!StringUtils.isNumeric(pageNum)) || (!StringUtils.isNumeric(pageSize))) {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("pageNum和pageSize必须是数字");
		}
		// 只有参数正确时，才去查询数据库
		int code = (Integer) result.get("code");
		if (code == Constants.ReturnCode.成功.getCode()) {
			result.put("data",
					xiaomaiTiaoxiubingYuexiaService.findAll(Integer.parseInt(pageNum), Integer.parseInt(pageSize)));
		}

		return result;
	}

}
