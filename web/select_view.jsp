<%-- 
    Document   : newjsp
    Created on : Apr 30, 2016, 3:50:19 AM
    Author     : m7md
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="model.Database_student"%>
<%@page import="Entitiy.Student"%>
<%@page import="Entitiy.Weekly"%>
<%@page import="model.WeeklyData"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>كلية الحاسبات والمعلومات جامعة المنوفية</title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- http://www.456bereastreet.com/archive/201209/tell_css_that_javascript_is_available_asap/ -->
        <script>
            document.documentElement.className = document.documentElement.className.replace(/(\s|^)no-js(\s|$)/, '$1js$2');
        </script>

        <!-- CSS Files -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/boot.css">
        <link rel="stylesheet" href="css/exp.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/checked.css">
        <link rel="shortcut icon" href="favicon.ico"> 
        <link rel="stylesheet" href="rs-plugin/css/settings.css">
        <!--[if IE 7]>
          <link rel="stylesheet" href="css/font-awesome-ie7.min.css">
        <![endif]-->

        <!--[if lt IE 9]>
          <script src="js/html5shiv.min.js"></script>
        <![endif]-->
        <script src="js/modernizr.custom.js"></script>




        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>





    </head>
    <body  class="home">
      <div class="container">
        <header id="dmheader">
<!--            <div class="pull-left">
                <ul class="top-menu">
                    <li  class="topp"><a href="close.jsp" style="padding: 15px;font-size:20px;"><i class="icon-user"></i> تسجيل الخروج</a></li>

                </ul>
            </div>-->
           
                <div id="dmtop"
                     <a class="cssLogo" href="index-1.html">
                        <!--  <span class="glyphicon glyphicon-education" aria-hidden="true"></span>-->
                        <img src="images/logo5.png" alt=""/></a>
                    <nav  align="right" id="cp-nav">
                        <ul class="flexnav" style="alignment-adjust:middle" data-breakpoint="800">
                            <li  class="topp"> <a  href="contact.html"> اتصل بنا </a></li>
                            </li>
                            <li  class="topp"><a href="#">الخدمات </a>
                                <ul>
                                    <li><a href="result.html">النتيجة </a></li>
                                    <li><a href="student-5.html">الجداول الدراسية</a></li>
                                    <li><a href="shopp.html"> هيئة الدراسات العليا</a></li>
                                    <li><a href="single-shop.html">خدمة رعاية الشباب</a></li>
                                </ul>
                            <li>
                            <li  class="topp"><a href="">الانشطة</a>
                                <ul>
                                    <li><a href="blog-1.html"> ثقافى</a></li>
                                    <li><a href="blog-2.html">اجتماعى</a></li></br>
                                    <li><a href="blog-4.html">علمى وتكنولوجى</a></li></br>
                                    <li><a href="blog-7.html"> فنى </a></li></br>
                                    <li><a href="blog-5.html">جوالة وخدمة عامه</a></li></br>
                                    <li><a href="blog-6.html">أسرور حلات</a></li></br>
                                    <li><a href="blog-3.html">رياضى </a></li>
                                </ul>
                            </li>
                            <li  class="topp"><a href="bNews.html">الاخبار</a>
                            </li>
                            <li  class="topp"><a href="#">هيئة التدريس</a>
                                <ul>

                                    <li><a href="pricing-tables.html">قسم علوم الحاسب</a></li>
                                    <li><a href="icons.html">قسم شبكات الحاسب</a></li>
                                    <li><a href="columns.html">قسم نظم المعلومات </a></li>

                                </ul>
                            </li>
                            <li  class="topp"><a href="faq1.html">عن الكلية</a>
                            </li>
                            <li  class="topp"><a href="#">الأقسام</a>
                                <ul>
                                    <li><a href="shortcodes.html">قسم علوم الحاسب </a></li>
                                    <li><a href="portfolio-without-filter.html">قسم نظم المعلومات </a></li>
                                    <li><a href="portfolio-single-1.html">قسم شبكات الحاسب </a></li>
                                    <li><a href="portfolio-single-2.html">قسم بحوث العمليات</a></li>
                                </ul>
                            </li>
                            <li  class="topp"><a href="login.html">تسجيل الدخول</a>
                            </li>
                            <li class="current"><a href="index-3.html">الرئيسية</a>
                            </li>


                        </ul>
                    </nav><!-- end #cp-nav -->	
                </div><!-- /dmtop -->
        </div><!-- /container -->
        </header></div><!-- /dmheader -->  

  <%session = request.getSession(false);%>
  <div class="container">
        <div class="border">
            <ul class="nav nav-pills nav-stacked" id="me"  style="height: 550px">

                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">الطالب <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="register.jsp">اضافة  </a></li>
                        <li><a href="select_view.jsp">عرض</a></li>                       
                        <li><a href="update_student.jsp">تعديل</a></li>                       
                        <li><a href="delete_student.jsp">حذف</a></li>                       
                    </ul>
                </li>

                <hr/>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">دكتور <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="regester_doctor.jsp">اضافة  </a></li>
                        <li><a href="table_doctor.jsp">عرض</a></li>                       
                        <li><a href="update_doctor.jsp">تعديل</a></li>                       
                        <li><a href="delete_doctor.jsp">حذف</a></li>                       
                    </ul>
                </li>
                <hr/>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> المادة<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="add_material.jsp">اضافة  </a></li>
                        <li><a href="view_matiriels.jsp">عرض</a></li>                       
                        <li><a href="update_material.jsp">تعديل المادة</a></li>                       
                        <li><a href="delete_material.jsp">حذف</a></li>                       
                    </ul>
                </li>
                <hr/>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">الجدوال اليومي<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="add_tasks.jsp">اضافة  </a></li>
                        <li><a href="Material_name.jsp">عرض</a></li>                       
                        <li><a href="update_tasks.jsp">تعديل التاسك</a></li>                       
                        <li><a href="delete_tasks.jsp">حذف</a></li>                       
                    </ul>
                </li>
                <hr/>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">الدرجات <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="degree.jsp">اضافة  </a></li>
                        <li><a href="show_degree.jsp">عرض</a></li>                       
                        <li><a href="delete_degree.jsp">حذف</a></li>                       
                    </ul>
                </li>
                <hr/>
                <li><a href="message.jsp" style="margin-top: 35px;">الواردة</a></li>
                <hr/>
                <li><a href="admin_send.jsp" style="margin-top: 35px;">الصادرة</a></li>
                <hr/>
            </ul>

      </div></div>
 
      <div class="registere" >
                   <form name="form1" method="post" action="View_table.jsp" >
               
                <select name="year">        
                    
                    <option value="1">الاولة</option>
                    <option value="2">الثانية</option>
                    <option value="3">الثالثة</option>
                    <option value="4">الرابعة</option>
                </select>
                <hr>
                 <select name="sp">        
                    
                    <option value="">عام</option>
                    <option value="cs">قسم علوم الحاسب</option>
                    <option value="is">قسم نظم المعلومات</option>
                    <option value="it">قسم شبكات الحاسب </option>
                    <option value="or">قسم بحوث العمليات </option>
               
                </select>
               <hr>
               
               <%
           session.setAttribute("table_name","student");
          %>
               <input type="submit" value="عرض" style="width: 200px ;height:50px">                
            </form>
      </div>

            <div class="container">
        <div class="footer">
                <div class="footer-grids">
                    <div class="col-md-2 footer-grid">
                        <h2>هيئة التدريس</h2>
                        <ul>
                            <li><a href="#">الدكاترة</a></li>
                            <li><a href="#">المعيدين</a></li>
                            <li><a href="#">شئون الطلاب</a></li>
                            <li><a href="#">رعاية الشباب</a></li>
                            <li><a href="#">الهيئة المعاونة</a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 footer-grid">
                        <h2> أنشطة الكلية</h2>
                        <ul>
                            <li><a href="#">نشاط ثقافى</a></li>
                            <li><a href="#">نشاط اجتماعى</a></li>
                            <li><a href="#">نشاط رياضى</a></li>
                            <li><a href="#">نشاط فنى </a></li>
                            <li><a href="#">أسر ورحلات</a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 footer-grid">
                        <h2>أقسام الكلية</h2>
                        <ul>
                            <li><a href="#">علوم الحاسب</a></li>
                            <li><a href="#">نظم المعلومات</a></li>
                            <li><a href="#">تكنولوجيا المعلومات</a></li>
                            <li><a href="#">بحوث العمليات</a></li>
                            <li><a href="#">معامل متخصصة </a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 footer-grid">
                        <h2>عن الكلية</h2>
                        <ul>
                            <li><a href="#">تاريخ الكلية </a></li>
                            <li><a href="#">رؤية الكلية</a></li>
                            <li><a href="#">أهداف الكلية</a></li>
                            <li><a href="#">رسالة الكلية</a></li>
                            <li><a href="#">انجازات الكلية</a></li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>         
        <div id="lastcontainer">
            <div class="container">
                <p>Copyright © 2016 All Rights Reserved | Design by Team .</p>
            </div><!-- /container -->
        </div><!-- /lastcontainer -->

        <div class="dmtop">Scroll to Top</div>
    </div><!-- /wrapper -->


    <!-- ALL PLUGINS -->
    <script src="js/jquery.js"></script>
    <!-- RS PLUGINS -->
    <script type="text/javascript" src="rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
    <script type="text/javascript" src="rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
    <script type="text/javascript">
            var revapi;
            jQuery(document).ready(function() {
                revapi = jQuery('.tp-banner').revolution(
                        {
                            delay: 9000,
                            startwidth: 1170,
                            startheight: 530,
                            hideThumbs: 10,
                            fullWidth: "on",
                            forceFullWidth: "on",
                            navigationType: "none",
                            navigationStyle: "round",
                            touchenabled: "on",
                            onHoverStop: "off",
                            shadow: 0,
                            stopLoop: "off",
                            stopAfterLoops: -1,
                            stopAtSlide: -1,
                            shuffle: "off",
                        });
            });
    </script>

    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/grid.js"></script>
    <script src="js/pulloutpanel.min.js"></script>
    <script src="js/superfish.js"></script>
    <script src="js/jquery.fs.naver.min.js"></script>
    <script src="js/jquery.flexslider.min.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/custom.js"></script>
    <!-- Preloader -->
    <script type="text/javascript">
            $(window).load(function() {
                $('#status').delay(800).fadeOut('slow');
                $('#preloader').delay(800).fadeOut('slow');
                $('body').delay(800).css({'overflow': 'visible'});
            })
    </script> 
</body>

<!-- RabinsXP.com HTML5 Templates -->
</html>
