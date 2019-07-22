package fr.xebia.service.client;

        import org.springframework.cloud.openfeign.FeignClient;
        import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("message-service")
public interface MessageServiceClient {

    @RequestMapping("/message")
    String getMessage();

}
