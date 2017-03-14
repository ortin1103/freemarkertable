<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title>Table</title>
</head>
<body>
<#--<table border="1">-->
    <#--<caption>Table</caption>-->
<table>
    </tr>
 <#list table as s>
     <tr> <td>  ${s.id} </td> </tr>
     <tr> <td>  ${s.time} </td> </tr>
     <tr> <td>  ${s.rand} </td> </tr>
     <#--<tr><td>${s.id}</td></tr>-->
 </#list>

</table>
</body>
</html>