package com.better.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.better.util.Constants;


/**
 * 系统启动参数配置
 * @author chenbin
 *
 */
public class SysListener extends HttpServlet implements ServletContextListener{
	private static final Logger logger = LoggerFactory.getLogger(SysListener.class);
	
	public void contextDestroyed(ServletContextEvent sce) {
	}

	
	public void contextInitialized(ServletContextEvent sce) {
		
		String rootpath = sce.getServletContext().getRealPath("/");
		
		if(rootpath != null) {
			rootpath = rootpath.replaceAll("\\\\", "/");
		}else{
			rootpath = "/";
		}
		
		if (!rootpath.endsWith("/")) {
			rootpath = rootpath + "/";
		}
		Constants.ROOT_PATH = rootpath;
		logger.info("rootPath" + rootpath);
		
	    Properties prop = null;   
	    try{
	    	prop = new Properties();
    	  	prop.load(new FileInputStream(rootpath + "WEB-INF/classes/config/init.properties"));   
	    }catch(IOException e){ 
	    	e.printStackTrace();   
	    }
	    String siteUrl = prop.getProperty("siteUrl");
  		if (siteUrl == null) {
  			siteUrl = "";
  		}
  		Constants.SITE_URL = siteUrl;
  		logger.info("siteUrl:" + siteUrl);
	}	
}
