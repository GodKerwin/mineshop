/**
 * Created by Xul on 2017/3/16.
 */
var CommService = angular.module("CommService", []);

CommService.service('HttpProvider', function ($http, $q, Session, mine) {
    this.call = function (Params) {
        //引入$q是为了让该服务有个回调方法，固定写法
        var _data = $q.defer();
        Params.srv_name = "../" + Params.srv_name;

        //加入公共参数
        Params.data.user_id = Session.get('user_id');
        Params.data.role_id = Session.get('role_id');
        console.log(Params.srv_name, Params.data);

        //将参数传递的方式改成form
        var postCfg = {
            headers: {'Content-Type': 'application/x-www-form-urlencoded'},
            transformRequest: function (data) {
                return $.param(data);
            }
        };
        $http.post(Params.srv_name, Params.data, postCfg).then(function (data, status, headers, config) {
            console.log(data);
            data = data.data;
            var _code = data.code;
            if (_code === 0) {
                _data.resolve(data)
            } else {
                mine.alert(data.message)
            }
        }).catch(function (data, status, headers, config) {
            mine.alert('发生未知错误');
        });
        return _data.promise;
    }
});