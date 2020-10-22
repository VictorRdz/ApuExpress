
package com.apuexpress.controller;


import com.apuexpress.database.JdbcPreview;
import com.apuexpress.database.Preview;
import java.sql.Connection;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {
    @Autowired
    private DataSource dataSource;    
    
    
    @RequestMapping("/index.htm")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
    
    @RequestMapping("/about.htm")
    public ModelAndView about() {
        return new ModelAndView("about");
    }
    
    @RequestMapping("/americano.htm")
    public ModelAndView americano() {
        return new ModelAndView("americano");
    }
    
    @RequestMapping("/boxeo.htm")
    public ModelAndView boxeo() {
        return new ModelAndView("boxeo");
    }
    
    @RequestMapping("/deposit.htm")
    public ModelAndView deposit() {
        return new ModelAndView("deposit");
    }
    
    @RequestMapping("/user.htm")
    public ModelAndView user() {
        return new ModelAndView("user");
    }
    
    @RequestMapping("/withdraw.htm")
    public ModelAndView withdraw() {
        return new ModelAndView("withdraw");
    }
    
    @RequestMapping("/futbol.htm")
    public ModelAndView futbol() {
        ModelAndView model = new ModelAndView("futbol");
        
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            
            model.addObject("partidos", JdbcPreview.GetPreview(0, 1, conn));
            conn.close();
        } catch(Exception e) {
            System.out.println("Error al crear la conexión.");
        }
        
        
        return model;
    }
    
}
