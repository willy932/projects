
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

    <!-- jQuery -->
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
                <button class="btn btn-default" id="searchButton">Search</button>
                </form>
                <form class="navbar-form navbar-right" role="search">
               <a href="manage_article.html" class="btn btn-info" role="button">Gérer les articles</a>
               <button class="btn btn-danger">Déconnexion</button>


                </form>
            </div>
    </div>
</div>

    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <!-- Blog Post Content Column -->
            <div class="col-lg-12">

                <!-- Blog Post -->

                <!-- Title -->
                <h1>Ghost</h1>

                <!-- Author -->
                <p class="lead">
                    by <a href="#">Bryan</a>
                </p>

                <hr>

                <!-- Date/Time -->
                <p><span class="glyphicon glyphicon-time"></span>Posté le 13 Mars à 14h21</p>

                <hr>

                <!-- Preview Image -->
                <img class="img-responsive" src="../css/images/ghost2.jpg" alt="">

                <hr>

                <!-- Post Content -->
                <p class="lead">Ghost est un groupe suédois de heavy metal formé en 2008 à Linköping. Son style musical, qui mêle influences pop et sonorités proches du hard rock, tranche avec son image, plus proche de l'univers du black metal. Les membres du groupe présentent la particularité de n'avoir pas révélé leur identité, évoluant dans l'anonymat et portant des masques sur scène.</p>
                <p>Le groupe a développé un univers inspiré du cinéma d'horreur et de la liturgie catholique. Le chanteur incarne un Pape sataniste, appelé Papa Emeritus, épaulé par ses disciples, les Nameless Ghouls ou « Goules Sans Nom ». Les tenues des membres, ainsi que la mise en scène et les décors des concerts, font ainsi référence à la mythologie satanique et évoquent l'univers du black metal. En outre, les musiciens usent de chœurs et de paroles en latin, rappelant la musique liturgique catholique.</p>
                <p>Ghost connaît le succès dès la sortie de son premier album en 2010. Son deuxième album accroît la popularité du groupe, notamment aux États-Unis où il est dénommé Ghost B.C. Le dernier en date, Meliora (2015), rencontre un succès dépassant les seuls amateurs de heavy metal et conduit le groupe à se produire dans les plus grands festivals européens.</p>

                <hr>

                <!-- Blog Comments -->

                <!-- Comments Form -->
                <div class="well">
                    <h4>Laisser un commentaire:</h4>
                    <form role="form">
                        <div class="form-group">
                            <textarea class="form-control" rows="3"></textarea>
                        </div>
                        <button type="submit" class="btn btn-primary">Enregister</button>
                    </form>
                </div>

                <hr>

                <!-- Posted Comments -->

                <!-- Comment -->
                <div class="media">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="../css/images/ghost_singer.png" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">Bobby
                            <small>Le 13 Mars à 14h21</small> <button class="btn btn-danger btn-xs" id="delete">Supprimer</button>
                        </h4>
                        La cérémonie des Grammis Awards 2017 s’est tenue hier soir à Stockholm, en Suède. Un Ghoul y était présent, puisque le groupe était nominé dans la catégorie Hard Rock/Metal Act Of The Year, auprès de, entre autre, In Flames, et Dark Tranquillity.
                        Vous vous en doutez, le groupe a remporté le prix, ce qui représente leur troisième victoire aux Grammis Awards. Bravo à eux !
                    </div>
                </div>

                <!-- Comment -->
                <div class="media">
                    <a class="pull-left" href="#">
                        <img class="media-object" src="../css/images/parkway.jpg" alt="">
                    </a>
                    <div class="media-body">
                        <h4 class="media-heading">Jack
                            <small>Le 13 Mars à 14h21</small> <button class="btn btn-danger btn-xs" id="delete">Supprimer</button>
                        </h4>
                        Vous l’attendiez depuis longtemps, voici enfin les dates de la tournée européenne de la tournée Popestar 2017.
                        Le groupe ne fera qu’un seul arrêt en France, à l’Olympa de Paris, mais passera également par la Belgique et le Luxembourg.
                        Les pré-ventes démarrerons ce 29 novembre. Soyez prêts !
                        <!-- Nested Comment -->
                        <div class="media">
                            <a class="pull-left" href="#">
                                <img class="media-object" src="../css/images/parkwaydrive.jpg" alt="">
                            </a>
                            <div class="media-body">
                                <h4 class="media-heading">Robert
                                    <small>Le 13 Mars à 14h21</small> <button class="btn btn-danger btn-xs" id="delete">Supprimer</button>
                                </h4>
                                Le groupe a réussi l’exploit de remplir l’Olympia en 48h seulement!
                            </div>
                        </div>
                        <!-- End Nested Comment -->
                    </div>
                </div>

            </div>


        </div>
        <!-- /.row -->

<!-- Delete com modal -->
<div class="modal fade" id="delModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
    aria-hidden="true">
    <div class="modal-dialog modal-md">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    ×</button>
                <h4 class="modal-title" id="myModalLabel">
                    Delete Com</h4>
            </div>
            <div class="modal-body">

                        <!-- Tab panes -->
                        <div class="tab-content">
                            <div class="tab-pane active" id="Login">
                                <form role="form" class="form-horizontal">
                                <div class="form-group">
                                    <label for="auteur1" class="col-sm-2 control-label">
                                        Raison</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="2" id="raison" placeholder="Raison"></textarea>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                        <button type="button" class="btn btn-danger btn-sm">
                                            Delete</button>
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
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>

    </div>
    <!-- /.container -->

<script type="text/javascript">
        $(document).ready(function(){
            $('#delete').click(function(){
                $('#delModal').modal('show');
            });
        })

    </script>
</body>

</html>
