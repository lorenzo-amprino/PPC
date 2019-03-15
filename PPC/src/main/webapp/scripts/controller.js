app.controller('controller', function($scope) {

	$scope.intestazione = 'hello world!';

	$scope.cambiaMessaggio = function() {
		if ($scope.intestazione.indexOf('ciao') >= 0) {
			$scope.intestazione = 'hello world!';
		} else {
			$scope.intestazione = 'ciao mondo!';
		}
	}
});