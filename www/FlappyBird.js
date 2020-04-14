var exec = require('cordova/exec');

function plugin() {

}

plugin.prototype.startGame = function() {
    alert("xxx");
    exec(function(res){}, function(err){}, "FlappyBird", "startGame", []);
}

module.exports = new plugin();
