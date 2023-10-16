package ie.atu.registrationservicewk4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "notification-service", url = "http://localhost:8082")
public interface NotificationServiceClient {
    @PostMapping("/notifications")
    String extraDetails(@RequestBody UserDetails userDetails);


}
