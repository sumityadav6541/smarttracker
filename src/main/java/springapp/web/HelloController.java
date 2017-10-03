/*
 * Copyright by sumit yadav
 */

package springapp.web;

import java.util.Collections;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sumit Yadav on 16/09/17.
 */
@Controller
@RequestMapping(produces = "application/json")
public class HelloController {

  private final Log logger = LogFactory.getLog(getClass());

  @RequestMapping(value = "/api", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public Map<String,String> handleRequest(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse) throws Exception {
    logger.info("Returning Hello view !");
    return Collections.singletonMap("key1", "value1");
  }
}
