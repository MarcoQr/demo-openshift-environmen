package mx.com.monex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoRest {


    @Autowired
    private RestTemplateService restTemplateService;

    @GetMapping("/alive")
    ResponseEntity<?> test(){
        return  ResponseEntity.ok("Hello world");
    }
}
