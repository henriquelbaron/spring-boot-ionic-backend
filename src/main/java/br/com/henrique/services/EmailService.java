package br.com.henrique.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.henrique.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
