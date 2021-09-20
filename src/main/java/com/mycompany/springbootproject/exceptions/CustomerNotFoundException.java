package com.mycompany.springbootproject.exceptions;

public class CustomerNotFoundException extends  Exception{
    CustomerNotFoundException(String message){
        super(message);
    }
}
