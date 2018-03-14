"use strict";
/**
 * Created by Xul on 2017/3/16.
 */
var CommService = angular.module("CommService", []);

CommService.service('HttpProvider', function ($http, $q, mine) {
    this.call = function (Params) {
        var _data = $q.defer();
        $http({
            method: Params.method,
            url: Params.url,
            data: JSON.stringify(Params.data)
        }).then(function (result) {
            if (result.data.code === 0) {
                _data.resolve(result.data.data)
            } else {
                mine.alert(result.data.message)
            }
        }).catch(function (result) {
            console.error(result)
            mine.alert('发生未知错误');
        });
        return _data.promise;
    }
});