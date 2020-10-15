package herokutech.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}
