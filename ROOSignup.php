<?php  
 $conn = mysqli_connect("localhost","root","","roomsdata");
 

    if($conn ==TRUE)
  {echo "sucess";}
  else
  {echo "unsucess" ;}

  @$Email=$_POST["email"];
  @$name=$_POST["Name"];

  $query = "INSERT INTO `signup`(`email`, `Name`) VALUES ('$Email','$name')";
     mysqli_query($conn ,$query);
    echo json_encode(array('response' =>"insrted successfully"));




// $conn = mysqli_connect("localhost","root","","roomsdata");
// if (mysqli_connect_errno()) {
//   echo "Failed to connect to MySQL: " . mysqli_connect_error();
//   exit();
// }

//       $Email=$_POST["email"];
//        $name=$_POST["Name"];

// // Perform query
// if ($result = mysqli_query($con,  "INSERT INTO `signup`(`email`, `Name`) VALUES ('$Email','$name')")) {
//   echo "Returned rows are: " . mysqli_num_rows($result);
//   // Free result set
//   mysqli_free_result($result);
// }



?>   



