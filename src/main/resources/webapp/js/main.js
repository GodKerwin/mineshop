"use strict";
var App = angular.module("myApp", [
    'Route',
    'ui.bootstrap',
    'ngCookies',
    'CommService',
    'ModalService',
    'ModalCtrl',
    'UserCtrl'
]);

//index控制器
App.controller('myCtrl', function ($rootScope, $scope, $location, mine) {
    $scope.moveTo = function (url) {
        $location.url(url);
    };

    $scope.logout = function () {

    };
});

//关于控制器
App.controller('aboutCtrl', function ($rootScope, $scope, $location, mine) {
    $rootScope.show_sitebar = false;
    console.log("this is about controller");
});

//海购首页控制器
App.controller('homeCtrl', function ($rootScope, $scope, $location, $timeout, HttpProvider, mine) {
    $rootScope.show_sitebar = true;
    $scope.init = function () {
        queryIndexAds();
        queryCategorys();
    };
    var queryIndexAds = function () {
        var Params = {
            method: 'post',
            url: 'front/ad/queryIndexAds',
            data: {}
        };
        HttpProvider.call(Params).then(function (data) {
            if (data) {
                $scope.indexAds = data
            } else {
                mine.alert('发生未知错误');
            }
        }, function (error) {
            mine.alert('发生未知错误');
        })
    };
    var queryCategorys = function () {
        var Params = {
            method: 'post',
            url: 'front/category/queryCategorys',
            data: {}
        };
        HttpProvider.call(Params).then(function (data) {
            if (data) {
                $scope.categorys = data
            } else {
                mine.alert('发生未知错误');
            }
        }, function (error) {
            mine.alert('发生未知错误');
        })
    };
    $("#img-carousel").carousel('cycle');
    $scope.prev = function () {
        $("#img-carousel").carousel('prev');
    };
    $scope.next = function () {
        $("#img-carousel").carousel('next');
    };
});