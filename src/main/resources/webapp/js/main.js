"use strict";
var App = angular.module("myApp", [
    'Route',
    'ui.bootstrap',
    'Interceptor',
    'ngCookies',
    'MineDirective',
    'CommService',
    'ModalService',
    'ModalCtrl'
]);

//index控制器
App.controller('myCtrl', function ($scope, $rootScope, $location, $window, $cookies, $timeout, mine) {

    $scope.auth = false;

    $scope.init = function () {

    };

    $scope.moveTo = function (url) {
        $location.url(url);
    };

    $scope.logout = function () {

    };
});

//关于控制器
App.controller('aboutCtrl', function ($scope, $location, mine) {
    console.log("this is about controller");
});

//海购首页控制器
App.controller('homeCtrl', function ($scope, $location, mine) {
    console.log("this is home controller");
    $("#img-carousel").carousel('cycle');
    $scope.prev = function () {
        $("#img-carousel").carousel('prev');
    };
    $scope.next = function () {
        $("#img-carousel").carousel('next');
    }
});