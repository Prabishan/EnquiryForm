package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import com.leapfrog.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public final class Submit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/index.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Enquiry</h1>\n");
      out.write("            <form method =\"get\" action=\"index.jsp\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>First Name</label>\n");
      out.write("                    <input type=\"text\" name=\"firstName\" class=\"form-control\" required=\"required\" placeholder=\"First Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Last Name</label>\n");
      out.write("                    <input type=\"text\" name=\"lastName\" class=\"form-control\" required=\"required\" placeholder=\"Last Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Contact No</label>\n");
      out.write("                    <input type=\"text\" name=\"contactNo\" class=\"form-control\" required=\"required\" placeholder=\"Contact No\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Email</label>\n");
      out.write("                    <input type=\"text\" name=\"email\" class=\"form-control\" required=\"required\" placeholder=\"Email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Description</label>\n");
      out.write("                    <textarea type=\"text\" name=\"description\" class=\"form-control\" required=\"required\" placeholder=\"Description\" style=\"height:200px\" ></textarea>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"button\" class=\"btn btn-success\">Submit</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");


                    String firstname = request.getParameter("firstName");
                    String lastname = request.getParameter("lastName");
                    String contactno = request.getParameter("contactNo");
                    String email = request.getParameter("email");
                    String description = request.getParameter("description");

                    String connectionURL = "jdbc:mysql://localhost:3306/problemticket";

                    Connection conn = null;

                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    int updateQuery = 0;

                    try {

                        conn = DriverManager.getConnection("connectionURL", "root", null);
                        String sql = "INSERT INTO enquiry(first_name,last_name,contact_no,email,description) VALUES(?,?,?,?,?)";
                        PreparedStatement st = conn.prepareStatement(sql);
                        st.setString(1, firstname);
                        st.setString(2, lastname);
                        st.setString(3, contactno);
                        st.setString(4, email);
                        st.setString(5, description);

                        updateQuery = st.executeUpdate();

            if (updateQuery != 0) { 
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <TABLE style=\"background-color: #E3E4FA;\" \n");
      out.write("                       WIDTH=\"30%\" border=\"1\">\n");
      out.write("                    <tr><th>Data is inserted successfully \n");
      out.write("                            in database.</th></tr>\n");
      out.write("                </table>\n");
      out.write("                ");

                            }

                            st.close();
                            conn.close();

                        } catch (Exception e) {
                            out.println("Unable to connect to database");
                        }

                    }
                
      out.write(" \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");


            String firstname = request.getParameter("firstName");
            String lastname = request.getParameter("lastName");
            String contactno = request.getParameter("contactNo");
            String email = request.getParameter("email");
            String description = request.getParameter("description");

            String connectionURL = "jdbc:mysql://localhost:3306/problemticket";

            Connection conn = null;

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            int updateQuery = 0;

            try {

                conn = DriverManager.getConnection("connectionURL", "root", null);
                String sql = "INSERT INTO enquiry(first_name,last_name,contact_no,email,description) VALUES(?,?,?,?,?)";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, firstname);
                st.setString(2, lastname);
                st.setString(3, contactno);
                st.setString(4, email);
                st.setString(5, description);

                updateQuery = st.executeUpdate();

                if (updateQuery != 0) { 
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <TABLE style=\"background-color: #E3E4FA;\" \n");
      out.write("               WIDTH=\"30%\" border=\"1\">\n");
      out.write("            <tr><th>Data is inserted successfully \n");
      out.write("                    in database.</th></tr>\n");
      out.write("        </table>\n");
      out.write("        ");

                    }

                    st.close();
                    conn.close();

                } catch (Exception e) {
                    out.println("Unable to connect to database");
                }

            }
        
      out.write("  \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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
