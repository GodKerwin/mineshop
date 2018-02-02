/**
 * Created by Xul on 2017/5/16.
 */
var ModalService = angular.module("ModalService",[]);

ModalService.service('mine', function($modal){
    this.alert = function(message){
        return $modal.open({
            templateUrl: '/app/templates/modal/alert_modal.html',
            controller: 'AlertCtrl',
            size: 'sm',
            backdrop:'static',
            keyboard:false,
            resolve: {
                message : function () {
                    return message;
                }
            }
        }).result;
    };

    this.confirm = function(message){
        return $modal.open({
            templateUrl: '/app/templates/modal/confirm_modal.html',
            controller: 'ConfirmCtrl',
            size: 'sm',
            backdrop:'static',
            keyboard:false,
            resolve: {
                message : function () {
                    return message;
                }
            }
        }).result;
    };
});