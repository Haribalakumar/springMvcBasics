/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-04-25 11:49:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Employee Details Form</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2>Employee Details Form</h2>\r\n");
      out.write("        <form action=\"/demo/send\" method=\"get\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"name\">Name:</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"age\">Age:</label>\r\n");
      out.write("                <input type=\"number\" class=\"form-control\" id=\"age\" name=\"age\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"gender\">Gender:</label><br>\r\n");
      out.write("                <div class=\"form-check-inline\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                        <input type=\"radio\" class=\"form-check-input\" id=\"male\" name=\"gender\" value=\"male\">Male\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-check-inline\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                        <input type=\"radio\" class=\"form-check-input\" id=\"female\" name=\"gender\" value=\"female\">Female\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-check-inline\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                        <input type=\"radio\" class=\"form-check-input\" id=\"other\" name=\"gender\" value=\"other\">Other\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"location\">Location:</label>\r\n");
      out.write("                <select class=\"form-control\" id=\"location\" name=\"location\">\r\n");
      out.write("                    <option value=\"newyork\">New York</option>\r\n");
      out.write("                    <option value=\"losangeles\">Los Angeles</option>\r\n");
      out.write("                    <option value=\"chicago\">Chicago</option>\r\n");
      out.write("                    <option value=\"houston\">Houston</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"email\">Email:</label>\r\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"password\">Password:</label>\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"phonenumber\">Phone Number:</label>\r\n");
      out.write("                <input type=\"tel\" class=\"form-control\" id=\"phonenumber\" name=\"phonenumber\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\" >Submit</button>\r\n");
      out.write("        </form>\r\n");
      out.write("        <div id=\"employee-details\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("       \r\n");
      out.write("       alert(\"hi\");\r\n");
      out.write("// function getallDdetails() {\r\n");
      out.write("//     const uri = \"http://localhost:9090/send\";\r\n");
      out.write("\r\n");
      out.write("//     var name = document.getElementById(\"name\").value;\r\n");
      out.write("//     var age = document.getElementById(\"age\").value;\r\n");
      out.write("//     var location = document.getElementById(\"location\").value;\r\n");
      out.write("//     var email = document.getElementById(\"email\").value;\r\n");
      out.write("//     var password = document.getElementById(\"password\").value;\r\n");
      out.write("//     var phonenumber = document.getElementById(\"phonenumber\").value;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//     var xhttp = new XMLHttpRequest();\r\n");
      out.write("//     xhttp.open(\"GET\", uri, true);\r\n");
      out.write("//     xhttp.setRequestHeader(\"Content-type\", \"application/json\");\r\n");
      out.write("//     xhttp.onreadystatechange = function () {\r\n");
      out.write("//         if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("//             console.log('File uploaded successfully');\r\n");
      out.write("//         }\r\n");
      out.write("//     }\r\n");
      out.write("//     console.log(name + \" \" + password + \" \" + phonenumber);\r\n");
      out.write("//     alert(name + \" \" + password + \" \" + phonenumber);\r\n");
      out.write("// };\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// function getallDdetails() {\r\n");
      out.write("//     var name = $(\"#name\").val();\r\n");
      out.write("//     var age = $(\"#age\").val();\r\n");
      out.write("//     var gender = $(\"input[name='gender']:checked\").val();\r\n");
      out.write("//     var location = $(\"#location\").val();\r\n");
      out.write("//     var email = $(\"#email\").val();\r\n");
      out.write("//     var password = $(\"#password\").val();\r\n");
      out.write("//     var phonenumber = $(\"#phonenumber\").val();\r\n");
      out.write("\r\n");
      out.write("//     $.get(\"/demo/send\", {\r\n");
      out.write("//         name: name,\r\n");
      out.write("//         age: age,\r\n");
      out.write("//         gender: gender,\r\n");
      out.write("//         location: location,\r\n");
      out.write("//         email: email,\r\n");
      out.write("//         password: password,\r\n");
      out.write("//         phonenumber: phonenumber\r\n");
      out.write("//     }, function (response) {\r\n");
      out.write("//         $(\"#name-show\").text(response.name);\r\n");
      out.write("//         $(\"#age-show\").text(response.age);\r\n");
      out.write("//         $(\"#gender-show\").text(response.gender);\r\n");
      out.write("//         $(\"#location-show\").text(response.location);\r\n");
      out.write("//         $(\"#email-show\").text(response.email);\r\n");
      out.write("//         $(\"#password-show\").text(response.password);\r\n");
      out.write("//         $(\"#phonenumber-show\").text(response.phonenumber);\r\n");
      out.write("//     });\r\n");
      out.write("// alert(name);\r\n");
      out.write("// console.log(name + \" \" +age);\r\n");
      out.write("// }\r\n");
      out.write("\r\n");
      out.write("function getAllDetails() {\r\n");
      out.write("  const name = document.querySelector(\"#name\").value;\r\n");
      out.write("  const age = document.querySelector(\"#age\").value;\r\n");
      out.write("  const gender = document.querySelector(\"input[name='gender']:checked\" ).value;\r\n");
      out.write("  const location = document.querySelector(\"#location\").value;\r\n");
      out.write("  const email = document.querySelector(\"#email\").value;\r\n");
      out.write("  const password = document.querySelector(\"#password\").value;\r\n");
      out.write("  const phoneNumber = document.querySelector(\"#phonenumber\").value;\r\n");
      out.write("\r\n");
      out.write("  fetch(\"/demo/send\", {\r\n");
      out.write("    method: \"GET\",\r\n");
      out.write("    headers: {\r\n");
      out.write("      \"Content-Type\": \"application/json\",\r\n");
      out.write("    },\r\n");
      out.write("    body: JSON.stringify({\r\n");
      out.write("      name,\r\n");
      out.write("      age,\r\n");
      out.write("      gender,\r\n");
      out.write("      location,\r\n");
      out.write("      email,\r\n");
      out.write("      password,\r\n");
      out.write("      phoneNumber,\r\n");
      out.write("    }),\r\n");
      out.write("  })\r\n");
      out.write("    .then((response) => response.json())\r\n");
      out.write("    .then((data) => {\r\n");
      out.write("      document.querySelector(\"#name-show\").textContent = data.name;\r\n");
      out.write("      document.querySelector(\"#age-show\").textContent = data.age;\r\n");
      out.write("      document.querySelector(\"#gender-show\").textContent = data.gender;\r\n");
      out.write("      document.querySelector(\"#location-show\").textContent =\r\n");
      out.write("        data.location;\r\n");
      out.write("      document.querySelector(\"#email-show\").textContent = data.email;\r\n");
      out.write("      document.querySelector(\"#password-show\").textContent =\r\n");
      out.write("        data.password;\r\n");
      out.write("      document.querySelector(\"#phonenumber-show\").textContent =\r\n");
      out.write("        data.phoneNumber;\r\n");
      out.write("    })\r\n");
      out.write("    .catch((error) => console.error(error));\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
