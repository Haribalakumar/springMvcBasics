alert("hi");
function getallDdetails() {
    const uri = "http://localhost:9090/send";

    var name = document.getElementById("name").value;
    var age = document.getElementById("age").value;
    var location = document.getElementById("location").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    var phonenumber = document.getElementById("phonenumber").value;


    var xhttp = new XMLHttpRequest();
    xhttp.open("GET", uri, true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log('File uploaded successfully');
        }
    }
    console.log(name + " " + password + " " + phonenumber);
    alert(name + " " + password + " " + phonenumber);
};