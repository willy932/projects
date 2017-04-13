<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Woukoupoudia</title>

   <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/blog-post.css" rel="stylesheet">

    <script src="../js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body style="padding-top=150px">

    <!-- Navigation -->
    <div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Woukoupoudia</a>
        </div>
            <div class="navbar-collapse collapse" id="navbar-main">
                <ul class="nav navbar-nav">
                </ul>
                <form class="navbar-form navbar-left">
                <button class="btn btn-default" id="searchButton">Search</button>
                </form>
                <form class="navbar-form navbar-right" role="search">
               <a href="profil.html" class="btn btn-default" role="button">Noula</a>
               <a href="creation_article.jsp" class="btn btn-default" role="button">Créer un article</a>
               <button class="btn btn-danger">Déconnexion</button>


                </form>
            </div>
    </div>
</div>

    <!-- Page Content -->
    <div class="container" style="padding-top : 150px">

        <div class="row"><br/>

            <!-- Blog Post Content Column -->
            <div class="col-lg-12">
			</div>
             <div class="col-xs-18 col-sm-6 col-md-3"> 
             			<div class="thumbnail">
	<s:a href="index.jsp">Accueil</s:a>
	 
		<fieldset>  
		
		<s:label>image 		  :</s:label><img src=<s:property value="image"/>/><br/>
		 
		 <s:label>Id 		  :</s:label><s:property value="idArt"/><br/>
		<s:label>Titre 		  :</s:label><s:property value="titre"/><br/>
		<s:label>date :</s:label><s:property value="date"/><br/>
		<s:label>description :</s:label><s:property value="description"/><br/>
		<s:label>contenu :</s:label><s:property value="contenu"/><br/>
		</fieldset>  
	 	 <a href="#" class="btn btn-default btn-xs" role="button">Noter</a>
		</div>				
						</div>
                </div>

           


        
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="../js/jquery.js"></script>

</body>

</html>
