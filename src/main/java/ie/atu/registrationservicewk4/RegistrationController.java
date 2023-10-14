package ie.atu.registrationservicewk4;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {



    @PostMapping("/confirm)
    public confirmRegistration(@RequestBody UserDetails userDetails) {
        //process registration
        String responseMessage = String.format("Received details for %s with email %s",
                userDetails.getName(), userDetails.getEmail());
        return responseMessage;
    }
}
