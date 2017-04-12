
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



    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

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
                <button class="btn btn-default" type="button" id="searchButton">Search</button>
                </form>
                <form class="navbar-form navbar-right" role="search">
                <a href="creation_article.html" class="btn btn-default" role="button">Créer un article</a>
               <button class="btn btn-default" type="button" id="loginButton">Login</button>


                </form>
            </div>
    </div>
</div>

 <!-- Page Content -->
    <div class="container">
        <div class="row">

            <div class="col-md-7 ">

                <div class="panel panel-default">
                  <div class="panel-heading">  <h4>Profil</h4></div>
                    <div class="panel-body">
                        <div class="box box-info">
                            <div class="box-body">
                                <div class="col-sm-6">
                                    <div  align="center"> <img alt="User Pic" src="https://i.ytimg.com/vi/8k2m5vpLXXk/hqdefault.jpg" id="profile-image1" class="img-circle img-responsive">
                                        <input id="profile-image-upload" class="hidden" type="file">
                                        <div style="color:#999;" >click here to change profile image</div>
                                        <!--Upload Image Js And Css-->

                                    </div>
                                <br>
                            <!-- /input-group -->
                                </div>
                                <div class="col-sm-6">
                                    <h4 style="color:#00b1b1;">Doofy</h4>
                                    <span><p>Killer</p></span>
                                </div>
                                <div class="clearfix"></div>
                                <hr style="margin:5px 0 5px 0;">


                                <div class="col-sm-5 col-xs-6 tital " >First Name:</div><div class="col-sm-7 col-xs-6 ">Doofy</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital " >Middle Name:</div><div class="col-sm-7">Ghostface</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital " >Last Name:</div><div class="col-sm-7">Gilmore</div>
                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital " >Date Of Joining:</div><div class="col-sm-7">15 Jan 2017</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital " >Date Of Birth:</div><div class="col-sm-7">11 Jun 1985</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital " >Place Of Birth:</div><div class="col-sm-7">Woodsboro</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>

                                <div class="col-sm-5 col-xs-6 tital " >Nationality:</div><div class="col-sm-7">American</div>

                                <div class="clearfix"></div>
                                <div class="bot-border"></div>


                        <!-- /.box-body -->
                            </div>
                    <!-- /.box -->
                        </div>
                    </div>
                </div>
            </div>
            <script>
              $(function() {
                $('#profile-image1').on('click', function() {
                    $('#profile-image-upload').click();
                });
            });
        </script>
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
        $(document).ready(function(){
            $('#loginButton').click(function(){
                $('#myModal').modal('show');
            })


            $("#searchButton").click(function(){
                $('#searchModal').modal('show');
            });
        })

    </script>
</body>

</html>
