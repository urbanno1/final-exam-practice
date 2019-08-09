package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.controller;

import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.util.ControllerLinkHelpers;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.util.ViewLinkHelpers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping(value= ControllerLinkHelpers.HOME_INDEX_URL)
    public String displayHome(Model model) {
        model.addAttribute("page_links", ViewLinkHelpers.pageLinks);
        return ControllerLinkHelpers.HOME_INDEX_VIEW;
    }

}
