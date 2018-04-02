package com.wt.jiaduo.codegenerate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * hibernate代码生成的dto id没有sqeuence
 * 
 * @author wu
 *
 */
public class JpaDaoCodeGenerate {
	public static void main(String[] args) throws IOException {
		String targetFolderPathString="/Users/wu/eclipse-workspace/jiaduo/src/main/java/com/wt/jiaduo/dao";
		String[] classNames = { "MalingshuWanyibingbingqingxitong", "MalingshuWanyibingfabingqingkuang",
				"MalingshuWanyibingzhongxibingzhuxt", "SysPermission", "SysRole", "SysRolePermission",
				"SysUser", "SysUserRole", "XiaomaiBaifenbing",
				"XiaomaiChimeibing", "XiaomaiCongaibingBingqingpucha", "XiaomaiCongaibingHuifeishichongkoumidu",
				"XiaomaiCongaibingHuifeishizirandaidulv", "XiaomaiCongaibingTianjianzishengmaimiao",
				"XiaomaiCongaibingYoucepufabinglv", "XiaomaiMaizhizhudatian", "XiaomaiSanheisuibing",
				"XiaomaiTiaoxiubingHouqi", "XiaomaiTiaoxiubingYuexia",  "XiaomaiWenkubing",
				"XiaomaiXijiangchongbosui", "XiaomaiXijiangchongtaotu", "XiaomaiYachongDatian", "XiaomaiYexiubing" };
		String readFileTemplatePathString=targetFolderPathString+"/XiaomaiTiaoxiubingZaoqiDao.java";
		for(String className:classNames) {
			String targetFileNamePathString=targetFolderPathString+"/"+className+"Dao.java";
			BufferedReader br = null;
			BufferedWriter bw = null;
			try {
				br = new BufferedReader(new FileReader(readFileTemplatePathString));
				bw = new BufferedWriter(new FileWriter(targetFileNamePathString));
				String line;
				while ((line = br.readLine()) != null) {
					line=line.replace("XiaomaiTiaoxiubingZaoqi", className);
					line=line.replace("xiaomaiTiaoxiubingZaoqi", String.valueOf(className.charAt(0)).toLowerCase().charAt(0)+className.substring(1, className.length()));
					bw.write(line + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
				return;
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					//
				}
				try {
					if (bw != null)
						bw.close();
				} catch (IOException e) {
					//
				}
			}
			
		}
		
	}// main End

	
	

}
