/*
 * Copyright by sumit yadav
 */

package springapp.web;

import java.util.Collections;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sumit Yadav on 16/09/17.
 */
@RestController
public class HelloController {

  @RequestMapping(value = "/api", method = RequestMethod.GET)
  public Map<String, String> handleRequest() throws Exception {
    return Collections.singletonMap("key1111", "value1111");
  }
}
