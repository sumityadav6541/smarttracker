/*
 * Copyright by sumit yadav
 */

package springapp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Created by Sumit Yadav on 16/09/17.
 */
public class HelloController implements Controller {

  protected final Log logger = LogFactory.getLog(getClass());

  @Override
  public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse) throws Exception {
    logger.info("Returning Hello view !");

    return new ModelAndView("hello.jsp");
  }
}
