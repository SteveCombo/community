package com.communiity.conmunity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommunityController {

    @GetMapping("/community")
    public String community(){
        return "community_index";
    }
}