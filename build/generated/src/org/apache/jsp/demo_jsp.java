package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>Confirm Password validation using javascript</title>\n");
      out.write("\t<style>\n");
      out.write("\t\tbody {\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\tbackground-color: rgb(50, 57, 78);\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tjustify-content: center;\n");
      out.write("\t\t\talign-items: center;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.main {\n");
      out.write("\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tjustify-content: center;\n");
      out.write("\t\t\talign-items: center;\n");
      out.write("\t\t\tflex-direction: column;\n");
      out.write("\t\t\tbackground-color: rgb(34, 34, 34);\n");
      out.write("\t\t\theight: 400px;\n");
      out.write("\t\t\twidth: 300px;\n");
      out.write("\t\t\tmargin-top: 15%;\n");
      out.write("\t\t\tborder-radius: 10px;\n");
      out.write("\t\t\tbox-shadow: 2px 4px 6px rgb(0, 0, 0);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.pass {\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tflex-direction: column;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.image h2 {\n");
      out.write("\t\t\tcolor: rgb(2, 149, 27);\n");
      out.write("\t\t\tfont-size: 30px;\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t\tmargin-bottom: 50px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.username input,\n");
      out.write("\t\t.pass input {\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t\tmargin-bottom: 20px;\n");
      out.write("\t\t\theight: 30px;\n");
      out.write("\t\t\tborder-radius: 100px;\n");
      out.write("\t\t\tborder: none;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\toutline: none;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.submit_btn {\n");
      out.write("\t\t\theight: 30px;\n");
      out.write("\t\t\twidth: 80px;\n");
      out.write("\t\t\tborder-radius: 100px;\n");
      out.write("\t\t\tborder: none;\n");
      out.write("\t\t\toutline: none;\n");
      out.write("\t\t\tbackground-color: rgb(0, 179, 95);\n");
      out.write("\t\t\tmargin-top: 15px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.submit_btn:hover {\n");
      out.write("\t\t\tbackground-color: rgba(0, 179, 95, 0.596);\n");
      out.write("\t\t\tcolor: rgb(14, 14, 14);\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"image\">\n");
      out.write("\t\t\t<h2>GeeksforGeeks</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"username\">\n");
      out.write("\t\t\t<input type=\"text\"\n");
      out.write("\t\t\t\tname=\"username\"\n");
      out.write("\t\t\t\tplaceholder=\"Dummyuser\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"pass\">\n");
      out.write("\t\t\t<input id=\"pass\"\n");
      out.write("\t\t\t\ttype=\"password\"\n");
      out.write("\t\t\t\tname=\"pass\"\n");
      out.write("\t\t\t\tplaceholder=\"Enter Password\"\n");
      out.write("\t\t\t\trequired\"\">\n");
      out.write("\t\t\t<input id=\"confirm_pass\"\n");
      out.write("\t\t\t\ttype=\"password\"\n");
      out.write("\t\t\t\tname=\"confirm_pass\"\n");
      out.write("\t\t\t\tplaceholder=\"Confirm Password\" required\n");
      out.write("\t\t\t\tonkeyup=\"validate_password()\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<span id=\"wrong_pass_alert\"></span>\n");
      out.write("\t\t<div class=\"buttons\">\n");
      out.write("\t\t\t<button id=\"create\"\n");
      out.write("\t\t\t\t\tclass=\"submit_btn\"\n");
      out.write("\t\t\t\t\tonclick=\"wrong_pass_alert()\">\n");
      out.write("\t\t\t\tSubmit\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction validate_password() {\n");
      out.write("\n");
      out.write("\t\t\tvar pass = document.getElementById('pass').value;\n");
      out.write("\t\t\tvar confirm_pass = document.getElementById('confirm_pass').value;\n");
      out.write("\t\t\tif (pass != confirm_pass) {\n");
      out.write("\t\t\t\tdocument.getElementById('wrong_pass_alert').style.color = 'red';\n");
      out.write("\t\t\t\tdocument.getElementById('wrong_pass_alert').innerHTML\n");
      out.write("\t\t\t\t\t= '☒ Use same password';\n");
      out.write("\t\t\t\tdocument.getElementById('create').disabled = true;\n");
      out.write("\t\t\t\tdocument.getElementById('create').style.opacity = (0.4);\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tdocument.getElementById('wrong_pass_alert').style.color = 'green';\n");
      out.write("\t\t\t\tdocument.getElementById('wrong_pass_alert').innerHTML =\n");
      out.write("\t\t\t\t\t'🗹 Password Matched';\n");
      out.write("\t\t\t\tdocument.getElementById('create').disabled = false;\n");
      out.write("\t\t\t\tdocument.getElementById('create').style.opacity = (1);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction wrong_pass_alert() {\n");
      out.write("\t\t\tif (document.getElementById('pass').value != \"\" &&\n");
      out.write("\t\t\t\tdocument.getElementById('confirm_pass').value != \"\") {\n");
      out.write("\t\t\t\talert(\"Your response is submitted\");\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\talert(\"Please fill all the fields\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
