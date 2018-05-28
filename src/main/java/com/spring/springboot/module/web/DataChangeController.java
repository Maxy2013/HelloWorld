ackage com.spring.springboot.module.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dataChange")
@Sfl6zz
public class DataChangeController {

    @GetMapping("/queryData")
    public String queryData(){
        return "spring boot data change!";
    }

    @GetMapping("/insertData")
    public void insertData(){

    }
}
