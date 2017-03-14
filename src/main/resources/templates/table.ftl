<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title>Table</title>
</head>
<body>
<table border="1">
    <caption>Table</caption>
    <#--<tr>-->
        <#--<th>Id</th>-->
        <#--<th>Time</th>-->
        <#--<th>Random id</th>-->

    </tr>
 <#list table as s>
     <tr><td>${s.id}</td></tr>
 </#list>

</table>
</body>
</html>