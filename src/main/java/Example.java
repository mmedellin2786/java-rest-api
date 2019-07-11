import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@EnableAutoConfiguration
public class Example {
        @RequestMapping(method=RequestMethod.POST, value="/")
        String newRecurso(@RequestParam String name, @RequestParam String skills) {
                            Recurso recurso = new Recurso(name, skills);
                            System.out.println(recurso.getName());
                List<Recurso> listRec = new ArrayList<Recurso>();
                listRec.add(recurso);
                                return "Inserted..." + recurso.getName();

        }
        public static void main(String[] args) throws Exception {
                SpringApplication.run(Example.class, args);
        }
}
