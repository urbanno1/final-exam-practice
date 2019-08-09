package edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.controller;

import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.model.Product;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.service.ProductService;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.util.ControllerLinkHelpers;
import edu.mum.cs.cs425.esuppliermgmt.esuppliermgmt.util.ViewLinkHelpers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping(value = ControllerLinkHelpers.PRODUCT_LIST_URL)
    public ModelAndView displayCustomerList(@RequestParam(defaultValue = "0") int pageNo) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("products", service.getProductsList(pageNo));
        modelAndView.addObject("currentPage", pageNo);
        modelAndView.addObject("page_links", ViewLinkHelpers.pageLinks);
        modelAndView.setViewName(ControllerLinkHelpers.PRODUCT_LIST_VIEW);

        return modelAndView;
    }

    @RequestMapping(value = ControllerLinkHelpers.PRODUCT_ADD_URL)
    public String displayAddNewProduct(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("suppliers", service.getSupplierList());
        model.addAttribute("page_links", ViewLinkHelpers.pageLinks);
        return ControllerLinkHelpers.PRODUCT_ADD_VIEW;
    }


    @PostMapping(value = ControllerLinkHelpers.PRODUCT_ADD_URL)
    public String addNewCustomer(@Valid @ModelAttribute("product") Product product,
                                 BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("page_links", ViewLinkHelpers.pageLinks);
            return  ControllerLinkHelpers.PRODUCT_ADD_VIEW;
        } else {
            product = service.saveProduct(product);
            return "redirect:" + ControllerLinkHelpers.PRODUCT_LIST_URL;
        }
    }


}
