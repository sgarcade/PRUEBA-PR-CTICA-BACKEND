package com.example.customerservice.controller;

import com.example.customerservice.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController
{
    //URL PARA PRUEBAS: http://localhost:8090/api/customers/C/23445322
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("/{type}/{document}")
    public ResponseEntity<?> getCustomer(
            @PathVariable("type") String type,
            @PathVariable("document") String document) 
    {

        logger.info("Solicitud recibida: Tipo de documento: {}, Número: {}", type, document);

        if (!type.equals("C") && !type.equals("P")) {
            logger.warn("Tipo de documento inválido: {}", type);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Tipo de documento inválido.");
        }

        if (type.equals("C") && document.equals("23445322")) {
            Customer customer = new Customer("Juan", "Carlos", "Pérez", "Gómez", "123456789", "Calle 123", "Bogotá");
            logger.info("Cliente encontrado: {}", customer.getFirstName());
            return ResponseEntity.ok(customer);
        } else {
            logger.error("Cliente no encontrado con documento: {}", document);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado.");
        }
    }
}
