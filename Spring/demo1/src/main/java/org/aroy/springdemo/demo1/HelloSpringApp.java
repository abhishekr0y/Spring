package org.aroy.springdemo.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String args[]){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve the bean from the Spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());        

        // close the Context
        context.close();


    }
    
}
