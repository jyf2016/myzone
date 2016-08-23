package com.myzone.config;

import com.jfinal.core.JFinal;

/**   
 * @Title: StartServer.java 
 * @Package com.myzone.config 
 * @Description: 手动启动服务器
 * @author jiangyf   
 * @date 2016年1月9日 下午9:00:40 
 * @version V1.0   
 */
public class StartServer {
	/** 
	* @Description: 运行此 main方法可以启动项目，
	* 此main方法可以放置在任意的Class类定义中（建议使用 JFinal手册推荐的方式启动项目）
	* @param args 
	*/
	public static void main(String[] args) {
		JFinal.start("WebRoot", 8080, "/", 5);
	}

}
