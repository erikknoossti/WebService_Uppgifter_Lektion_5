package com.exampl.WebService_Uppgifter_Lektion_5.model;



public record User(
        Long id,
        String username,
        String password,
        boolean isEnabled
) {}
