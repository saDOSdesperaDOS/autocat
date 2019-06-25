<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="resources/css/style.css" rel="stylesheet">  
<title>result page</title>
</head>
<body>
<div id="div1">
<table border="1" width = "100%">
  <thead>
    <tr>
      <th>Код</th>
      <th>Производитель</th>
      <th>Наименование</th>
      <th>Цена</th>
      <th>Ед</th>
    </tr>
  </thead>
  <tbody>
   <tr>
  <td>
  ${modelAP.leaderCode}
    </td>
     <td>
  ${modelAP.manufacturer}
    </td>
     <td>
  ${modelAP.nomenklatura}
    </td>
     <td>
  ${modelAP.price}
    </td>
    <td>
  ${modelAP.unit}
    </td>
  </tr>
  
  </tbody>
</table>
<input type="button" onclick="history.back()" value = "Найти другую автозапчасть">
</div>
<div id="div2">
Возможные аналоги
</div>
<div id="div3">
Дополнительная информация

</div>
<div id="div4">
Цены поставщиков
</div>
</body>
</html>