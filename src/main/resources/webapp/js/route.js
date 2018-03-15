"use strict";
var Route = angular.module("Route", ['ngRoute']);

//配置路由
Route.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.when('/index', {
            templateUrl: 'views/home.html',
            controller: "homeCtrl"
        }).when('/about', {
            templateUrl: 'views/about.html',
            controller: "aboutCtrl"
        }).when('/login/:tab', {
            templateUrl: 'views/login/login.html',
            controller: "loginCtrl"
        }).otherwise({
            redirectTo: "/index"
        })
    }]);