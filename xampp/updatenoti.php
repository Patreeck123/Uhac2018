<?php
$host = "localhost";
$user = "id6731164_stress";
$password ="apjr4444";
$database = "id6731164_stirectolibrary";
$con = mysqli_connect($host, $user, $password, $database);
$txt=filter_input(INPUT_POST,"txt2");
$sql="UPDATE S$txt set NOTIFY=0;";
$con->query($sql);

?>	