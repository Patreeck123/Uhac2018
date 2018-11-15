<?php
$host = "localhost";
$user = "id6731164_stress";
$password ="apjr4444";
$database = "id6731164_stirectolibrary";
$con = mysqli_connect($host, $user, $password, $database);
$response=array();
$sql="select * from books where CATEGORIES='Feasibility'";
$result=mysqli_query($con,$sql);
if(mysqli_num_rows($result)>0)
{
$response['success']=1;
$books=array();
while($row=mysqli_fetch_assoc($result))
{
array_push($books,$row);
}
$response['books']=$books;
}
else
{
$response['success']=0;
$response['message']='No data';
}
echo json_encode($response);
mysqli_close($con);
?>	