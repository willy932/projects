<!DOCTYPE html>
<html ng-app="myApp">
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
var app = angular.module('myApp', []);

app.controller('MyCtrl', function($scope,$http){
	$scope.addData = function(){
		$http({
			method : 'GET',
			url : 'javaAngularJs',
			params : {'nom':$scope.nom, 'prenom':$scope.prenom, 'tel':$scope.tel, 'mail':$scope.mail}
		}).then(function mySucces(response){
			$scope.statut = response.data;
		}, function myError(response){
			$scope.statut = response.StatutText;
		}).then(function mySucces(response){
			$http({
				method : 'GET',
				url : 'ListClient'
			}).then(function mySucces(response){
				$scope.clients = response.data;
			}, function myError(response){
				$scope.statut = response.statutText;
			});
		});
	};
});
</script>

</head>
<body >
	<div ng-controller="MyCtrl">
		<form name="formAdd" ng-submit="addData()">
			<div  class="form-group">
		 <label for="nom">NOM</label>
          <input type="text" class="form-control" ng-model="nom" placeholder="Nom du client" aria-describedby="sizing-addon1"
            name="nom"><br>
         <label for="prenom">PRENOM</label>
          <input type="text" class="form-control" ng-model="prenom" placeholder="Prenom du client" aria-describedby="sizing-addon1"
            name="prenom"><br>
         <label for="tel">TEL</label>
          <input type="text" class="form-control" ng-model="tel" placeholder="Tel du client" aria-describedby="sizing-addon1"
            name="tel"><br>
         <label for="mail">MAIL</label>
          <input type="text" class="form-control" ng-model="mail" placeholder="Mail du client" aria-describedby="sizing-addon1"
            name="mail"><br>
            </div>
          <button  type="submit" class="btn btn-success">Enregistrer</button>
          <span>{{statut}}</span>
          <table class="table table-bordered">
          <thead>
          <th>NOM</th>
          	<th>PRENOM</th>
          	<th>TELEPHONE</th>
          	<th>EMAIL</th>
          	<th>ACTION</th>
          	</thead>
          <tr ng-repeat="c in clients">	
          	<td>{{c.nom}}</td>
          	<td>{{c.prenom}}</td>
          	<td>{{c.tel}}</td>
          	<td>{{c.mail}}</td>
          	<td><button  type="button" class="btn btn-warning">Modifier</button><button  type="button" class="btn btn-danger">Supprimer</button></td>
          	
          </tr>
          </table>
		</form>
	</div>
</body>
</html>
