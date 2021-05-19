package toolkits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import toolkits.clients.DemoClient;
import toolkits.messages.DemoRequest;
import toolkits.messages.DemoResponse;

/**
 * @author dominiczhu
 * @version 1.0
 * @title DemoService
 * @date 2021/5/18 下午8:34
 */
@RestController
public class DemoService {

    @Autowired
    private DemoClient demoClient;

    @RequestMapping(value = "hello", method = {RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
    public DemoResponse hello(@RequestBody DemoRequest req) {
        DemoResponse resp = new DemoResponse();
        System.out.println(req);
        resp.setI(req.getI());
        return resp;
    }

    @RequestMapping(value = "post_client", method = {RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
    public String postClient(@RequestBody DemoRequest req) {
        return demoClient.post(req);
    }
}
