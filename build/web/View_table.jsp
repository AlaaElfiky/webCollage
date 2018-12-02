<%-- 
    Document   : newjsp
    Created on : Apr 30, 2016, 3:50:19 AM
    Author     : m7md
--%>


<%@page import="Entitiy.result"%>
<%@page import="Entitiy.Material"%>
<%@page import="model.Database_material"%>
<%@page import="Entitiy.doctor"%>
<%@page import="model.Doctor_date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Database_student"%>
<%@page import="Entitiy.Student"%>
<%@page import="Entitiy.Weekly"%>
<%@page import="model.WeeklyData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html class="no-js" lang="en">

    <!-- RabinsXP.com HTML5 Templates -->
    <head>
        <meta charset="utf-8">

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
        <!-- Preloader -->
        <div id="preloader">
            <div id="status">&nbsp;
            </div>
        </div>

        <header id="dmheader">
            <div class="pull-left">
                        <ul class="top-menu">
                            <li  class="topp"><a href="close.jsp" style="padding: 15px;font-size:20px;"><i class="icon-user"></i> تسجيل الخروج</a></li>
                          
                        </ul>
                    </div>
            <div class="container">
                <div id="dmtop"
                     <a class="cssLogo" href="index-1.html">
                        <!--  <span class="glyphicon glyphicon-education" aria-hidden="true"></span>-->
                        <img src="images/logo5.png" alt=""/></a>
                    <nav  align="right" id="cp-nav">
                        <ul class="flexnav" style="alignment-adjust:middle" data-breakpoint="800">
                            <li > <a  href="contact.html"> اتصل بنا </a></li>
                            <li > <a  href="e-portal.html"> اى-بورتال </a></li>
                            </li>
                            <li><a href="#">الخدمات </a>
                                <ul>

                                    <li><a href="result.html">النتيجة </a></li>
                                    <li><a href="student-5.html">الجداول الدراسية  </a></li>

                                    <li><a href="shop.html"> هيئة الدراسات العليا</a></li>
                                    <li><a href="single-shop.html">خدمة رعاية الشباب</a></li>
                                </ul>
                            <li>
                            <li><a href="">الانشطة</a>
                                <ul class="ansh">
                                    <li><a href="blog-1.html">ثقافى </a></li></br>
                                    <!--                                    <li><a href="blog-6.html"> اسر ورحلات </a></li></br>-->
                                    <li><a href="blog-2.html">اجتماعى</a></li></br>
                                    <li><a href="blog-4.html">علمى وتكنولوجى</a></li></br>
                                    <li><a href="blog-7.html"> فنى </a></li></br>
                                    <li><a href="blog-5.html">جوالة وخدمة عامه</a></li></br>
                                    <li><a href="blog-3.html">رياضى </a></li></br>
                                </ul>
                            </li>
                            <li><a href="fullwidth.html">الاخبار</a>
                            </li>
                            <li><a href="#">هيئة التدريس</a>
                                <ul>
                                    <li><a href="pricing-tables.html">قسم علوم الحاسب</a></li>
                                    <li><a href="icons.html">قسم شبكات الحاسب</a></li>
                                    <li><a href="columns.html">قسم نظم المعلومات </a></li>

                                </ul>
                            </li>
                            <li><a href="faq.html">عن الكلية</a>
                            </li>
                            <li><a href="#">الأقسام</a>
                                <ul>
                                    <li><a href="shortcodes.html">قسم علوم الحاسب </a></li>
                                    <li><a href="portfolio-without-filter.html">قسم نظم المعلومات </a></li>
                                    <li><a href="portfolio-single-1.html">قسم شبكات الحاسب </a></li>
                                    <li><a href="portfolio-single-2.html">قسم بحوث العمليات</a></li>
                                </ul>
                            </li>
                            <li><a href="login.html">تسجيل الدخول</a>
                            </li>
                            <li class="current"><a href="index.html">الرئيسية</a>
                                <ul>
                                    <li><a href="index-3.html">شاشة صغيرة </a></li>
                                </ul>
                            </li>


                        </ul>
                    </nav><!-- end #cp-nav -->	
                </div><!-- /dmtop/container -->
        </header><!-- /dmheader -->   

        
           <%session = request.getSession(false);%>
        
        <div class="border">
            <ul class="nav nav-pills nav-stacked" id="me" >

                <li><b>Admin</b></li> 
                <hr/>
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
                        <li><a href="result.jsp">اضافة  </a></li>
                        <li><a href="#">عرض</a></li>                       
                        <li><a href="#">تعديل</a></li>                       
                        <li><a href="#">حذف</a></li>                       
                    </ul>
                </li>
                <hr/>
                  <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"> المادة<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="result.jsp">اضافة  </a></li>
                        <li><a href="#">عرض</a></li>                       
                        <li><a href="#">تعديل المادة</a></li>                       
                        <li><a href="#">حذف</a></li>                       
                    </ul>
                </li>
                <hr/>
                 <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">الجدوال اليومي<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="result.jsp">اضافة  </a></li>
                        <li><a href="#">عرض</a></li>                       
                        <li><a href="#">تعديل المادة</a></li>                       
                        <li><a href="#">حذف</a></li>                       
                    </ul>
                </li>
                <hr/>
                <li><a href="#" style="margin-top: 35px;">الواردة</a></li>
                <hr/>
                <li><a href="#" style="margin-top: 35px;">الصادرة</a></li>
                <hr/>
            </ul>

        </div>
       
        


                <div style="width: 500px ;height: 391px;margin: 149px; overflow: scroll">
                    <table class="table-bordered" style="width:100%;margin-right: 100px;">
                        <%if((String)session.getAttribute("table_name")=="student"){
                         int year=Integer.parseInt(request.getParameter("year"));
         String sp=request.getParameter("sp");
        Database_student d=new Database_student();
        ArrayList<Student> list=new ArrayList();
        list=d.select(year, sp);
        
                                   
                       %>
                        
                            <tr>
                    <th>كود الطالب</th>
                    <th>اسم الطالب</th>
                    <th>اسم المستخدم</th>
                </tr>
           
                <tbody>
                
                
                   
                <% for (int i =0; i <list.size();i++) {%>
                
                        
                <tr>
                    <td><%=list.get(i).getId()%></td>
                    <td><%=list.get(i).getName()%></td>
                    <td><%=list.get(i).getUser_name()%></td>
                           
                </tr>
                
                    <%;}%>
                
                
            </tbody>
        </table>

                        <% }else if((String)session.getAttribute("table_name")=="doctor"){%>
                            <tr>
                    <th>كود الدكتور </th>
                    <th>اسم الدكتور </th>
                    <th>الدرجة العلمية</th>
                    <th>طريقة الاتصال</th>
                    <th>التخصص</th>
                </tr>
           
                <tbody>
                
                    <%  Doctor_date d =new Doctor_date();
                    ArrayList<doctor> g=d.select_doctor(request.getParameter("sp"));
                     
                for (int i =0; i <g.size();i++) {%>
                
                        
                <tr>
                    <td><%=g.get(i).getId()%></td>
                    <td><%=g.get(i).getDoctor_name()%></td>
                    <td><%=g.get(i).getQualification()%></td>
                    <td><%=g.get(i).getConnected() %></td>
                    <td><%=g.get(i).getSpecialization() %></td>
                           
                </tr>
                
                    <%;}%>
               
                
            </tbody>
        </table>
                            
                        
                    
                    <% }else if((String)session.getAttribute("table_name")=="materail") { %>
                                               
                 <tr>
                    <th>اسم الماده </th>
                    <th>الفرقه </th>
                    <th>القسم</th>
                    <th>كود الدكتور</th>
                    <th>لينك الماده</th>
                </tr>
           
                <tbody>
                
                    <% Database_material d =new Database_material();
                    ArrayList<Material> g=d.select_material(Integer.parseInt((String)request.getParameter("year")),(String)request.getParameter("sp"));
                     
                for (int i =0; i <g.size();i++) {%>
                
                        
                <tr>
                    <td><%=g.get(i).getName_material()%></td>
                    <td><%=g.get(i).getYear()%></td>
                    <td><%=g.get(i).getSpecialization()%></td>
                    <td><%=g.get(i).getDoctor_id()%></td>
                    <td><%=g.get(i).getSource_material()%></td>
                           
                </tr>
                
                    <%;}%>
                
 <%}else if((String)session.getAttribute("table_name")=="weekly"){%> 
 //id, name_material, task_lecture, task_sec, task_project, week_number, month_number
  <tr>
                    <th>الكود</th>
                    <th>اسم المادة</th>
                    <th>المطلوب من المحاضرة</th>
                    <th>المطلوب من السكشن</th>
                    <th>رقم الاسبوع</th>
                     <th>رقم الشهر</th>

                </tr>
           
                <tbody>
 
                
              <% WeeklyData data =new WeeklyData();
                    ArrayList<Weekly> g=data.select_weekly(request.getParameter("materail"));
                     
                for (int i =0; i <g.size();i++) {%>
                
                        
                <tr>
                    <td><%=g.get(i).getName_material()%></td>
                    <td><%=g.get(i).getId() %></td>
                    <td><%=g.get(i).getName_material()%></td>
                    <td><%=g.get(i).getTask_lecture() %></td>
                    <td><%=g.get(i).getTask_sec()%></td>
                    <td><%=g.get(i).getWeek_number() %></td>
                      <td><%=g.get(i).getWeek_number() %></td>

                </tr>
 
 
 <%}}else if((String)session.getAttribute("table_name")=="degree"){%>
 
 <tr>
                    <th>كود الطالب</th>
                    <th>اسم المادة </th>
                    <th>درجة  العملي </th>
                    <th>درجة التحرير</th>
                    <th>الدرجة الكلية</th>
                </tr>
           
                <tbody>
                
                    <%  Database_material dd =new Database_material();
                    int id_student=Integer.parseInt(request.getParameter("id_student"));
                    Database_student d=new Database_student();
                    Student s=d.search_by_id(id_student);
                    if(s.getName()==null){
                        
                            session.setAttribute("message","لا يوجد طالب بهذا الكود ");
                        response.sendRedirect("Message_admin.jsp");
 
                    }else{
                    ArrayList<result> g=dd.select_degree(id_student);%>
                    <%
                     
                for (int i =0; i <5;i++) {%>
                
                        
                <tr>
                    <td><%=g.get(i).getId()%></td>
                    <td><%=g.get(i).getMaterial_name()%></td>
                    <td><%=g.get(i).getMaterial_applied()%></td>
                    <td><%=g.get(i).getMaterial_final()%></td>
                    <td><%=g.get(i).getMaterial_total() %></td>
                    <td><%=g.get(i).getYear() %></td>
                           
                </tr>
                
                    <%;}%>
               
                
                               
                        
                    
                    <% }%>
            </tbody>
        </table>

        <%}%>

       
</div>
<div id="dmfooter">
    <div class="row-fluid">
		<div class="footer-grids">
			<div class="col-lg-3 footer-grid">
				<h2>هيئة التدريس</h2>
				<ul>
					<li><a href="#">الدكاترة</a></li>
					<li><a href="#">المعيدين</a></li>
					<li><a href="#">شئون الطلاب</a></li>
					<li><a href="#">رعاية الشباب</a></li>
					<li><a href="#">الهيئة المعاونة</a></li>
				</ul>
			</div>
			<div class="col-lg-3 footer-grid">
				<h2> أنشطة الكلية</h2>
				<ul>
					<li><a href="#">نشاط ثقافى</a></li>
					<li><a href="#">نشاط اجتماعى</a></li>
					<li><a href="#">نشاط رياضى</a></li>
					<li><a href="#">نشاط فنى </a></li>
					<li><a href="#">أسر ورحلات</a></li>
				</ul>
			</div>
			<div class="col-lg-3 footer-grid">
				<h2>أقسام الكلية</h2>
				<ul>
					<li><a href="#">علوم الحاسب</a></li>
					<li><a href="#">نظم المعلومات</a></li>
					<li><a href="#">تكنولوجيا المعلومات</a></li>
					<li><a href="#">بحوث العمليات</a></li>
					<li><a href="#">معامل متخصصة </a></li>
				</ul>
			</div>
			<div class="col-lg-3 footer-grid">
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
        </div></div>
  </section>         
        <div id="lastcontain" class="container">
            <p>Copyright © 2016  ALL RIGHTS RESERVED | DESIGN BY Team .</p></div>
    
<div class="dmtop">Scroll to Top</div>
        <!-- /wrapper -->

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
