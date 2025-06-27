package med.voll.api_voll_med.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*Controller de una Rest*/
@RequestMapping("/hello") /*es como el canal en donde va a estar escuchando,
 es el path que le corresponde*/
public class HelloController {

    @GetMapping/*Este metodo v a estar respondiendo al verdo GetMApping*/
    public String hello(){
        return "hello Rox =)!!!!!";
    }
}
