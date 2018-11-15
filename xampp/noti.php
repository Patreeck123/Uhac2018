<?php
$host = "localhost";
$user = "id6731164_stress";
$password ="apjr4444";
$database = "id6731164_stirectolibrary";
$con = mysqli_connect($host, $user, $password, $database);
$txt=$_POST["txt2"];
 $response=array();
$sql="select * from $txt2";
$result=mysqli_query($con,$sql);
while($row=mysqli_fetch_array($result))
{
 $w=$row['STUDENT_NUMBER'];
 
}
echo $w;
?>	