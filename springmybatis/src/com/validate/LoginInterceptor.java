package com.validate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.dao.UserDao;



public class LoginInterceptor implements HandlerInterceptor {



	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception {
		
		/*if(arg0.getSession().getAttribute("user")==null){
			String name = arg0.getParameter("name");
			String pwd = arg0.getParameter("pwd");
			System.out.println(name+" ******* "+pwd);
			User u = ud.findByName(name);
			if(u.getPwd().equals(pwd)){
				
				arg0.getSession().setAttribute("user", u);
				
				return true;
			}else{
				arg1.sendRedirect(arg0.getServletContext().getContextPath()+"/login.do");
				return false;
			}
		}else{
			User u =(User)arg0.getSession().getAttribute("user");
			
			System.out.println(u.getName()+" ******* "+u.getPwd());
			User u1 = ud.findByName(u.getName());
			if(u1.getPwd().equals(u.getPwd())){
				
				return true;
			}else{
				arg1.sendRedirect(arg0.getServletContext().getContextPath()+"/login.do");
				return false;
			}
		}*/
		System.out.println("lanjie");
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if(user == null) {
			req.getRequestDispatcher("/login.do").forward(req, resp);
			return false;
		} else {
			return true;
		}
	}

}
