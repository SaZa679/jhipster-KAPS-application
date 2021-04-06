package com.kaps.myapp.cucumber;

import com.kaps.myapp.JhipsterKapsApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterKapsApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
