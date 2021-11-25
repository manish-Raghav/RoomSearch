
<?php
    $conn = mysqli_connect("localhost","root","","roomsdata");
 
     if($conn)
     {
         echo " Api is connect";
     }
     else{
         echo "some problem happning";
     }
         
 ?>

<!-- <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form  method="post" enctype="multipart/form-data">
     <label>  Input file</label>
     <input  type="file" name="image1"> <br>

       <label >Second Image</label> <br>  <br>
        <input Type ="file"  name="image2">  <br> <br>
    

        <label> third image</label> <br> 
       
        <input type="file" name="image3">  <br> 
        <label> fourth image</label> <br> <br>
        <input type="file" name="image4">
        <br>  <br> <br> 

        <label> Phone</label>
          <Input type="number" name="phone">  <br> <br>
              
        <label> Adress : =</label>
        <Input type="text" name="Adress">  <br> <br>

          <label > Rant :-</label>  
          <Input type="number" name="Rant">  <br> <br>

          <label> countpeople </label>
          <Input type="number" name="numberofpeople">  <br> <br> 
          <label> Descri : =</label>
        <Input type="text" name="Decri">  <br> <br> 
       <br>

       <button type="submit" name="upload">upload</button>

    </form> -->
    
 <?php

//  if(isset($_POST['upload']))
      {

//          print_r($_FILES['image1']);


//          $firstloc =$_FILES['image1']['tmp_name'] ?? "";
           

//         $movedata1= move_uploaded_file($firstloc,"upload/tj.jpg");

          
//           if($movedata1 ==true  )
//              {
//                  echo "image is uploded" ;     
//                 // die();

//         }
//          else{
//                  echo "image is not uploaded ";  
//                     die();   
//          }




//     }
  
        $email=$_POST['mail'] ?? "";
       $uname =$_POST['Name'] ?? "";
        $uphone =$_POST['phone'] ?? "";
        $uadress =$_POST['Adress'] ?? "";
        $urant =$_POST['Rant']  ?? "";
        $countpeople = $_POST['numberofpeople'] ?? "";
        $descripttion =$_POST['Dscri'] ?? "";
       //  $image1 =$_FILES['']
    

          $firstloc =$_FILES['image1']['tmp_name'] ?? "";
          $secondloc =$_FILES['image2']['tmp_name'] ?? "";
          $thirdloc = $_FILES['image3']['tmp_name'] ?? "";
          $forthloc =$_FILES['image4']['tmp_name'] ?? "";

         // //   $firstsize = $_FILES['image1']['size'];
    // //   $secondsize = $_FILES['image2']['size'];
    // //   $thirdsize = $_FILES['image3']['size'];
    // //   $fourthsize = $_FILES['image4']['size'];


          $firstname =$_FILES['image1']['name'] ?? "";
          $secondname =$_FILES['image2']['name'] ?? "";
          $thirdname =$_FILES['image3']['name'] ?? "";
          $fourthname =$_FILES['image4']['name']  ?? "";


          $firstdesi ="imageupload/".$firstname;
          $seconddesi ="imageupload/".$secondname;
           $thirddesi ="imageupload/".$thirdname;
          $fourthdesi ="imageupload/".$fourthname;
       
        //$email ="karansing123@";

            $movedata1= move_uploaded_file($firstloc,$firstdesi);
            $movedata2= move_uploaded_file($secondloc,$seconddesi);
             $movedata3= move_uploaded_file($thirdloc,$thirddesi);
            $movedata4= move_uploaded_file($forthloc,$fourthdesi);
           // $movedata1= move_uploaded_file($firstloc,"upload\tj.jpg");


           if($movedata2 ==true && $movedata1 ==true && $movedata3 ==true && $movedata4 ==true  )
          {
                  echo "image is uploded" ;     
                   // die();

            }
           else{
                  echo "image is not uploaded ";  
                  //die();   
          }

          $myquery ="INSERT INTO `rooms`(`mail`, `Name`, `Phone`, `Adress`, `Rant`, `numberofpeople`, `image1`, `image2`, `image3`, `image4`, `Dscri`) VALUES 
           ( '$email','$uname','$uphone' ,'$uadress' , '$urant', '$countpeople'  ,'$firstname' , '$secondname' , '$thirdname' ,'$fourthname' ,'$descripttion')";

               if(mysqli_query($conn, $myquery))
              {
              
                echo "data saved in database";
                   }   
               else{
                   echo "some problem in your dtabase";
                  // die();
              }                      
  


        }
 ?> 










  

