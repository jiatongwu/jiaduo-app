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

import com.wt.jiaduo.controller.pojovalid.XiaomaiCongaibingTianjianzishengmaimiaoAddValid;
import com.wt.jiaduo.controller.pojovalid.XiaomaiCongaibingTianjianzishengmaimiaoUpdateValid;
import com.wt.jiaduo.dto.XiaomaiCongaibingTianjianzishengmaimiao;
import com.wt.jiaduo.service.XiaomaiCongaibingTianjianzishengmaimiaoService;
import com.wt.jiaduo.utils.Constants;

/**
 * 小麦条锈病早期
 * 
 * @author wu
 * 
 */
@RestController
public class XiaomaiCongaibingTianjianzishengmaimiaoController {

	@Autowired
	private XiaomaiCongaibingTianjianzishengmaimiaoService xiaomaiCongaibingTianjianzishengmaimiaoService;

	@PostMapping("/xiaomaiCongaibingTianjianzishengmaimiao")
	public Map<String, Object> saveOne(@Valid XiaomaiCongaibingTianjianzishengmaimiaoAddValid xiaomaiCongaibingTianjianzishengmaimiao,
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
			XiaomaiCongaibingTianjianzishengmaimiao target = new XiaomaiCongaibingTianjianzishengmaimiao();
			BeanUtils.copyProperties(xiaomaiCongaibingTianjianzishengmaimiao, target);
			XiaomaiCongaibingTianjianzishengmaimiao databaseXiaomaiCongaibingTianjianzishengmaimiao = xiaomaiCongaibingTianjianzishengmaimiaoService.saveOne(target);
			if (!(databaseXiaomaiCongaibingTianjianzishengmaimiao != null && databaseXiaomaiCongaibingTianjianzishengmaimiao.getId() != null)) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add(Constants.ReturnCode.服务器内部错误.getMessage());
			} else {
				result.put("data", databaseXiaomaiCongaibingTianjianzishengmaimiao.getId());
			}
		}
		return result;
	}

	@PutMapping("/xiaomaiCongaibingTianjianzishengmaimiao")
	public Map<String, Object> modify(@Valid XiaomaiCongaibingTianjianzishengmaimiaoUpdateValid xiaomaiCongaibingTianjianzishengmaimiao,
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
			XiaomaiCongaibingTianjianzishengmaimiao target = new XiaomaiCongaibingTianjianzishengmaimiao();
			BeanUtils.copyProperties(xiaomaiCongaibingTianjianzishengmaimiao, target);
			XiaomaiCongaibingTianjianzishengmaimiao databaseXiaomaiCongaibingTianjianzishengmaimiao = xiaomaiCongaibingTianjianzishengmaimiaoService.modify(target);
			if (!(databaseXiaomaiCongaibingTianjianzishengmaimiao != null && databaseXiaomaiCongaibingTianjianzishengmaimiao.getId() != null)) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add(Constants.ReturnCode.服务器内部错误.getMessage());
			} else {
				result.put("data", databaseXiaomaiCongaibingTianjianzishengmaimiao.getId());
			}
		}
		return result;
	}

	@DeleteMapping("/xiaomaiCongaibingTianjianzishengmaimiao/{id}")
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
			xiaomaiCongaibingTianjianzishengmaimiaoService.delete(Integer.parseInt(id));
		}
		return result;
	}

	@GetMapping("/xiaomaiCongaibingTianjianzishengmaimiao/{id}")
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
			result.put("data", xiaomaiCongaibingTianjianzishengmaimiaoService.getOne(Integer.parseInt(id)));
		}
		return result;
	}

	@GetMapping("/xiaomaiCongaibingTianjianzishengmaimiao")
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
					xiaomaiCongaibingTianjianzishengmaimiaoService.findAll(Integer.parseInt(pageNum), Integer.parseInt(pageSize)));
		}

		return result;
	}

}
