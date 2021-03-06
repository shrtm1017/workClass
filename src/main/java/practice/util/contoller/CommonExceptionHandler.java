package practice.util.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(CommonExceptionHandler.class);
	@ExceptionHandler({ArithmeticException.class})
	public String handleException(){
		logger.debug("ArithmeticException");
		return "/error/error";
	}


}
