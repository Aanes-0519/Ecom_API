package SampleProgram.Sampleprogram;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateOtp {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
