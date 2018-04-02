package com.wt.jiaduo.utils;

public class Constants {
	public static enum ReturnCode {
		成功(0, "执行成功"), 参数错误(1, "参数错误"), 未认证(2, "未认证"), 未授权(3, "未授权"),服务器内部错误(5, "服务器内部错误"),其他错误(4, "其他错误");
		private Integer code;
		private String message;
		ReturnCode(Integer code, String message) {
			this.code = code;
			this.message = message;
		}
		public Integer getCode() {
			return this.code;
		}
		public String getMessage() {
			return this.message;
		}
	}
}
