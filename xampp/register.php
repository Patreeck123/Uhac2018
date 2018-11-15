<?php
$host = "localhost";
$user = "id6731164_stress";
$password ="apjr4444";
$database = "id6731164_stirectolibrary";
$con = mysqli_connect($host, $user, $password, $database);
$bookid=$_POST["bookid"];
$user=$_POST["user"];
$sql11="select * from books where BOOK_ID='$bookid';";
$result11=mysqli_query($con,$sql11);
while($row11=mysqli_fetch_array($result11))
{
 $title=$row11['TITLE'];
 $author=$row11['AUTHORS'];
}

$sql2="select * from facultylist where FACULTY_NUMBER='$user';";
$result2=mysqli_query($con,$sql2);
while($roww=mysqli_fetch_array($result2))
{
 $ww=$roww['FACULTY_NUMBER'];
}
if($ww=="")
{
$sql3="select * from stafflist where STAFF_NUMBER='$user';";
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
$j="insert into pending values('$bookid','$title','$author','Staff Member','$ww2',NOW());";
 $con->query($j);
}
}
else
{
$j="insert into pending values('$bookid','$title','$author','Faculty Member','$ww',NOW());";
$con->query($j);
}


?>