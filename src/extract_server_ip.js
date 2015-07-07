function create_json_element(ip, name) {
    return "{\n" +
        "\"name\": \"" + name + "\",\n" +
        "\"ip\": \"" + ip + "\"\n" +
        "}"
}

var counter = 1;
var result = "";
$.each($(".order tr"), function (index, value) {
    var description = $(value).find("td:nth-child(4)").text();
    var ip = $(value).find("td:nth-child(2)").text();
    var country = $(value).find("td:nth-child(3)").text();
    if ($(value).children("td").length == 6
        && description.indexOf("免费") == -1
        && description.indexOf("禁视频") == -1
        && description.indexOf("国内线路") == -1) {
        result += create_json_element(ip, "51VPN " + counter + " - " + country) + ",\n";
        counter++;
    }
});
console.log(result);
