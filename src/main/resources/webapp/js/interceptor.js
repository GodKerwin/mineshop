var Interceptor = angular.module("Interceptor", []);

// Interceptor.factory('myInterceptor', function () {
//     var requestInterceptor = {
//         request: function(config){
//             var deferred = $q.defer();
//             someAsyncService.doAsyncOperation().then(function(){
//                 deferred.resolve(config);
//             }, function(){
//                 deferred.resolve(config);
//             });
//             return deferred.promise;
//         }
//     };
//
//     return requestInterceptor;
// });
//
// app.config(['$httpProvider', function ($httpProvider) {
//     $httpProvider.interceptors.push('myInterceptor');
// }]);