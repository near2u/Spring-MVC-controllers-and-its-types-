package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.xml.DefaultNamespaceHandlerResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Inb the Controller");
		String name=req.getParameter("name");
		
		Map map = new HashMap();
		map.put("msg", "Hello "+name);
		
		
		
		ModelAndView mav = new ModelAndView("success", map);
		
		
		
		return mav;
	}

	

}
