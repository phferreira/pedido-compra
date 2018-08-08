package br.edu.unoesc.pedidocompra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PedidoCompraApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(PedidoCompraApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PedidoCompraApplication.class);
	}
}
