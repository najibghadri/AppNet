/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-21 17:04:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fauthz_005fauthorize_0026_005fifAllGranted;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fauthz_005fauthorize_0026_005fifAllGranted = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fauthz_005fauthorize_0026_005fifAllGranted.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Sparklr</title>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\"\n");
      out.write("\thref=\"webjars/bootstrap/3.0.3/css/bootstrap.min.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"webjars/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"webjars/bootstrap/3.0.3/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<h1>Sparklr</h1>\n");
      out.write("\n");
      out.write("\t\t<h2>Home</h2>\n");
      out.write("\n");
      out.write("\t\t<p>This is a great site to store and view your photos.\n");
      out.write("\t\t\tUnfortunately, we don't have any services for printing your photos.\n");
      out.write("\t\t\tFor that, you'll have to go to Tonr.</p>\n");
      out.write("\n");
      out.write("\t\t");
      if (_jspx_meth_authz_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\tSample application for <a\n");
      out.write("\t\t\t\thref=\"http://github.com/spring-projects/spring-security-oauth\"\n");
      out.write("\t\t\t\ttarget=\"_blank\">Spring Security OAuth</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_authz_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  authz:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_authz_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fauthz_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_authz_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_authz_005fauthorize_005f0.setParent(null);
    // /index.jsp(29,2) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_authz_005fauthorize_005f0.setIfAllGranted("ROLE_USER");
    int _jspx_eval_authz_005fauthorize_005f0 = _jspx_th_authz_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_authz_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t<div class=\"form-horizontal\">\n");
      out.write("\t\t\t\t<form action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_th_authz_005fauthorize_005f0, _jspx_page_context))
        return true;
      out.write("\" role=\"form\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\" type=\"submit\">Logout</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<h2>Your Photos</h2>\n");
      out.write("\n");
      out.write("\t\t\t<p id=\"photos\">\n");
      out.write("\t\t\t\t<script type='text/javascript'>\n");
      out.write("\t\t\t\t\t$\n");
      out.write("\t\t\t\t\t\t\t.ajax(\"photos?format=json\")\n");
      out.write("\t\t\t\t\t\t\t.complete(\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction(response) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata = JSON\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.parse(response.responseText);\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor (var i = 0; i < data.photos.length; i++) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar photo = data.photos[i];\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#photos\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.append(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'<img src=\"photos/' + photo.id + '\" alt=\"' + photo.name + '\">');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t");
    }
    if (_jspx_th_authz_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fauthz_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_authz_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fauthz_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_authz_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_authz_005fauthorize_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_authz_005fauthorize_005f0);
    // /index.jsp(31,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/logout");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
