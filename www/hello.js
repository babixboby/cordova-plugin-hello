/*global cordova, module*/
var exec = require('cordova/exec');

function plugin() {

}

plugin.prototype.new_activity = function() {
    exec(function(res){}, function(err){}, "Hello", "new_activity", []);
}

module.exports = new plugin();
