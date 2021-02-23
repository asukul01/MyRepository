package org.demo.spring;

import java.util.List;

import org.demo.spring.config.AppConfig;
import org.demo.spring.dao.AppDAOImpl;
import org.demo.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("index");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AppDAOImpl dao = context.getBean("DAOBean", AppDAOImpl.class);
		List<User> users = dao.listUsers();
		model.addObject("users", users);
		// System.out.println(users.toString());

		context.close();
		return model;
	}

	@RequestMapping("/addUser")
	public String addUser(Model model, User user, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("user", user);
			return "addUser";
		} else {
			if (user.getUserName() != null && user.getEmail() != null) {
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

				AppDAOImpl dao = context.getBean("DAOBean", AppDAOImpl.class);
				dao.addUser(user);
				// System.out.println(users.toString());

				context.close();

				System.out.println("forward");
				return "forward:/";
			} else {
				System.out.println("adduser");
				return "addUser";
			}
		}
	}
}
