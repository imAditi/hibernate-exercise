<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <title>Javascript Tuto</title>
            <link rel="stylesheet" type="text/css" href="asset/vendors/bootstrap.min.css">
            <script type="text/javascript" src="asset/vendors/jquery-3.3.1.min.js"></script>
            <script type="text/javascript" src="asset/vendors/bootstrap.min.js"></script>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"> 
           <link href="https://fonts.googleapis.com/css?family=Montserrat|Open+Sans" rel="stylesheet">

            <link rel="stylesheet" href="asset/css/style.css" />
            <script type="text/javascript" src="asset/js/script.js"></script>
            
            <meta name="keywords" content="YASH Technologies" />
  <meta name="description" content="YASH Technologies">
  <!-- Favicon -->
  <link href="assets/images/favicon.ico" rel="shortcut icon" type="image/x-icon">

  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

  <!-- Custom CSS -->

  

  <!-- Vendor CSS -->
  <link rel="stylesheet" href="assest/css/bootstrap/bootstrap.min.css" />



  <link rel="stylesheet" type="text/css" href="assest\css\style.css">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  /*Yash Logo*/
.yashlogo{
    width: 80px;
    position: absolute;
    padding: 5px;
   
 
   }

   /*Header section css*/
.top-right{
 margin: 10px 10px;
    border-radius: 20px;
    text-align: left;
   padding-left: 10px;
    opacity: 0.2;
    border: 1px solid;
    width: 150px;
    font-size: 12px;
    height: 30px;
}





.content-header a{
    color: white;
}
.item{
	padding: 5px;
	}
.active{
	padding: 5px;
	
}

#slider-container{
	height: 300px;
} 
.col-sm-3{
	background-color: 
}
.col-sm-9{
	background-color: #EAEDF2;
	
}
#slider{

border-left: 3px 3px 3px 3px solid black;
border-radius: 4px;
}
.label{
	position: relative;
	left: 85%;
	top: 27px;

}
.panel{
	margin-left: 30px;
	margin-right: 30px;
    margin-top: 5px;
}
#footer{

	height: 20px;
	
	position: absolute;


}

.btn.focus, .btn:focus, .btn:hover {
    color: #fff;
    text-decoration: none;
}
.btn{
        font-size: 18px;
}
body{
  font-family: 'Open Sans', sans-serif;
}
/*wrapper section includes side navigation*/


#sidebar-wrapper {
   
   
    position: fixed;
   width: 200%;
  
    height: 100%;

 padding-top: 20px;


    background: #1d2127;
    border-right: 4px solid black;
    
}



/* Sidebar Styles */

.sidebar-nav{
    padding-right: 30px;
}

.sidebar-nav li {
    text-indent: 20px;
    line-height: 40px;
   
}
.sidebar-nav li ::before{
    color: red;
}

.sidebar-nav li a {
    display: block;
    text-decoration: none;
    color: #999999;
}

.sidebar-nav li a:hover {
    text-decoration: none;
    color: #fff;
    background: rgba(255,255,255,0.2);
}

.sidebar-nav li a:active,
.sidebar-nav li a:focus {
    text-decoration: none;
}



.sidebar-nav > .sidebar-brand a {
    color: #999999;
}

.sidebar-nav > .sidebar-brand a:hover {
    color: #fff;
    background: none;
}
.sidebar-nav .dropdown-menu {
    position: relative;
    width: 100%;
    padding: 0;
    margin-left: 14px;
    border-radius: 0;
    border: none;

    background: transparent;
    box-shadow: none;
}




    
}
    
/*Side navbar*/
.sidebar-nav {
    /*position: absolute;*/
    top: 0;
    width: 250px;
    margin: 0;
    list-style: none;
   
   
}

.sidenav {
  
    width: 0;
    position: fixed;
    z-index: 1;
    top: 50px;
    left: 0;
    
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}
.a-side i{
    position: relative;
    right: 20px;

}

.sidenav a {
   
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: #f1f1f1;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}
.sidenav ul li{
    background-color: #171717;
    color: #a7b0ba;
    border: 0;
    font-size: 15px;
}


#second-header{
background-color: black;
height: 50px;
position: relative;
top: 50px;
width: 



}

#wrapper.toggled {
    padding-left: 250px;
}
#main-container{
    position: relative;
    top: 90px;

}
#main
{
    padding-top: 40px;
    position: relative;
    border-left: 2px solid black;


}


#header{
    height: 80px;
}
#first{
    height: 55px;
}
#second{

    background-color: black;
    height: 40px;
    position: relative;
    bottom: 24px;
    width: 1600px;
    right: 15px;
}
#second h3{
    color: #ffffff;
    font-family: sans-serif;
    position:relative;
    left:16px;
    top: 10px;
   
}
#yash-logo{
    border-right: 1px solid #e9e9e6;
    width: 80px;
    position: relative;
  right: 30px;
    font-size: 10px;
}
#icon{
    color: #c3c3c3;
    position: relative;
    left: 1195px;
    bottom: 30px;
    font-size: 20px;
}


.footer {
    position: fixed;
    left: 0px;
    bottom: 0;
    width: 100%;
     background: #1d2127;
    color: white;
    text-align: center;
  

}
.footer p{

    position: relative;
    right: 50px;
    font-weight: 200;

}
#navigation-top {
    display: flex;
}
#navigation-top li{
    list-style: none;
    
    padding-top: 8px;
}
.blog-post h2{
    color: #1092d3;
}
.blog-post .label{
    background-color: #0088cc;
}
.dropdown .btn{
    background-color: white;
    color: #0088cc;
    
    font-size: 12px;
    height: 50px;
    padding-bottom: 20px;
    margin-left: 20px;
}
.dropdown .btn:hover{
     background-color:#0088cc;
     color: white;
}
.main-header a{
    position: relative;
    top: 7px;
    color: #1f8ccd;
     font-weight: 600;

}
.group4-pager ul{
    
}
.group4-pager li{
    display: inline;
    font-weight: 500;
 
    padding: 6px;

}
.group4-pager li a{
    text-decoration: none;
}
#next{
    position: relative;
    left: 15px;
    
}
.group4-pager a:hover{
    border-bottom: 2px solid #0088cc;
    color: #0088cc;
    padding-bottom: 10px;
}
.group4-pager a:active{
     border-bottom: 2px solid #0088cc;
}

.dropdown{
    height: 80px;

}
#post-btn{
    position: relative;
    top: 4px;
    height: 25px;
}
#sidebar-brand{
    list-style: none;
}
.social-icons{
     color: #c3c3c3;
    position: relative;
    right: 1195px;
    bottom: 30px;
    font-size: 20px;
}

 .a-side{
    color: #d64b4b;
 }
 .a1-side{
    color: #d64b4b;
 }
 .aa-side{
    color:#0090d9;
 }
  .a2-side{
    color:#0090d9;
 }
 .aaa-side{
   color: #4dd79c;
 }
 .a3-side{
   color: #4dd79c;
 }
 .a4-side{

    color:#d9a300;
 }
 .a5-side{
    color: #c926ff;

 }
.pull-right{

    border-radius: 10px;
    margin-top: 10px;
 }
 .sidebar-brand{
    list-style: none;
 }
 
  </style>
        </head>
         <body>
         <!--header starts   -->        
         <nav class="navbar navbar-default navbar-fixed-top" id="header">
  <div class="container-fluid">
    <div id="first">  <header class="main-header">
                    <div class="row">
                        <div class="container-fluid">
                            <div class="col-md-12">
                                <div class="col-sm-6" >
                                    <img  id="yash-logo" src="yash-logo.svg" class="yashlogo pull-left" alt="YAsh Logo">
                                    <ul id="navigation-top">
                                      <li>
                                        <a href="#">HOME</a>
                                      </li>
                                     <li >
      <div class="dropdown">
    <button id="post-btn" class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">POSTS
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">HTML</a></li>
      <li><a href="#">CSS</a></li>
      <li><a href="#">JavaScript</a></li>
      <li class="divider"></li>
      <li><a href="#">About Us</a></li>
    </ul>
  </div>
                                     </li>
                                    </ul>
                                </div>
                                <div class="col-sm-6" id="top-right">
                                 <a href="login.jsp" class="pull-right btn btn-default" style="margin-top:-1px;margin-left:5px;">Login</a>
                                    <input type="text" class="search-box pull-right" placeholder="Search.....">
        							 
  							

	
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </header>
</div>
<div id="second" style="margin-top: 20px">
<div ><h3 style="margin-top:-5px">Blog Home</h3></div> 
<div>
  <a href="#" id="icon"><i class="fa fa-home" aria-hidden="true" style="position: relative;
    top: 35px;"></i></a>
</div>

</div>

  </div>
</nav>
           

            <!--header ends -->
            <!--second header starts-->
            
            <!--second-header ends-->
           <!-- /#Page Content--> 
           
            <div class="row" id="main-container">
              <div class="col-md-3" id="aside">
                <div id="wrapper">
             <div id="sidebar-wrapper">
				
              <ul class="sidebar-nav">
                <li class="sidebar-brand">
                  <a href="#">
                   LATEST POSTS
                  </a>
                </li>
                <ul>
               
                <li class="a-side">
                  <a href="#" >Best Html Tutorial</a>
                </li>
                <li class="aa-side">
                  <a href="#" >CSS3 Tricks</a>
                </li>
              
                <li class="aaa-side">
                  <a href="#" >JavaScript zero to hero</a>
                </li>
                </ul>
                </ul>
                <ul class="sidebar-nav">
                <li class="sidebar-brand">
                  <a href="#">
                   POST CATEGORIES
                  </a>
                </li>
                <ul>
                <li class="a1-side">
                  <a href="HTMLController?category_id=1" >HTML5</a>
                </li>
                <li class="a2-side">
                  <a href="CSSController?category_id=2" >CSS3 </a>
                </li>
              
                <li class="a3-side">
                  <a href="#" >BootStrap</a></li>
                     <li class="a4-side">
                  <a href="JavaScriptController?category_id=5" >JavaScript</a>
                </li>
                   <li class="a5-side">
                  <a href="#" >jQuery</a>
                </li>
               </ul>
              </ul>
            </div>
       
              </div>
            </div>
            <!--main panel starts------------------------------>
            
            <!--Carousel starts------>
            <div class="col-sm-9" id="main">
               <div class="panel panel-default">
         <div class="panel-heading">
          <h2 class="panel-title"><h3>Recent post slider</h3></h2>
        </div>
        <div class="panel-body" id = "slider-container" style=" height: 340px">

         <div class="container-fluid">
			
          <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
              <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
              <li data-target="#myCarousel" data-slide-to="1"></li>
              <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" id="slider">

              <div class="item active">
                <img src="Capture.PNG" alt="pic1" style="width:100%;">
                <div class="carousel-caption">

                </div>
              </div>

              <div class="item">
                <img src="Capture.PNG" alt="pic2" style="width:100%;">
                <div class="carousel-caption">

                </div>
              </div>

              <div class="item">
                <img src="Capture.PNG" alt="pic3" style="width:100%;">
                <div class="carousel-caption">

                </div>
              </div>

            </div>

            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
              <span class="glyphicon glyphicon-chevron-left"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
              <span class="glyphicon glyphicon-chevron-right"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
        </div> 


      </div>
          </div>
           <!--Carousel ends-->
           
            <!--blog container starts-->
            <div class="panel panel-default">

      <div class="panel-body">



       <div class = "blog-post">

	<c:forEach var="blog" items="${blogs}">
         <span class="label label-primary">Admin</span>
        	<h2>${blog.title}</h2>
					

         <h5><span class="glyphicon glyphicon-time"></span>${blog.created_at}</h5>
         <br>
         <p>${fn:substring(blog.body, 0, 50)}<a href="${blog.id}">....</a></p>
         <a href="new_blog1.html">read more</a>
         </c:forEach>
       </div>

      
      
      <hr>
      <div>
        <ul class="group4-pager">
         <li> <a href="#">Prev</a></li>
         <li> <a href="#" id = "next">Next</a></li>
        </ul>
      </div>
    </div>

  </div>
            <div class="footer">
    <p>&copy 2018 YASH Technologies pvt. ltd.</p>
           </div>
               
              
            <!-- blog container ends-->
            </div>

            <!--main panel ends-->
            </div>


           
               
       
                   <!-- /#page-content-wrapper -->        
        
             <!-- /#wrapper Menu Toggle Script -->

                 
             
        </body> 

        </html>


