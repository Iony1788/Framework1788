
package etu1788.framework.servlet;
import java.io.*;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;



public class FrontServlet extends HttpServlet {

   public String getUrl(String url){
      String[] meth=url.split("/");
      return meth[2];
  }
   public void processRequest(HttpServletRequest request,HttpServletResponse res)
         throws ServletException, IOException {
            res.setContentType("text/html;charset=UTF-8");
           
            try(PrintWriter out= res.getWriter()){

                 
                  String url=request.getRequestURI();
                  String demande=this.getUrl(url);
                  out.println("url:"+ demande);
            }

         }
public void doGet(HttpServletRequest request , HttpServletResponse res)
   throws ServletException,IOException {
      processRequest(request, res);
   }

public void doPost(HttpServletRequest request , HttpServletResponse res)
   throws ServletException,IOException {
      processRequest(request, res);
   }
}
