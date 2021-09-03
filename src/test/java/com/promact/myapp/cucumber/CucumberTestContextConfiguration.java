package com.promact.myapp.cucumber;

import com.promact.myapp.MyBookingApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = MyBookingApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
