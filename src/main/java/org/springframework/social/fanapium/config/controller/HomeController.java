package org.springframework.social.fanapium.config.controller;

import org.springframework.social.fanapium.api.Fanapium;
import org.springframework.social.fanapium.api.model.AbstractResponseDTO;
import org.springframework.social.fanapium.api.model.UserPostInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/20/17.
 */
@Controller
public class HomeController {

    private final Fanapium fanapium;

    @Inject
    public HomeController(Fanapium fanapium) {
        this.fanapium = fanapium;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        AbstractResponseDTO<UserPostInfo> friends = fanapium.postOperations().getUserPostInfos("12");
        model.addAttribute("friends", friends);
        return "home";
    }
}
