<?php
$host="localhost";
$user="id6603518_teammalupet";
$passwrod="apjr4444";
$database="id6603518_stirectolibrary";
$con=mysqli_connect($host,$user,$passwrod,$database);
$sql="select * from user_info;";
$result=mysqli_query($con,$sql);
$response=array();
while($row=mysqli_fetch_array($result))
{
array_push($response,array("name"=>$row['name'],"user_name"=>$row['user_name'],"user_pass"=>$row['user_pass']));
}
echo json_encode(array("server_response"=>$response));
mysqli_close($con);
/* 
	items=new String[]{json_string};
			listItems=new ArrayList<>(Arrays.asList(items));
			adapter=new ArrayAdapter<String>(this, R.layout.row_layout,R.id.tx_name,listItems);
			listView.setAdapter(adapter); */
?>	