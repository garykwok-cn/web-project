<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>web-project</title>
</head>
<body>
<div id="app">
    <h1>{{message1}}</h1>
    <h1>{{message2}}</h1>
</div>
<ul id="app1">
    <li v-for="item in items">
        {{ item.name }}
    </li>
</ul>
<script src="/scripts/common/vue.js"></script>
<script src="/scripts/common/jquery-1.11.3.min.js"></script>
<script src="/scripts/pages/main/index.js"></script>
</body>
</html>