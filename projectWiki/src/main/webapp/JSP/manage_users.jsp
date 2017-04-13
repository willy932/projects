
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
               <a href="manage_users.html" class="btn btn-warning" role="button">Gérer les utilisateurs</a>
               <button class="btn btn-danger">Déconnexion</button>


                </form>
            </div>
    </div>
</div>

    <!-- Page Content -->
    <div class="container">
    <h2>Gestion des utilisateurs</h2>
   <form>
    <div class="form-group">
    <label for="sel">Utilisateurs en attente</label>
    <select multiple class="form-control" id="sel">
        <option>Doofy</option>
        <option>Jacky</option>
        <option>Bobby</option>
        <option>Mommy</option>
      </select>
      <button class="btn btn-success" type="button">Valider</button> <button class="btn btn-danger" type="button">Refuser</button>
      <br>
      <hr>
      <label for="sel1">Choisir le type d'utilisateur</label>
      <select class="form-control" id="sel1">
        <option>Utilisateur normal</option>
        <option>Modérateur</option>
      </select>
      <br>
      <label for="sel2">Résultats - Shift pour sélectionner plusieurs utilisateurs</label>
      <select multiple class="form-control" id="sel2">
        <option>Kirk</option>
        <option>Corey</option>
        <option>Tobias</option>
        <option>Bruce</option>
      </select>
      <button class="btn btn-success" type="button">Valider</button> <button class="btn btn-warning" type="button">Droit Modérateur</button> <button class="btn btn-danger" type="button">Supprimer</button>
      <br>
    </div>
  </form>
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



</body>

</html>
