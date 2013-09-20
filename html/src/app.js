angular.module('app', []).
 
  //definimos las rutas de la 'app'
  config(['$routeProvider', function($routes) {
 
  $routes.
      when('/libros', {
          templateUrl: 'src/views/libros-list.html',
          controller: LibrosListController
          }).
 
      //mediante dos puntos (:) definimos un parámetro
      when('/libro/:libroId', {
          templateUrl: 'src/views/libro.html',
          controller: LibroDetailController
          }).
          
      when('/nuevo_libro', {
          templateUrl: 'src/views/nuevo_libro.html',
          controller: NuevoLibroController
          }).   
 
      //cualquier ruta no definida
      otherwise({
          redirectTo: '/libros'});
 
}]);

