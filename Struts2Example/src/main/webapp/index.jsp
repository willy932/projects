<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script>

var app=angular.module("myApp",[]);
app.controller("Controller",function($scope,$http){
	 $scope.showMe=false;
	 
	 $scope.DeleteArticle=function(x){
			$http({
		       	 method : "GET",
		       	 url : "delete",
		       	 params :{'id':x}
		    }).then(function mySucces(response) {
		    	alert("success");
		        $scope.showMe = response.data.status;
		        $scope.ListerArticle();
		    }, function myError(response) {
		       	 $scope.status = response.statusText;
		    })
		};
		
	$scope.ListerArticle=function(){
		$http({
	     	 method : "GET",
	     	 url : "allarticle"
	  }).then(function mySucces(response) {
	     $scope.articles = response.data.articles;
	  }, function myError(response) {
	     	 $scope.status = response.statusText;
	  })
	};
	
	$scope.UpdateArticle=function(id,titre,description,image,contents){
		$scope.id = id;
		$scope.titre = titre;
		$scope.description = description;
		$scope.image = image;
		$scope.contenue = contents;
	};
	
	$scope.SaveArticle=function(){
		$http({
	       	 method : "GET",
	       	 url : "save",
	       	 params :{'id':$scope.id, 'titre':$scope.titre,'description':$scope.description,'image':$scope.image,'contents':$scope.contenue,'status':'false'}
	    }).then(function mySucces(response) {
	        $scope.showMe = response.data.status;
	        $scope.ListerArticle();
	    }, function myError(response) {
	       	 $scope.status = response.statusText;
	    });
	};
	
	
});

</script>
<title>Struts Angular Hibernate</title>
</head>
<body  ng-controller="Controller">
<h1>Ajouter Article</h1>

<%-- <s:form action="save"> --%>
<%-- 	<s:textfield name="nom" label="Username"/> --%>
<%-- 	<s:password name="prenom" label="Password"/> --%>
<%-- 	<s:textfield name="tel" label="Username"/> --%>
<%-- 	<s:password name="mail" label="Password"/> --%>
<%-- 	<s:submit/> --%>
<%-- </s:form> --%>
<div class="container">
  <form name="myForm"  ng-submit="SaveArticle()">
  <div class="form-group row">
      <div class="col-sm-10">
        <input type="text" class="form-control" name="id" id="id" placeholder="Titre" ng-model="id" ng-show="false">
      </div>
    </div>
    <div class="form-group row">
      <label for="titre" class="col-sm-2 col-form-label">titre</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="titre" id="titre" placeholder="Titre" ng-model="titre">
      </div>
    </div>
    <div class="form-group row">
      <label for="description" class="col-sm-2 col-form-label">Description</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="description" id="description" placeholder="Description" ng-model="description">
      </div>
    </div>
    <div class="form-group row">
      <label for="image" class="col-sm-2 col-form-label">Image</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="image" id="image" placeholder="imageUrl" ng-model="image">
      </div>
    </div>
        <div class="form-group row">
      <label for="contenue" class="col-sm-2 col-form-label">Contenue</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" name="contenue" id="contenue" placeholder="contenue" ng-model="contenue">
      </div>
    </div>
    <div class="form-group row" ng-show="showMe">
      <div class="col-sm-10">
				<span >Article Enregistré avec success</span>
      </div>
    </div>
    <div class="form-group row">
      <div class="offset-sm-2 col-sm-10">
        <button type="submit" class="btn btn-primary">Enregistrer</button>       
      </div>
       <div class="offset-sm-2 col-sm-10">
        
      </div>
    </div>
  </form>
</div>
<button class="btn btn-success"  ng-click="ListerArticle()">Liste des Article</button>

<table class="table" >
	<thead>
		<tr>
		<th ng-show="false" >Id </th>
		<th>titre </th>
		<th>description</th>
		<th>image</th>
		<th>date</th>
		<th>Contenue</th>
		</tr>
	</thead>
	<tbody>
		<tr ng-repeat="c in articles">
		<td ng-show="false">{{c.id}}</td>
		<td >{{c.titre}}</td>
		<td>{{c.description}}</td>
		<td>{{c.image}}</td>
		<td>{{c.dateCreation}}</td>
		<td>{{c.contents}}</td>
		<td><button ng-click="DeleteArticle(c.id)" class="btn btn-primary">Delete</button><button ng-click="UpdateArticle(c.id,c.titre,c.description,c.image,c.contents)" class="btn btn-primary">Update</button></td>
		
		</tr>
	
	</tbody>
</table>
</body>
</html>