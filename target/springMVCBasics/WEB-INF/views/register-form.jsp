<!DOCTYPE html>
<html>

<head>
    <title>Employee Details Form</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
   
</head>

<body>

    <div class="container">
        <h2>Employee Details Form</h2>
        <form action="/demo/send" method="get">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control" id="name" name="name">
            </div>

            <div class="form-group">
                <label for="age">Age:</label>
                <input type="number" class="form-control" id="age" name="age">
            </div>

            <div class="form-group">
                <label for="gender">Gender:</label><br>
                <div class="form-check-inline">
                    <label class="form-check-label">
                        <input type="radio" class="form-check-input" id="male" name="gender" value="male">Male
                    </label>
                </div>
                <div class="form-check-inline">
                    <label class="form-check-label">
                        <input type="radio" class="form-check-input" id="female" name="gender" value="female">Female
                    </label>
                </div>
                <div class="form-check-inline">
                    <label class="form-check-label">
                        <input type="radio" class="form-check-input" id="other" name="gender" value="other">Other
                    </label>
                </div>
            </div>

            <div class="form-group">
                <label for="location">Location:</label>
                <select class="form-control" id="location" name="location">
                    <option value="newyork">New York</option>
                    <option value="losangeles">Los Angeles</option>
                    <option value="chicago">Chicago</option>
                    <option value="houston">Houston</option>
                </select>
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email">
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password">
            </div>

            <div class="form-group">
                <label for="phonenumber">Phone Number:</label>
                <input type="tel" class="form-control" id="phonenumber" name="phonenumber">
            </div>

            <button type="submit" class="btn btn-primary" >Submit</button>
        </form>
        <div id="employee-details"></div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


    <script>
       
       alert("hi");
// function getallDdetails() {
//     const uri = "http://localhost:9090/send";

//     var name = document.getElementById("name").value;
//     var age = document.getElementById("age").value;
//     var location = document.getElementById("location").value;
//     var email = document.getElementById("email").value;
//     var password = document.getElementById("password").value;
//     var phonenumber = document.getElementById("phonenumber").value;


//     var xhttp = new XMLHttpRequest();
//     xhttp.open("GET", uri, true);
//     xhttp.setRequestHeader("Content-type", "application/json");
//     xhttp.onreadystatechange = function () {
//         if (this.readyState == 4 && this.status == 200) {
//             console.log('File uploaded successfully');
//         }
//     }
//     console.log(name + " " + password + " " + phonenumber);
//     alert(name + " " + password + " " + phonenumber);
// };


// function getallDdetails() {
//     var name = $("#name").val();
//     var age = $("#age").val();
//     var gender = $("input[name='gender']:checked").val();
//     var location = $("#location").val();
//     var email = $("#email").val();
//     var password = $("#password").val();
//     var phonenumber = $("#phonenumber").val();

//     $.get("/demo/send", {
//         name: name,
//         age: age,
//         gender: gender,
//         location: location,
//         email: email,
//         password: password,
//         phonenumber: phonenumber
//     }, function (response) {
//         $("#name-show").text(response.name);
//         $("#age-show").text(response.age);
//         $("#gender-show").text(response.gender);
//         $("#location-show").text(response.location);
//         $("#email-show").text(response.email);
//         $("#password-show").text(response.password);
//         $("#phonenumber-show").text(response.phonenumber);
//     });
// alert(name);
// console.log(name + " " +age);
// }

function getAllDetails() {
  const name = document.querySelector("#name").value;
  const age = document.querySelector("#age").value;
  const gender = document.querySelector("input[name='gender']:checked" ).value;
  const location = document.querySelector("#location").value;
  const email = document.querySelector("#email").value;
  const password = document.querySelector("#password").value;
  const phoneNumber = document.querySelector("#phonenumber").value;

  fetch("/demo/send", {
    method: "GET",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      name,
      age,
      gender,
      location,
      email,
      password,
      phoneNumber,
    }),
  })
    .then((response) => response.json())
    .then((data) => {
      document.querySelector("#name-show").textContent = data.name;
      document.querySelector("#age-show").textContent = data.age;
      document.querySelector("#gender-show").textContent = data.gender;
      document.querySelector("#location-show").textContent =
        data.location;
      document.querySelector("#email-show").textContent = data.email;
      document.querySelector("#password-show").textContent =
        data.password;
      document.querySelector("#phonenumber-show").textContent =
        data.phoneNumber;
    })
    .catch((error) => console.error(error));
}


    </script>
</body>

</html>