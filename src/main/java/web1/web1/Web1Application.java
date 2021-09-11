package web1.web1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller

public class Web1Application {

	public static void main(String[] args) {
		SpringApplication.run(Web1Application.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String home (HttpServletRequest request){
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>Hello World </h1>");
		return  sb.toString();
	}

}
