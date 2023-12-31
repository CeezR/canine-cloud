package caninecloud.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MainController {
    @GetMapping
    public ResponseEntity<String> getString() {
        return ResponseEntity.ok("Hello World");
    }
}
