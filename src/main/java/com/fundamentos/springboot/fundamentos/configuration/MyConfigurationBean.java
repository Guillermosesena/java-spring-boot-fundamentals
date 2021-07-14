package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    //devuelve nuestro bean
    @Bean
    public MyBean beanOperation(){
        //Se configura para modificar la implementación
        return new MyBean2Implement();
        //return new MyBeanImplement();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        //Se configura para modificar la implementación
        return new MyBeanWithDependencyImplement(myOperation);
    }

}
