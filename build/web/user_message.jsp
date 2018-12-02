<%-- 
    Document   : user_message
    Created on : May 19, 2016, 11:20:35 AM
    Author     : m7md
--%>

<%@page import="model.Database_student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html class="no-js" lang="en">

<!-- RabinsXP.com HTML5 Templates -->
<head>
  <meta charset="utf-8">

  <title>Flayz | Multi Purpose HTML5 Template</title>

  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- http://www.456bereastreet.com/archive/201209/tell_css_that_javascript_is_available_asap/ -->
  <script>
    document.documentElement.className = document.documentElement.className.replace(/(\s|^)no-js(\s|$)/, '$1js$2');
  </script>
  
  <!-- CSS Files -->
<!--  <link rel="stylesheet" href="css/bootstrap.css">-->
  <link rel="stylesheet" href="style.css">  
  <link rel="stylesheet" href="css/checked.css">    
  <link rel="stylesheet" href="css/boot.css">
  <link rel="shortcut icon" href="favicon.ico"> 
  <!--[if IE 7]>
    <link rel="stylesheet" href="css/font-awesome-ie7.min.css">
  <![endif]-->

  <!--[if lt IE 9]>
    <script src="js/html5shiv.min.js"></script>
  <![endif]-->
   <script src="js/modernizr.custom.js"></script>

</head>
<body >
    <div class="container">
	<header id="dmheader">
    <div class="pull-left">
                        <ul class="top-menu">
                            <li><a href="login.html"><i class="icon-user"></i> تسجيل الدخول</a></li>
                            <li><a href="bNews.html"><i class="icon-shopping-cart"></i> الاخبار</a></li>
                            <li><a href="Gallery.html"><i class="icon-shopping-cart"></i> الصور</a></li>
                        </ul>
                    </div><!-- /rightmenu -->
<!--
            <div id="dmtop"
                <a class="cssLogo" href="index-1.html">
            <img src="images/logo5.png" alt=""/></a>
-->
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
	</header><!-- /dmheader -->     
</div>  
<div class="contact">
	<div class="container">
		<div class="contact-main">
			<div class="col-md-6 contact-left">
				<div class="contac-top">
					<h3 align="center">ارسل رسالة </h3>
				<!--	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit</p>-->
				</div>
                            //id, email, name, subject, message, tooo, message_date
                            <% String email=request.getParameter("email");
                            String name=request.getParameter("name");
                            String subject=request.getParameter("sub");
                            String message=request.getParameter("message");
                            Database_student d=new Database_student();
                            if(d.insert_contect(email, name, subject, message, "admin")){
                             %>   
                             <b>
                                 تم ارسال الرساله بنجاح
                             </b>
                            <%}else{%>
                            <b>
                                لم يتم ارسال الرساله برجاء المحاوله مره اخرى
                            </b>
                            <%}%>
                            
                            
                            
                            
                            
                            %>
				</div>
            <div class="col-md-6 contact-right">
				<div class="contact-top">
					<h2>وسائل الاتصال بالكلية</h2>
					<p>تستطيع التواصل معنا من خلال بعض وسائل الاتصال ومنها</p>
			    </div>
				<div class="conta-1">
					<div class="con-phone">
						<span class="con-ph"> </span>
						<div class="con-par">
							<h6>رقم التليفون</h6>
							<p>048/2225446</p>
                           <h6>رقم الفاكس</h6>
							<p>048/2223694</p>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="conta-2">
					<div class="con-address">
						<span class="con-location"> </span>
						<div class="con-para">
							<h6>البريد الالكترونى</h6>
							<p align="right">compu_info@menofia.edu.eg</p>
						</div>
					</div>
				</div>
			 </div>
		  <div class="clearfix"> </div>
		</div>
		<div class="map">
			<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3150859.767904157!2d-96.62081048651531!3d39.536794757966845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1408111832978"> </iframe>
		</div>
	</div>
</div>

                           
<!--//our facilities-->  
  <div class="container"> <div id="dmfooter">
    <div class="row-fluid">
		<div class="footer-grids">
			<div class="col-md-4 footer-grid">
				<h2>هيئة التدريس</h2>
				<ul>
					<li><a href="#">الدكاترة</a></li>
					<li><a href="#">المعيدين</a></li>
					<li><a href="#">شئون الطلاب</a></li>
					<li><a href="#">رعاية الشباب</a></li>
					<li><a href="#">الهيئة المعاونة</a></li>
				</ul>
			</div>
			<div class="col-md-4 footer-grid">
				<h2> أنشطة الكلية</h2>
				<ul>
					<li><a href="#">نشاط ثقافى</a></li>
					<li><a href="#">نشاط اجتماعى</a></li>
					<li><a href="#">نشاط رياضى</a></li>
					<li><a href="#">نشاط فنى </a></li>
					<li><a href="#">أسر ورحلات</a></li>
				</ul>
			</div>
			<div class="col-md-4 footer-grid">
				<h2>أقسام الكلية</h2>
				<ul>
					<li><a href="#">علوم الحاسب</a></li>
					<li><a href="#">نظم المعلومات</a></li>
					<li><a href="#">تكنولوجيا المعلومات</a></li>
					<li><a href="#">بحوث العمليات</a></li>
					<li><a href="#">معامل متخصصة </a></li>
				</ul>
			</div>
			<div class="col-md-4 footer-grid">
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
</div>  </div>  
 <div id="lastcontainer" class="container">
		<p>Copyright © 2016  ALL RIGHTS RESERVED | DESIGN BY Team .</p>
	</div><!-- /lastcontainer --> 
<div class="dmtop">Scroll to Top</div>
</div><!-- /wrapper -->
	
   <!-- ALL PLUGINS -->
   <script src="js/jquery.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <script src="js/jquery.prettyPhoto.js"></script>
   <script src="js/grid.js"></script>
   <script src="js/pulloutpanel.min.js"></script>
   <script src="js/superfish.js"></script>
   <script src="js/jquery.fs.naver.min.js"></script>
   <script src="js/jquery.flexslider.min.js"></script>
   <script src="js/jquery.inview.js"></script>
   <script src="js/jquery.isotope.min.js"></script>
   <script src="js/custom.js"></script>

</body>

<!-- RabinsXP.com HTML5 Templates -->
</html>