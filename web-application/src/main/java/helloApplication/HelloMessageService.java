package helloApplication;

import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

    public String getMessage() {
        return getMessage("Hello Guest!");
    }

    public String getMessage(String name) {
        return "Hello " + name;
    }
}
