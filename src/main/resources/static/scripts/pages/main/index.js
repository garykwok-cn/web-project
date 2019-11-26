var index = function(){
    var obj = new Object();
    obj.init = function(){
        var data = { message1: "spring boot", message2: "mybatis，muti-datasource(transaction)"}
        var vm = new Vue({
            el: '#app',
            data: data
        });
        this.queryDataList();
        this.testTransaction();
    };
    obj.queryDataList = function(){
        var args={};
        $.ajax({
            type: "POST",
            url: "/test/querylist",
            contentType: 'application/json',
            data: JSON.stringify(args),
            dataType: "json",
            success: function(data){
                var app1 = new Vue({
                    el: '#app1',
                    data: data
                });
            }
        });
    };
    obj.testTransaction = function(){
        var args={};
        $.ajax({
            type: "POST",
            url: "/test/testtransaction",
            contentType: 'application/json',
            data: JSON.stringify(args),
            dataType: "json",
            success: function(data){

            }
        });
    };
    return obj;
};


$(document).ready(function(){
    var i = new index();
    i.init();
});
