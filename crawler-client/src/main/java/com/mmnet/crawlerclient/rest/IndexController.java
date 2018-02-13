package com.mmnet.crawlerclient.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/client")
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        Integer denominator = 0;
        Integer numerator = 10;
        Integer result = numerator / denominator;
        return result.toString();
    }

}
