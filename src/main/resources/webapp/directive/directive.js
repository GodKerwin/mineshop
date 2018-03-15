"use strict";

var mineDirective = angular.module("MineDirective", []);

mineDirective.directive("timerButton", function ($timeout, $interval) {
    return {
        restrict : 'AE',
        scope: {
            showtimer : '='
        },
        replace: true,
        link: function (scope) {
            scope.time = false;
            scope.timeout = 60000;
            scope.timerCount = scope.timeout / 1000;
            scope.text = '获取验证码';

            scope.onclick = function () {
                scope.showtimer = true;
                scope.timer = true;
                scope.text = "秒后重发";
                var counter = $interval(function () {
                    scope.timerCount = scope.timerCount - 1;
                }, 1000);

                $timeout(function () {
                    scope.text = "获取验证码";
                    scope.timer = false;
                    $interval.cancel(counter);
                    scope.showtimer = false;
                    scope.timerCount = scope.timeout / 1000;
                }, scope.timeout);
            }
        },
        template: '<button ng-click="onclick()" ng-disabled="timer" class="btn btn-primary btn-regist" type="button"><span ng-if="showtimer">{{ timerCount }}</span>{{text}}</button>'
    };
});