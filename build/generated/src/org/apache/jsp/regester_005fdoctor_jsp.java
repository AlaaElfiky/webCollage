package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entitiy.Student;
import Entitiy.Weekly;
import model.WeeklyData;

public final class regester_005fdoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("\n");
      out.write("    <!-- RabinsXP.com HTML5 Templates -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <title>كلية الحاسبات والمعلومات جامعة المنوفية</title>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- http://www.456bereastreet.com/archive/201209/tell_css_that_javascript_is_available_asap/ -->\n");
      out.write("        <script>\n");
      out.write("            document.documentElement.className = document.documentElement.className.replace(/(\\s|^)no-js(\\s|$)/, '$1js$2');\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/boot.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/exp.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/checked.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"rs-plugin/css/settings.css\">\n");
      out.write("        <!--[if IE 7]>\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.min.css\">\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body  class=\"home\">\n");
      out.write("        <!-- Preloader -->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <div id=\"status\">&nbsp;\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <header id=\"dmheader\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div id=\"dmtop\"\n");
      out.write("                     <a class=\"cssLogo\" href=\"index-1.html\">\n");
      out.write("                        <!--  <span class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></span>-->\n");
      out.write("                        <img src=\"images/logo5.png\" alt=\"\"/></a>\n");
      out.write("                    <nav  align=\"right\" id=\"cp-nav\">\n");
      out.write("                        <ul class=\"flexnav\" style=\"alignment-adjust:middle\" data-breakpoint=\"800\">\n");
      out.write("                            <li > <a  href=\"contact.html\"> اتصل بنا </a></li>\n");
      out.write("                            <li > <a  href=\"e-portal.html\"> اى-بورتال </a></li>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">الخدمات </a>\n");
      out.write("                                <ul>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"result.html\">النتيجة </a></li>\n");
      out.write("                                    <li><a href=\"student-5.html\">الجداول الدراسية  </a></li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"shop.html\"> هيئة الدراسات العليا</a></li>\n");
      out.write("                                    <li><a href=\"single-shop.html\">خدمة رعاية الشباب</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            <li>\n");
      out.write("                            <li><a href=\"\">الانشطة</a>\n");
      out.write("                                <ul class=\"ansh\">\n");
      out.write("                                    <li><a href=\"blog-1.html\">ثقافى </a></li></br>\n");
      out.write("                                    <!--                                    <li><a href=\"blog-6.html\"> اسر ورحلات </a></li></br>-->\n");
      out.write("                                    <li><a href=\"blog-2.html\">اجتماعى</a></li></br>\n");
      out.write("                                    <li><a href=\"blog-4.html\">علمى وتكنولوجى</a></li></br>\n");
      out.write("                                    <li><a href=\"blog-7.html\"> فنى </a></li></br>\n");
      out.write("                                    <li><a href=\"blog-5.html\">جوالة وخدمة عامه</a></li></br>\n");
      out.write("                                    <li><a href=\"blog-3.html\">رياضى </a></li></br>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"fullwidth.html\">الاخبار</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">هيئة التدريس</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"pricing-tables.html\">قسم علوم الحاسب</a></li>\n");
      out.write("                                    <li><a href=\"icons.html\">قسم شبكات الحاسب</a></li>\n");
      out.write("                                    <li><a href=\"columns.html\">قسم نظم المعلومات </a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"faq.html\">عن الكلية</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">الأقسام</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"shortcodes.html\">قسم علوم الحاسب </a></li>\n");
      out.write("                                    <li><a href=\"portfolio-without-filter.html\">قسم نظم المعلومات </a></li>\n");
      out.write("                                    <li><a href=\"portfolio-single-1.html\">قسم شبكات الحاسب </a></li>\n");
      out.write("                                    <li><a href=\"portfolio-single-2.html\">قسم بحوث العمليات</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"login.html\">تسجيل الدخول</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"current\"><a href=\"index.html\">الرئيسية</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"index-3.html\">شاشة صغيرة </a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </nav><!-- end #cp-nav -->\t\n");
      out.write("                </div><!-- /dmtop/container -->\n");
      out.write("        </header><!-- /dmheader -->\n");
      out.write("        ");
  session = request.getSession(false);
        String s=(String)session.getAttribute("login_done");
        if(s==null){
            response.sendRedirect("login.html");
}
      out.write("\n");
      out.write("                \n");
      out.write("       \n");
      out.write("        <div class=\"border\">\n");
      out.write("            <ul class=\"nav nav-pills nav-stacked\" id=\"me\" >\n");
      out.write("\n");
      out.write("                <li><b></b></li> \n");
      out.write("                <hr/>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">الطالب <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"esult.jsp\">اضافة  </a></li>\n");
      out.write("                        <li><a href=\"#\">عرض</a></li>                       \n");
      out.write("                        <li><a href=\"#\">تعديل</a></li>                       \n");
      out.write("                        <li><a href=\"#\">حذف</a></li>                       \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <hr/>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">دكتور <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"result.jsp\">اضافة  </a></li>\n");
      out.write("                        <li><a href=\"#\">عرض</a></li>                       \n");
      out.write("                        <li><a href=\"#\">تعديل</a></li>                       \n");
      out.write("                        <li><a href=\"#\">حذف</a></li>                       \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <hr/>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"> المادة<span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"result.jsp\">اضافة  </a></li>\n");
      out.write("                        <li><a href=\"#\">عرض</a></li>                       \n");
      out.write("                        <li><a href=\"#\">تعديل المادة</a></li>                       \n");
      out.write("                        <li><a href=\"#\">حذف</a></li>                       \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <hr/>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">الجدوال اليومي<span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"result.jsp\">اضافة  </a></li>\n");
      out.write("                        <li><a href=\"#\">عرض</a></li>                       \n");
      out.write("                        <li><a href=\"#\">تعديل المادة</a></li>                       \n");
      out.write("                        <li><a href=\"#\">حذف</a></li>                       \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <hr/>\n");
      out.write("                <li><a href=\"#\" style=\"margin-top: 35px;\">الواردة</a></li>\n");
      out.write("                <hr/>\n");
      out.write("                <li><a href=\"#\" style=\"margin-top: 35px;\">الصادرة</a></li>\n");
      out.write("                <hr/>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("              <div class=\"col-md-3 footer-grid\" style=\"margin-top: 50px  ;float: right; direction: rtl;color:#648fc5 ; font-size: 14px\">\n");
      out.write("            <form name=\"form1\" method=\"post\" action=\"Register\" >\n");
      out.write("                \n");
      out.write("              ادخل اسم الدكتور :<input type=\"text\" name =\"name\" >\n");
      out.write("                <hr>\n");
      out.write("                <select name=\"qualification\">        \n");
      out.write("                    <option value=\"t\">استاذ مساعد</option>\n");
      out.write("                    <option value=\"tt\">دكتور</option>\n");
      out.write("                    <option value=\"ttt\">استاذ دكتور </option>\n");
      out.write("                    \n");
      out.write("                </select>\n");
      out.write("                <hr>\n");
      out.write("                <select name=\"sp\">        \n");
      out.write("                    <option value=\"\">عام</option>\n");
      out.write("                    <option value=\"cs\">قسم علوم الحاسب</option>\n");
      out.write("                    <option value=\"is\">قسم نظم المعلومات</option>\n");
      out.write("                    <option value=\"it\">قسم شبكات الحاسب </option>\n");
      out.write("                    <option value=\"or\">قسم بحوث العمليات </option>\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <hr>\n");
      out.write("                طريقة الاتصال:<input type=\"text\" name =\"cont\">\n");
      out.write("                <hr>\n");
      out.write("                <input type=\"submit\" value=\"اضافة\" style=\"width: 200px ;height:50px\">                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"footer\" style=\"margin-top:450px\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"footer-grids\">\n");
      out.write("                    <div class=\"col-md-3 footer-grid\">\n");
      out.write("                        <h2>هيئة التدريس</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">الدكاترة</a></li>\n");
      out.write("                            <li><a href=\"#\">المعيدين</a></li>\n");
      out.write("                            <li><a href=\"#\">شئون الطلاب</a></li>\n");
      out.write("                            <li><a href=\"#\">رعاية الشباب</a></li>\n");
      out.write("                            <li><a href=\"#\">الهيئة المعاونة</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 footer-grid\">\n");
      out.write("                        <h2> أنشطة الكلية</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">نشاط ثقافى</a></li>\n");
      out.write("                            <li><a href=\"#\">نشاط اجتماعى</a></li>\n");
      out.write("                            <li><a href=\"#\">نشاط رياضى</a></li>\n");
      out.write("                            <li><a href=\"#\">نشاط فنى </a></li>\n");
      out.write("                            <li><a href=\"#\">أسر ورحلات</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 footer-grid\">\n");
      out.write("                        <h2>أقسام الكلية</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">علوم الحاسب</a></li>\n");
      out.write("                            <li><a href=\"#\">نظم المعلومات</a></li>\n");
      out.write("                            <li><a href=\"#\">تكنولوجيا المعلومات</a></li>\n");
      out.write("                            <li><a href=\"#\">بحوث العمليات</a></li>\n");
      out.write("                            <li><a href=\"#\">معامل متخصصة </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 footer-grid\">\n");
      out.write("                        <h2>عن الكلية</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">تاريخ الكلية </a></li>\n");
      out.write("                            <li><a href=\"#\">رؤية الكلية</a></li>\n");
      out.write("                            <li><a href=\"#\">أهداف الكلية</a></li>\n");
      out.write("                            <li><a href=\"#\">رسالة الكلية</a></li>\n");
      out.write("                            <li><a href=\"#\">انجازات الكلية</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>         \n");
      out.write("        <div id=\"lastcontainer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p>Copyright © 2016 All Rights Reserved | Design by Team .</p>\n");
      out.write("            </div><!-- /container -->\n");
      out.write("        </div><!-- /lastcontainer -->\n");
      out.write("\n");
      out.write("        <div class=\"dmtop\">Scroll to Top</div>\n");
      out.write("    </div><!-- /wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ALL PLUGINS -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <!-- RS PLUGINS -->\n");
      out.write("    <script type=\"text/javascript\" src=\"rs-plugin/js/jquery.themepunch.plugins.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"rs-plugin/js/jquery.themepunch.revolution.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("       var revapi;\n");
      out.write("       jQuery(document).ready(function() {\n");
      out.write("           revapi = jQuery('.tp-banner').revolution(\n");
      out.write("                   {\n");
      out.write("                       delay: 9000,\n");
      out.write("                       startwidth: 1170,\n");
      out.write("                       startheight: 530,\n");
      out.write("                       hideThumbs: 10,\n");
      out.write("                       fullWidth: \"on\",\n");
      out.write("                       forceFullWidth: \"on\",\n");
      out.write("                       navigationType: \"none\",\n");
      out.write("                       navigationStyle: \"round\",\n");
      out.write("                       touchenabled: \"on\",\n");
      out.write("                       onHoverStop: \"off\",\n");
      out.write("                       shadow: 0,\n");
      out.write("                       stopLoop: \"off\",\n");
      out.write("                       stopAfterLoops: -1,\n");
      out.write("                       stopAtSlide: -1,\n");
      out.write("                       shuffle: \"off\",\n");
      out.write("                   });\n");
      out.write("       });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/grid.js\"></script>\n");
      out.write("    <script src=\"js/pulloutpanel.min.js\"></script>\n");
      out.write("    <script src=\"js/superfish.js\"></script>\n");
      out.write("    <script src=\"js/jquery.fs.naver.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.flexslider.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("  $(window).load(function() {\n");
      out.write("      $('#status').delay(800).fadeOut('slow');\n");
      out.write("      $('#preloader').delay(800).fadeOut('slow');\n");
      out.write("      $('body').delay(800).css({'overflow': 'visible'});\n");
      out.write("  })\n");
      out.write("    </script> \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- RabinsXP.com HTML5 Templates -->\n");
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
