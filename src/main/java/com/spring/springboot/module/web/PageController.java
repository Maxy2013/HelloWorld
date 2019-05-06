package com.spring.springboot.module.web;

import com.spring.springboot.common.Page;
import com.spring.springboot.common.practise.Practise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class PageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PageController.class);

    @PostMapping("/vote")
    public void vote(@RequestBody Page<Practise> page){
        String name = page.getParams().getName();
        LOGGER.debug("getTheName -->>{}", name);
    }
}
