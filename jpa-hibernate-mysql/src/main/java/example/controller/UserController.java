package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import example.domain.User;
import example.repository.UserDao;

@Controller
public class UserController {

	  @RequestMapping("/get-by-id")
	  @ResponseBody
	  public String getById(long id) {
	    String name;
	    try {
	      User user = userDao.findById(id);
	      name = String.valueOf(user.getName());
	    }
	    catch (Exception ex) {
	      return "User not found";
	    }
	    return "The user name is: " + name;
	  }

	  @Autowired
	  private UserDao userDao;
}
