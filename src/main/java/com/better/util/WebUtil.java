package com.better.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class WebUtil {

	public static boolean setSession(HttpServletRequest request, String sessionName, Object sessionValue) {
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute(sessionName, sessionValue);
		return true;
	}
	
	public static Object getSession(HttpServletRequest request, String sessionName) {
		HttpSession httpSession = request.getSession();
		return httpSession.getAttribute(sessionName);
	}
}
