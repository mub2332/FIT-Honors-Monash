package com.fit3171.allocation.models;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public class AllocateProject {




    @RequestMapping(value = "/allocate", method = RequestMethod.POST)
    public String allocateProject(@RequestParam("studentID") String studentID, @Valid @ModelAttribute("selectedProject") Project project) {

    }
}
