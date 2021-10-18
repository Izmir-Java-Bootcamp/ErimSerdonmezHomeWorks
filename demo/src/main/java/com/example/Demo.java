package com.example;

import java.util.List;
import java.util.Scanner;

import com.example.service.DiscountService;
import com.example.service.InputService;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;


/** >@Service
 *  @Component
 *  @Bean
 */


 @Component
 @RequiredArgsConstructor
public class Demo implements CommandLineRunner {
    private final Scanner scanner;
    private final InputService service;
    private final List<DiscountService> discountServices;

    @Override
    public void run(String... args) throws Exception{
        
        System.out.println("Lütfen input Giriniz: ");
        String input = scanner.nextLine();
        System.out.println("Input: " + input);

        inputTaker();
        service.testInput();
        

        discountServices.forEach(DiscountService::discount);

    }
    
    private void inputTaker(){
        System.out.println("Input 2: " );
        String input = scanner.nextLine();
        System.out.println("Input 2: " + input);
    }
    
}
