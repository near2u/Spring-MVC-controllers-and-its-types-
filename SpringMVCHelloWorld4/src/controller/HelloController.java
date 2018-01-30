package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;



public class HelloController extends ParameterizableViewController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String name= request.getParameter("name");
		
		
		
		Map map = new HashMap();
		map.put("msg","Hello by using controller class name uurl handler and parameterizable view name controller... "+name );
		
		ModelAndView mav = new ModelAndView(getViewName(), map);
		
		
		return mav;
	}
	
}
