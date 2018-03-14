"use strict";

var User = angular.module("UserCtrl", []);

User.controller('loginCtrl',function ($rootScope, $scope, $routeParams) {
    $rootScope.show_sitebar = false;
    //选择显示tab页
    $scope.loginshow = $routeParams.tab;
    $scope.changeLoginTab = function (tab) {
        $scope.loginshow = tab
    }
    //是否10日免登
    $scope.unloginflag = false
    $scope.unlogin = function () {
        $scope.unloginflag = !$scope.unloginflag
        console.log($scope.unloginflag)
    }
})

User.controller('testCtrl',function ($rootScope, $scope) {
    $rootScope.show_sitebar = false;
    $scope.unloginflag = false
    $scope.unlogin = function () {
        $scope.unloginflag = !$scope.unloginflag
        console.log($scope.unloginflag)
    }
    // $scope.loginshow = $routeParams.tab;
    // $scope.changeLoginTab = function (tab) {
    //     $scope.loginshow = tab
    // }
})