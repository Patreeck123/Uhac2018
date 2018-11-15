<?php
$host = "localhost";
$user = "id6731164_stress";
$password ="apjr4444";
$database = "id6731164_stirectolibrary";
$con = mysqli_connect($host, $user, $password, $database);

$username=filter_input(INPUT_POST,"username");
$password=filter_input(INPUT_POST,"password");

$sql="select * from studentlist where STUDENT_NUMBER='$username' AND PASSWORD='$password';";
$result=mysqli_query($con,$sql);
while($row=mysqli_fetch_array($result))
{
 $w=$row['STUDENT_NUMBER'];
}
if($w=="")
{
$sql2="select * from facultylist where FACULTY_NUMBER='$username' AND PASSWORD='$password';";
$result2=mysqli_query($con,$sql2);
while($roww=mysqli_fetch_array($result2))
{
 $ww=$roww['FACULTY_NUMBER'];
}
if($ww=="")
{
$sql3="select * from stafflist where STAFF_NUMBER='$username' AND PASSWORD='$password';";
$result3=mysqli_query($con,$sql3);
while($roww2=mysqli_fetch_array($result3))
{
 $ww2=$roww2['STAFF_NUMBER'];
}
if($ww2=="")
{
echo '0';
}
else
{
echo $ww2;
}
}
else
{
echo $ww;
}
}
else
{
echo 'Student';
}


?>	