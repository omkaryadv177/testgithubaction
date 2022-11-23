package com.globallogic.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.globallogic.SpringDemo.DAO.StudentDao;
import com.globallogic.SpringDemo.POJO.Student;

public class App 
{
    public static void main( String[] args )
    {
      
    ApplicationContext context= new ClassPathXmlApplicationContext("com/globallogic/SpringDemo/config.xml");
            StudentDao studentDao= (StudentDao) context.getBean("dao", StudentDao.class);
            Student student= new Student();
            student.setId(2);
            student.setCity("Bangalore");
            student.setName("Utkarsh Verma");
            
            int result =studentDao.insert(student);
            
         System.out.println("no of record entered" + result);     
              
              
  
    }
}
