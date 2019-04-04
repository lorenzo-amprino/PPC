var app = angular.module("ppc", ['ngRoute']);
app.config(function($routeProvider, $locationProvider){
	$routeProvider.when('/PPC/',{
		controller:'puzzleController',
		templateUrl:'pages/puzzle.html'
	});
	
	$locationProvider.html5Mode({
		enabled:true,
		requireBase: false
	})
});
