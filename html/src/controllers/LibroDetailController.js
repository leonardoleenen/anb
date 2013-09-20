function LibroDetailController($scope, $http, $routeParams) {
  $scope.id = $routeParams.libroId;
 
  $http.get('data/libro'+$scope.id+'.json').success(function(data) {
      $scope.libro = data[0];
  });
 
}