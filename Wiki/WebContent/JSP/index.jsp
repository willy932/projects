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

   <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/blog-post.css" rel="stylesheet">

    <script src="../js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>


    <title>Woukoupoudia</title>


</head>

<body style="padding-top:150px">

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
                <button class="btn btn-default" type="button" id="searchButton1">Search</button>
                </form>
                <form class="navbar-form navbar-right" role="search">
                    <button class="btn btn-default" type="button" id="loginButton">Login</button>

                </form>
            </div>
    </div>
</div>

 <!-- Page Content -->
    <div class="container">

        <div class="row">

	<p><a href="creation_article.jsp" class="btn btn-danger btn-xs" role="button">Ajouter Article</a>
	<s:iterator value="lst">
       <div class="col-xs-18 col-sm-6 col-md-3">
          <div class="thumbnail">
            <a href="#">
                    <img class="img-responsive" src=<s:property value="image"/> alt="">
                </a>
              <div class="caption">
                <h4><s:property value="titre"/></h4>
				<h4><s:property value="date"/></h4>
                <p><s:property value="description"/></p>
                <p><a href="#" class="btn btn-info btn-xs" role="button">Consulter</a> <a href="#" class="btn btn-default btn-xs" role="button">Noter</a></p>
            </div>
          </div>
        </div>
	</s:iterator>
    </div>
    <!-- Login Modal -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
    aria-hidden="true">
    <div class="modal-dialog modal-md">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    ×</button>
                <h4 class="modal-title" id="myModalLabel">
                    Login/Registration</h4>
            </div>
            <div class="modal-body">
                        <!-- Nav tabs -->
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#Login" data-toggle="tab">Login</a></li>
                            <li><a href="#Registration" data-toggle="tab">Registration</a></li>
                        </ul>
                        <!-- Tab panes -->
                        <div class="tab-content">
                            <div class="tab-pane active" id="Login">
                                <form role="form" class="form-horizontal">
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">
                                        Email</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" id="email1" placeholder="Email" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1" class="col-sm-2 control-label">
                                        Password</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" id="exampleInputPassword1" placeholder="Email" />
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                        <button type="button" class="btn btn-primary">
                                            Submit</button>
                                        <a href="javascript:;">Forgot your password?</a>
                                    </div>
                                </div>
                                </form>
                            </div>
                            <div class="tab-pane" id="Registration">
                                <form role="form" class="form-horizontal">

                                <div class="form-group">
                                    <label for="login" class="col-sm-2 control-label">
                                        Login</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="login" placeholder="Login" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">
                                        Email</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" id="email" placeholder="Email" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-sm-2 control-label">
                                        Password</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="password" placeholder="Password" />
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                        <button type="button" class="btn btn-primary">
                                            Save and Continue</button>
                                        <button type="button" class="btn btn-default">
                                            Cancel</button>
                                    </div>
                                </div>
                                </form>
                            </div>
                        </div>
            </div>
        </div>
    </div>
</div>
<!-- end of login modal -->

<!-- Search modal -->
<div class="modal fade" id="searchModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
    aria-hidden="true">
    <div class="modal-dialog modal-md">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    ×</button>
                <h4 class="modal-title" id="myModalLabel">
                    Search</h4>
            </div>
            <div class="modal-body">

                        <!-- Tab panes -->
                        <div class="tab-content">
                            <div class="tab-pane active" id="Login">
                                <form role="form" class="form-horizontal">
                                <div class="form-group">
                                    <label for="auteur1" class="col-sm-2 control-label">
                                        Auteur</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="auteur1" placeholder="Auteur" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="titre1" class="col-sm-2 control-label">
                                        Titre</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="titre1" placeholder="Titre" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="date1" class="col-sm-2 control-label">
                                        Date</label>
                                    <div class="col-sm-10">
                                        <input type="date" class="form-control" id="date1" placeholder="Date" />
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                        <button type="button" class="btn btn-primary btn-sm">
                                            Search</button>
                                    </div>
                                </div>
                                </form>
                            </div>
                        </div>
            </div>
        </div>
    </div>
</div>
<!-- End of search modal -->


        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Woukoupoudia 2017</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>
    </div>
    <!-- /.container -->


    <script type="text/javascript">
        $(document).ready(function()
        {
            $("#loginButton").click(function()
            {
                $('#myModal').modal('show');
            })
            $("#searchButton1").click(function()
            {
                $('#searchModal').modal('show');
            });
        });
    </script>
</body>

</html>
