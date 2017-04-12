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

    <script src="https://cdn.ckeditor.com/4.6.1/standard-all/ckeditor.js"></script>
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
                <button class="btn btn-default" id="searchButton">Search</button>
                     <div class="input-group">
                        <s:textfield type="text" class="form-control" placeholder="Search" />
                        <div class="input-group-btn">
                          <button class="btn btn-default" type="submit">
                            <i class="glyphicon glyphicon-search"></i>
                          </button>
                        </div>

                    </div>
                </form>
                <form class="navbar-form navbar-right" role="search">
               <a href="profil.html" class="btn btn-default" role="button">Mendez Bryan</a>
               <a href="creation_article.html" class="btn btn-default" role="button">Créer un article</a>
               <button class="btn btn-danger">Déconnexion</button>


                </form>
            </div>
    </div>
</div>

 <!-- Page Content -->
    <div class="container">
        <h2><label for="editor1">Nouvel Article</label></h2>
        <div class="tab-content">
        <s:form action="artAction" role="form" class="form-horizontal">
            <div class="form-group">
                <label for="auteur1" class="col-sm-2 control-label">
                    Titre</label>
                <div class="col-sm-10">
                    <s:textfield name="titre" type="text" class="form-control" id="titre" placeholder="Titre" />
                </div>
                <label for="auteur1" class="col-sm-2 control-label">
                    Image</label>
                <div class="col-sm-10">
                    <s:textfield name="image" type="text" class="form-control" id="image" placeholder="Lien de l'image" />
                </div>
                <label for="auteur1" class="col-sm-2 control-label">
                    Description</label>
                <div class="col-sm-10">
                    <textarea name="description" class="form-control" rows="2" id="description" placeholder="Description"></textarea>
                </div>
                <label for="auteur1" class="col-sm-2 control-label">
                    Contenu</label>
                <div class="col-sm-10">
                    <textarea name="contenu" id="editor1">

        			</textarea>
                </div>
                <s:submit value="enregistrer"  align="center"></s:submit>
            </div>
        </s:form>
        </div>
        <!-- Aperçu -->

        <div class="row">
            <div class="col-xs-18 col-sm-6 col-md-3 col-md-offset-5">
              <div class="thumbnail">
                <a href="#">
                        <img class="img-responsive" src="http://placehold.it/400x300" id="aimage" width="400px" height="300px" alt="">
                    </a>
                  <div class="caption">
                    <h4 id="htitre">Titre</h4>
                    <p id="adescription">Cet emplacement correspond à la description de votre article</p>
                    <p><a href="#" class="btn btn-info btn-xs" role="button">Consulter</a> <a href="#" class="btn btn-default btn-xs" role="button">Noter</a></p>
                </div>
              </div>
            </div>
        </div>
        <!-- Edition de l'article -->
        

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
    <script>
    CKEDITOR.replace( 'editor1', {
        // Define the toolbar: http://docs.ckeditor.com/#!/guide/dev_toolbar
        // The standard preset from CDN which we used as a base provides more features than we need.
        // Also by default it comes with a 2-line toolbar. Here we put all buttons in a single row.
        toolbar: [
            { name: 'clipboard', items: [ 'Undo', 'Redo' ] },
            { name: 'styles', items: [ 'Styles', 'Format' ] },
            { name: 'basicstyles', items: [ 'Bold', 'Italic', 'Strike', '-', 'RemoveFormat' ] },
            { name: 'paragraph', items: [ 'NumberedList', 'BulletedList', '-', 'Outdent', 'Indent', '-', 'Blockquote' ] },
            { name: 'links', items: [ 'Link', 'Unlink' ] },
            { name: 'insert', items: [ 'Image', 'EmbedSemantic', 'Table' ] },
            { name: 'tools', items: [ 'Maximize' ] },
            { name: 'editing', items: [ 'Scayt' ] }
        ],
        // Since we define all configuration options here, let's instruct CKEditor to not load config.js which it does by default.
        // One HTTP request less will result in a faster startup time.
        // For more information check http://docs.ckeditor.com/#!/api/CKEDITOR.config-cfg-customConfig
        customConfig: '',
        // Enabling extra plugins, available in the standard-all preset: http://ckeditor.com/presets-all
        extraPlugins: 'autoembed,embedsemantic,image2,uploadimage,uploadfile',
        /*********************** File management support ***********************/
        // In order to turn on support for file uploads, CKEditor has to be configured to use some server side
        // solution with file upload/management capabilities, like for example CKFinder.
        // For more information see http://docs.ckeditor.com/#!/guide/dev_ckfinder_integration
        // Uncomment and correct these lines after you setup your local CKFinder instance.
        // filebrowserBrowseUrl: 'http://example.com/ckfinder/ckfinder.html',
        // filebrowserUploadUrl: 'http://example.com/ckfinder/core/connector/php/connector.php?command=QuickUpload&type=Files',
        /*********************** File management support ***********************/
        // Remove the default image plugin because image2, which offers captions for images, was enabled above.
        removePlugins: 'image',
        // Make the editing area bigger than default.
        height: 461,
        // An array of stylesheets to style the WYSIWYG area.
        // Note: it is recommended to keep your own styles in a separate file in order to make future updates painless.
        contentsCss: [ 'https://cdn.ckeditor.com/4.6.1/standard-all/contents.css', 'mystyles.css' ],
        // This is optional, but will let us define multiple different styles for multiple editors using the same CSS file.
        bodyClass: 'article-editor',
        // Reduce the list of block elements listed in the Format dropdown to the most commonly used.
        format_tags: 'p;h1;h2;h3;pre',
        // Simplify the Image and Link dialog windows. The "Advanced" tab is not needed in most cases.
        removeDialogTabs: 'image:advanced;link:advanced',
        // Define the list of styles which should be available in the Styles dropdown list.
        // If the "class" attribute is used to style an element, make sure to define the style for the class in "mystyles.css"
        // (and on your website so that it rendered in the same way).
        // Note: by default CKEditor looks for styles.js file. Defining stylesSet inline (as below) stops CKEditor from loading
        // that file, which means one HTTP request less (and a faster startup).
        // For more information see http://docs.ckeditor.com/#!/guide/dev_styles
        stylesSet: [
            /* Inline Styles */
            { name: 'Marker',           element: 'span', attributes: { 'class': 'marker' } },
            { name: 'Cited Work',       element: 'cite' },
            { name: 'Inline Quotation', element: 'q' },
            /* Object Styles */
            {
                name: 'Special Container',
                element: 'div',
                styles: {
                    padding: '5px 10px',
                    background: '#eee',
                    border: '1px solid #ccc'
                }
            },
            {
                name: 'Compact table',
                element: 'table',
                attributes: {
                    cellpadding: '5',
                    cellspacing: '0',
                    border: '1',
                    bordercolor: '#ccc'
                },
                styles: {
                    'border-collapse': 'collapse'
                }
            },
            { name: 'Borderless Table',     element: 'table',   styles: { 'border-style': 'hidden', 'background-color': '#E6E6FA' } },
            { name: 'Square Bulleted List', element: 'ul',      styles: { 'list-style-type': 'square' } },
            /* Widget Styles */
            // We use this one to style the brownie picture.
            { name: 'Illustration', type: 'widget', widget: 'image', attributes: { 'class': 'image-illustration' } },
            // Media embed
            { name: '240p', type: 'widget', widget: 'embedSemantic', attributes: { 'class': 'embed-240p' } },
            { name: '360p', type: 'widget', widget: 'embedSemantic', attributes: { 'class': 'embed-360p' } },
            { name: '480p', type: 'widget', widget: 'embedSemantic', attributes: { 'class': 'embed-480p' } },
            { name: '720p', type: 'widget', widget: 'embedSemantic', attributes: { 'class': 'embed-720p' } },
            { name: '1080p', type: 'widget', widget: 'embedSemantic', attributes: { 'class': 'embed-1080p' } }
        ]
    } );
</script>
<script type="text/javascript">
    $(document).ready(function()
    {
        $("#titre").keyup(function(){
            $("#htitre").text($("#titre").val());
        });
        $("#description").keyup(function(){
            $("#adescription").text($("#description").val());
        });
        $("#image").change(function(){
            loadimage();
        });
    });
    function loadimage()
    {
        if($("#image").val() != null)
            {
                $("#aimage").attr("src", $("#image").val());
            }
    }

</script>
</body>

</html>
