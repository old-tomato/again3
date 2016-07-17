package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Created by zkl on 2016/7/16.
 */
@Controller
@RequestMapping("/view")
public class LoginController {

    @RequestMapping(value = "/login")
    public String loginPage() {
        Logger logger = Logger.getLogger("zkl");
        logger.info("login!!!!!!!!!!!!!!!");
        return "jsp/login";
    }

    @RequestMapping(value = "/loginCheck" , method = RequestMethod.POST)
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
        String password = loginCommand.getPassword();
        System.out.printf("password ==> " + password);
        return new ModelAndView("main");
    }
}
