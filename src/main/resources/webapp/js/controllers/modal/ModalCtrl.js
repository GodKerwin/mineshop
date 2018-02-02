/**
 * Created by Xul on 2017/5/16.
 */
var ModalCtrl = angular.module('ModalCtrl', []);

ModalCtrl.controller('AlertCtrl', function($scope, $modalInstance, message) {
    $scope.message = message;
    $('body').keypress(function(event){
        var code = event.keyCode || event.which;
        if (code === 13) {
            $scope.$apply(function () {
                $modalInstance.close(true);
            });
        }
    });
    $scope.ok = function () {
        $modalInstance.close(true);
    };
});

ModalCtrl.controller('ConfirmCtrl', function($scope, $modalInstance, message) {
    $scope.message = message;
    $scope.ok = function () {
        $modalInstance.close(true);
    };
    $scope.cancel = function () {
        $modalInstance.close(false);
    };
});