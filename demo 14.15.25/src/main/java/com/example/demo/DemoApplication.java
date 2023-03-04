package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping("/ping")
//	public PingResponse ping() {
//		return new PingResponse("pong");
//
//	}
//
//	private static class PingResponse {
//		private String message;
//
//
//		public PingResponse(String message) {
//			this.message = message;
//
//		}
//
//		public String getMessage() {
//			return message;
//		}
//
//		public void setMessage(String message) {
//			this.message = message;
//		}
//	}




}


