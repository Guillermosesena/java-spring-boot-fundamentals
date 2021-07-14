package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

//Es un ocmponnete muy general
@Component
public class ComponentTwoImplement implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente dos");
    }
}
