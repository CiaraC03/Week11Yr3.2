package ie.atu.registrationservicewk4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RegistrationController {
    private UserDetails userDetails;

    @Autowired
    public RegistrationController(UserDetails userDetails)
    {
        this.userDetails = userDetails;
    }
    @PostMapping("/confirm-registration")
    public confirmRegistration(@RequestBody UserDetails userDetails)
    {
        //process registration
        return String "Message Confirmed";//return confirmation message
    }
}
