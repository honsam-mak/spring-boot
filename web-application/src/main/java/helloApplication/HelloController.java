package helloApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {
    
    @Autowired
    private HelloMessageService helloService;

    @RequestMapping("/")
    public String index(@RequestParam("name") String name) {
        return helloService.getMessage(name);
    }
    
}
