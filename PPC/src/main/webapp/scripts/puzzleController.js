app.controller('puzzleController', function($scope, $http) {

	$scope.intestazione = 'controller puzzle';

	$scope.puzzle = [];
	
//	$scope.createPuzzle = function(){
//		$scope.puzzle = [];
//		for(let i=0; i<$scope.rows; i++){
//			var row = [];
//			for(let j=0; j<$scope.cols; j++){
//				row[j]='.';
//			}
//			$scope.puzzle.push(row);
//		}
//	}

	$scope.createPuzzle = function(){
		$http.post('rest/createPuzzle', {			
				col: $scope.cols,
				row: $scope.rows
		}).then(function(response){
			$scope.puzzle = response.data.puzzle.schema;
		})
	}
	
	$scope.retriveWordList = function(){
		$http.get('rest/retriveWordList',{
			id: 'id'
		}).then(function(response){
			$scope.wordList = response.data.wordList;
		})
	}
	
	$scope.retriveWordList();

	$(document).ready(function(){
		$('table tbody tr td').on('hover', function () {
	        $(this).toggleClass('cell-selected');
	    });
	});
	
});