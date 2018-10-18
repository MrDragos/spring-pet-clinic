package dramar.springframework.springpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
