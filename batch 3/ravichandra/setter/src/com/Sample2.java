package com;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Sample2 {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("web.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Sample1 q=(Sample1)factory.getBean("q");  
    q.displayInfo();  
      
}  
}  